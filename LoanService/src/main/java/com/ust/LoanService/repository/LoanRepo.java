package com.ust.LoanService.repository;

import com.ust.LoanService.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepo extends JpaRepository<Loan,Long> {
    List<Loan> findAllByBookId(Long bookId);
}
