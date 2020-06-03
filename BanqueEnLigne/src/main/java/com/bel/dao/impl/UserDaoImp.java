/**
 * 
 */
package com.bel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bel.dao.DaoFactory;
import com.bel.dao.IDao;
import com.bel.models.User;

/**
 * @author ibrayche
 *
 */
public class UserDaoImp implements IDao {
	
	private DaoFactory daoFactory; 
	
	
	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	private final String RQT_USER_INSERT = "insert into user (idUser, nomUser, prenomUser, loginUser, pwdUser, gsmUser, emailUser) values (?,?,?,?,?,?)";
	private final String RQT_USER_UPDATE = "update user set nomUser = ?, prenomUser = ?, loginUser = ?, pwdUser = ?, gsmUser = ?, emailUser = ? where idUser = ?";
	private final String RQT_USER_DELETE = "delete from user where idUser = ?";
	private final String RQT_USER_SELECT_ALL = "select * from user";
	private final String RQT_USER_SELECT_BY_ID = "select * from user where idUser = ?";
	private final String USER_ID_COLUMN = "idUser";
	private final String USER_NOM_COLUMN = "nomUser";
	private final String USER_PRENOM_COLUMN = "prenomUser";
	private final String USER_LOGIN_COLUMN = "loginUser";
	private final String USER_PWD_COLUMN = "pwdUser";
	private final String USER_GSM_COLUMN = "gsmUser";
	private final String USER_EMAIL_COLUMN = "emailUser";
	

	public void create(Object objectToCreate) {
		

	}

	public void delete(Object objectToDelete) {
		

	}

	public void update(Object objectToUpdate) {
		

	}

	public List<Object> findAll() throws SQLException {
		List<Object> allUsers = new ArrayList<Object>();
		ResultSet rSet = daoFactory.executeSelect(RQT_USER_SELECT_ALL);
		if(rSet != null && rSet.getFetchSize() > 0) {
			while(rSet.next()) {
				User user = new User();
				user.setIdUser(rSet.getLong(USER_ID_COLUMN));
				user.setNomUser(rSet.getString(USER_NOM_COLUMN));
				user.setPrenomUser(rSet.getString(USER_PRENOM_COLUMN));
				user.setLoginuser(rSet.getString(USER_LOGIN_COLUMN));
				user.setEmailUser(rSet.getString(USER_EMAIL_COLUMN));
				user.setGsmUser(rSet.getString(USER_GSM_COLUMN));
				user.setPwdUser(rSet.getString(USER_PWD_COLUMN));
				allUsers.add(user);
			}
		}
		return allUsers;
	}

	public List<Object> findAllById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
