package com.qa;

import java.util.Arrays;

public class Account implements Comparable<Account> {

    private String CardTypes[];
    private String sortCode;
    private String accountNumber;
    private String password;

    public Account(String[] cardTypes, String sortCode, String accountNumber, String password) {
        super();
        CardTypes = cardTypes;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String[] getCardTypes() {
        return CardTypes;
    }

    public void setCardTypes(String[] cardTypes) {
        CardTypes = cardTypes;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "CardTypes=" + Arrays.toString(CardTypes) +
                ", sortCode='" + sortCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(Account thatAct) {
        if(Arrays.asList(this.CardTypes).contains(thatAct.CardTypes[0]))
            if(this.sortCode.equals(thatAct.sortCode))
                if(this.accountNumber.equals(thatAct.accountNumber))
                    if(this.password.equals(thatAct.password))
                    {
                        return 0;  // Login Success
                    }
        return -1;  // Login fails
    }
}
