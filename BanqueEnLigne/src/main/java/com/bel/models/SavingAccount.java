package com.bel.models;

import java.math.BigDecimal;



public class SavingAccount {
	private Long idSavingAccount;
    private int accountNumber;
    private BigDecimal accountBalance;
    
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdSavingAccount() {
		return idSavingAccount;
	}

	public void setIdSavingAccount(Long id) {
		this.idSavingAccount = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public SavingAccount(Long idSavingAccount, int accountNumber, BigDecimal accountBalance) {
		super();
		this.idSavingAccount = idSavingAccount;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [idSavingAccount=" + idSavingAccount + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ "]";
	}
	
	
    
}
