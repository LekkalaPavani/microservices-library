package com.ust.LoanService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Loan")
public class Loan {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long loanId;
public Long bookId;
public Long userId;
    public Date loanDate;
    public String status;


}
