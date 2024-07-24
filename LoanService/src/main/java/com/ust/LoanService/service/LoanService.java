package com.ust.LoanService.service;

import com.ust.LoanService.client.Book;
import com.ust.LoanService.client.User;
import com.ust.LoanService.feign.BookClient;
import com.ust.LoanService.feign.UserClient;
import com.ust.LoanService.model.Loan;
import com.ust.LoanService.repository.LoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LoanService {


    @Autowired
    private LoanRepo loanRepo;
    @Autowired
    private BookClient bookClient;
    @Autowired

    private UserClient userClient;

    public Loan addLoan(Loan loan) {
        return loanRepo.save(loan);
    }

    public List<Loan> getAllLoans() {
        return loanRepo.findAll();
    }




    public Book getByBookId(Long bookId) {
        return bookClient.getBookById(bookId);
    }


    public List<User> getAllUsers() {
        return userClient.getAllUsers();
    }
}
