package com.coyote.big_city_library.batch.feign_clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "BigCityLibrary-RestServer-loan", url = "localhost:9001", path = "/api/loans")
public interface LoanClient {
    
    @GetMapping("/batch/user-reminder")
    void  userLoanReminder(@RequestHeader("Authorization") String bearerJwt);
            
}
