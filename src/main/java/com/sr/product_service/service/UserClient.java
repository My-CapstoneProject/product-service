package com.sr.product_service.service;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sr.product_service.pojo.UserPojo;

@FeignClient(name = "user-service", url = "http://localhost:9099/users")
public interface UserClient {
	@GetMapping("/{userId}")
	Optional<UserPojo> findByUserId(@PathVariable int id);

}
