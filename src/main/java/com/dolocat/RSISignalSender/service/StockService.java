package com.dolocat.RSISignalSender.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Service
//public class StockService {
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    public String fetchStockData(String ticker) {
//        String apiUrl = "https://api.example.com/stock/" + ticker; // Replace with actual API URL
//        return restTemplate.getForObject(apiUrl, String.class);
//    }
//}

@Service
public class StockService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${alphaVantage.apiKey}")
    private String apiKey;

    public Double fetchLatestWeeklyRsi(String ticker) {
        String url = "https://www.alphavantage.co/query?function=RSI&symbol=" + ticker
                + "&interval=weekly&time_period=14&series_type=close&apikey=" + apiKey;

        String response = restTemplate.getForObject(url, String.class);
        return getLatestRsiResponse(response);
    }

    private Double getLatestRsiResponse(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);
        JSONObject rsiData = jsonObject.getJSONObject("Technical Analysis: RSI");

        // Get the latest entry (most recent date)
        String latestDate = rsiData.keys().next(); // This gets the first key (date) in the object
        return rsiData.getJSONObject(latestDate).getDouble("RSI");
    }
}
