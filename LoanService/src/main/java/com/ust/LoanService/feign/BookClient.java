package com.ust.LoanService.feign;


import com.ust.LoanService.client.Book;
import com.ust.LoanService.model.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="BookService",url="http://localhost:2003/books")
public interface BookClient {

    @GetMapping("/getbook/{id}")
    Book getBookById(@PathVariable Long id);






}
