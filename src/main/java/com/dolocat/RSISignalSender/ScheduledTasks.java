package com.dolocat.RSISignalSender;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Scheduled(cron = "0 0 10 * * MON") // Every Monday at 10 AM
    public void performTask() {
        // Logic for fetching stock data, calculating RSI and sending email
    }
}
