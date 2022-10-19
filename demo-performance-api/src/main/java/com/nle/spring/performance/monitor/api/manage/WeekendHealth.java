package com.nle.spring.performance.monitor.api.manage;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class WeekendHealth implements HealthIndicator {
	 /* Please view lesson 02_02 for a detailed explanation of the below code */

    private final String message_key = "Play time?";

    @Override
    public Health health() {
        if (isWeekend()) {
            return Health.outOfService().withDetail(message_key, "Yes!").build();
        }
        return Health.up().withDetail(message_key, "Nope.").build();
    }

    private boolean isWeekend() {
        LocalDate today = LocalDate.now();
        int dow = DayOfWeek.from(today).getValue();
        switch (dow) {
            case 0:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }

    }
}
