package com.ust.LoanService.feign;

import com.ust.LoanService.client.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="UserService",url="http://localhost:2004/users")
public interface UserClient {
    @GetMapping("/getusers")
    public List<User>getAllUsers();

}
