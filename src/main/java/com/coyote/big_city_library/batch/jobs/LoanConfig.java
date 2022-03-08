package com.coyote.big_city_library.batch.jobs;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class LoanConfig {
    
    @Scheduled(cron = "${cron.user_loan_reminder}", zone = "${cron.zone}")
    public void userLoanReminder()  {
        System.out.println("Task : userLoanReminder - " + System.currentTimeMillis() / 1000);
    }
}
