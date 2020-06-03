/**
 * 
 */
package com.bel.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ibrayche
 *
 */
public interface IDao {
	
	public void create(Object objectToCreate);
	public void delete(Object objectToDelete);
	public void update(Object objectToUpdate);
	public List<Object> findAll() throws SQLException;
	public List<Object> findAllById(Long id);
	
	
}
