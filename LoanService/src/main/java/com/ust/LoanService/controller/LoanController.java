package com.ust.LoanService.controller;

import com.ust.LoanService.client.Book;
import com.ust.LoanService.client.User;
import com.ust.LoanService.feign.BookClient;
import com.ust.LoanService.model.Loan;
import com.ust.LoanService.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

@Autowired
    private LoanService loanService;


@Autowired
private BookClient bookClient;

@PostMapping("/Addloans")
    public ResponseEntity<Loan> addLoan(@RequestBody Loan loan){
    return ResponseEntity.ok(loanService.addLoan(loan));
}
@GetMapping("/getAllLoans")
    public ResponseEntity<List<Loan>> getAllLoans(){
    return ResponseEntity.ok(loanService.getAllLoans());
}

    @GetMapping("/{bookId}")
    public Book getLoansByBookId(@PathVariable Long bookId) {
        return loanService.getByBookId(bookId);
    }

@GetMapping("/allUsers")
    public List<User> getAllUsers(){
    return loanService.getAllUsers();

}}



