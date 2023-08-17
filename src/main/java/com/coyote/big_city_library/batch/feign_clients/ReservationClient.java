package com.coyote.big_city_library.batch.feign_clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "BigCityLibrary-RestServer-reservation", url = "localhost:9001", path = "/api/reservations")
public interface ReservationClient {

    @GetMapping("/batch/reservation-notification")
    void reservationNotification(@RequestHeader("Authorization") String bearerJwt);

}
