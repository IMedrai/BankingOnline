package com.bel.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bel.dao.DaoFactory;
import com.bel.dao.IDao;
import com.bel.models.PrimaryAccount;


public class PrimaryAccoutDaoImpl implements IDao{
	
	private DaoFactory daoFactory; 
	
	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	private final String RQT_PRIMARYACCOUNT_INSERT = "insert into primaryAccount(idPrimaryAccount,accountNumber,accountBalance) values (?,?,?)";
	private final String RQT_PRIMARYACCOUNT_UPDATE = "update primaryAccount set accountNumber = ?, accountBalance = ? where idPrimaryAccount = ?";
	private final String RQT_PRIMARYACCOUNT_DELETE = "delete from primaryAccount where idPrimaryAccount = ?";
	private final String RQT_PRIMARYACCOUNT_SELECT_ALL = "select * from primaryAccount";
	private final String RQT_PRIMARYACCOUNT_SELECT_BY_ID = "select * from primaryAccount where idPrimaryAccount = ?";
	private final String PRIMARYACCOUNT_ID_COLUMN = "idPrimaryAccount";
	private final String PRIMARYACCOUNT_ACCOUNTNUMBER_COLUMN = "accountNumber";
	private final String PRIMARYACCOUNT_ACCOUNTBALANCE_COLUMN = "accountBalance";
	

	@Override
	public void create(Object objectToCreate) {
		// TODO Auto-generated method stub
		Object newAccount = new Object();
		
		newAccount = daoFactory.executeUpdate(RQT_PRIMARYACCOUNT_INSERT);
	
		newAccount.setLong(1, objectToCreate.getIdPrimaryAccount());
		newAccount.setSInt(2, objectToCreate.getAccountNumber());
		newAccount.setBigDecimal(3, objectToCreate.getAccountBalance());
		
		
	
		
		
		
		
		
	}

	@Override
	public void delete(Object objectToDelete) {
		// TODO Auto-generated method stub
		Object deleteAccount = new Object();
		deleteAccount = daoFactory.executeUpdate(RQT_PRIMARYACCOUNT_DELETE);
		
		
		
	}

	@Override
	public void update(Object objectToUpdate) {
		// TODO Auto-generated method stub
		
		
		
		
	
		
		
	}

	@Override
	public List<Object> findAll() throws SQLException {
		// TODO Auto-generated method stub
		
		
		List<Object> allPrimaryAccounts = new ArrayList<Object>();
		ResultSet rSet = daoFactory.executeSelect(RQT_PRIMARYACCOUNT_SELECT_ALL);
		if(rSet != null && rSet.getFetchSize() > 0) {
			while(rSet.next()) {
				PrimaryAccount primaryAccount = new PrimaryAccount();
				primaryAccount.setIdPrimaryAccount(rSet.getLong(PRIMARYACCOUNT_ID_COLUMN));
				primaryAccount.setAccountNumber(rSet.getInt(PRIMARYACCOUNT_ACCOUNTNUMBER_COLUMN));
				primaryAccount.setAccountBalance(rSet.getBigDecimal(PRIMARYACCOUNT_ACCOUNTBALANCE_COLUMN));
				
				allPrimaryAccounts.add(primaryAccount);
			}
		}
		return allPrimaryAccounts;
		
		
	
	}

	@Override
	public List<Object> findAllById(Long id) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		return null;
	}
	

}
