package com.rafademetrio.hroauth.feignclients;

import com.rafademetrio.hroauth.entities.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

    //uses the same method declared into 'User' resource that you need to use
    @GetMapping(value = "/search")
    ResponseEntity<User> findByEmail(@RequestParam String email);


}
