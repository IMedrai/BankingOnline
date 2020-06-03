package com.bel.models;

import java.math.BigDecimal;

public class PrimaryAccount {
	
	private Long idPrimaryAccount;
    private int accountNumber;
    private BigDecimal accountBalance;
    
    
    
    
	public PrimaryAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdPrimaryAccount() {
		return idPrimaryAccount;
	}
	public void setIdPrimaryAccount(Long id) {
		this.idPrimaryAccount = id;
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
	
	
	public PrimaryAccount(Long idPrimaryAccount, int accountNumber, BigDecimal accountBalance) {
		super();
		this.idPrimaryAccount = idPrimaryAccount;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "PrimaryAccount [id=" + idPrimaryAccount + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ "]";
	}

}
