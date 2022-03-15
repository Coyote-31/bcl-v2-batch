package com.coyote.big_city_library.batch.jobs;

import com.coyote.big_city_library.batch.feign_clients.LoanClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
public class LoanConfig {

    @Autowired
    LoanClient loanClient;

    @Value("${jwt.big_city_library.rest_server}")
    String bearerJwt;
    
    @Scheduled(cron = "${cron.user_loan_reminder}", zone = "${cron.zone}")
    public void userLoanReminder()  {

        log.debug("Task : userLoanReminder - " + System.currentTimeMillis() / 1000);
        loanClient.userLoanReminder(bearerJwt);
    }
}
