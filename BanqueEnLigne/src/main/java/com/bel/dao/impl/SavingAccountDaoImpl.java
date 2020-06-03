package com.bel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bel.dao.DaoFactory;
import com.bel.dao.IDao;
import com.bel.models.SavingAccount;

public class SavingAccountDaoImpl implements IDao{
	
private DaoFactory daoFactory; 
	
	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	private final String RQT_SAVINGACCOUNT_INSERT = "insert into savingAccount(idSavingAccount,accountNumber,accountBalance) values (?,?,?)";
	private final String RQT_SAVINGACCOUNT_UPDATE = "update savingAccount set accountNumber = ?, accountBalance = ? where idSavingAccount = ?";
	private final String RQT_SAVINGACCOUNT_DELETE = "delete from savingAccount where idSavingAccount = ?";
	private final String RQT_SAVINGACCOUNT_SELECT_ALL = "select * from savingAccount";
	private final String RQT_SAVINGACCOUNT_SELECT_BY_ID = "select * from savingAccount where idSavingAccount = ?";
	private final String SAVINGACCOUNT_ID_COLUMN = "idSavingAccountt";
	private final String SAVINGACCOUNT_ACCOUNTNUMBER_COLUMN = "accountNumber";
	private final String SAVINGACCOUNT_ACCOUNTBALANCE_COLUMN = "accountBalance";
	
	

	@Override
	public void create(Object objectToCreate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object objectToDelete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object objectToUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> findAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Object> allAccounts = new ArrayList<Object>();
		ResultSet rSet = daoFactory.executeSelect(RQT_SAVINGACCOUNT_SELECT_ALL);
		if(rSet != null && rSet.getFetchSize() > 0) {
			while(rSet.next()) {
				SavingAccount savingAccount = new SavingAccount();
				savingAccount.setIdSavingAccount(rSet.getLong(SAVINGACCOUNT_ID_COLUMN));
				savingAccount.setAccountNumber(rSet.getInt(SAVINGACCOUNT_ACCOUNTNUMBER_COLUMN));
				savingAccount.setAccountBalance(rSet.getBigDecimal(SAVINGACCOUNT_ACCOUNTBALANCE_COLUMN));
				
				allAccounts.add(savingAccount);
			}
		}
		return allAccounts;
		
		
		
		
		
	}

	@Override
	public List<Object> findAllById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
