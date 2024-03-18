package com.dolocat.RSISignalSender.controller;

import com.dolocat.RSISignalSender.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/rsi/{ticker}")
    public Double getWeeklyRsi(@PathVariable String ticker) {
        return stockService.fetchLatestWeeklyRsi(ticker);
    }
}
