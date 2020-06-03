/**
 * 
 */
package com.bel.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


/**
 * @author ibrayche
 * Singleton
 *
 */
public class DaoFactory {
	private static final String FILE_PROP = "/com/bel/dao/dao.properties";
	private static final String URL_PROP = "url";
	private static final String DRIVER_PROP = "driver";
	private static final String USER_NAME_PROP = "username";
	private static final String PWD_PROP = "password";
	private String url;
	private String userName;
	private String password;
	
	private Connection cnx;
	
	PreparedStatement pState = null;
	ResultSet rSet = null;
	
	
	
	
	public Connection getCnx() {
		return cnx;
	}

	public void setCnx(Connection cnx) {
		this.cnx = cnx;
	}
	
	

	public DaoFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DaoFactory(String u, String un, String pwd) {
		this.url = u;
		this.userName = un;
		this.password = pwd;
	}
	
	public static DaoFactory getInstance() throws DAOConfigurationException, SQLException{
		Properties prop = new Properties();
		String url;
		String userName;
		String driver;
		String pwd;
		ClassLoader cLoader = Thread.currentThread().getContextClassLoader();
		InputStream fichierProp = cLoader.getResourceAsStream(FILE_PROP);
		if(fichierProp == null){
			throw new DAOConfigurationException("the file "+FILE_PROP+" is invalide !");
		}
		try{
			prop.load(fichierProp);
			url = prop.getProperty(URL_PROP);
			driver = prop.getProperty(DRIVER_PROP);
			userName = prop.getProperty(USER_NAME_PROP);
			pwd = prop.getProperty(PWD_PROP);
		}catch(IOException e){
			throw new DAOConfigurationException("Impossible to open the file "+FILE_PROP+e);
		}
		try{
			Class.forName(driver);
		}catch(ClassNotFoundException e){
			throw new DAOConfigurationException("Impossible to load Connection driver"+DRIVER_PROP+e);
		}
		DaoFactory instance = new DaoFactory(url,userName,pwd);
		instance.getConnection();
		return instance;
	}
	public void getConnection() throws SQLException {
		DriverManager.getConnection( url, userName, password );
		
	}
	
	public ResultSet executeSelect(String request) throws SQLException{
		if(cnx == null || cnx.isClosed()) {
			this.getConnection();
		}
		pState = cnx.prepareStatement(request);
		rSet = pState.executeQuery();
		return rSet;
	}
}
