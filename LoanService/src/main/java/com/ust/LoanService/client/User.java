package com.ust.LoanService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    public Long useId;
    public String name;
    public String email;
    public String phonenumber;

}
