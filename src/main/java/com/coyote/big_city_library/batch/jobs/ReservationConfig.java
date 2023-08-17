package com.coyote.big_city_library.batch.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.coyote.big_city_library.batch.feign_clients.ReservationClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
public class ReservationConfig {

    @Autowired
    ReservationClient reservationClient;

    @Value("${jwt.big_city_library.rest_server}")
    String bearerJwt;

    @Scheduled(cron = "${cron.reservation_notification}", zone = "${cron.zone}")
    public void reservationNotification() {

        log.debug("Task : reservation-notification - " + System.currentTimeMillis() / 1000);

        reservationClient.reservationNotification(bearerJwt);
    }
}
