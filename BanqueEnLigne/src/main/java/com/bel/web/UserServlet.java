package com.bel.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bel.dao.IDao;
import com.bel.models.User;


/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/getAllusers")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	private IDao iDao;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> listUsers = new ArrayList<User>();
		List<Object> allUsers = null;
		try {
			allUsers = iDao.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(allUsers != null && !allUsers.isEmpty()) {
			for(Object objUser : allUsers) {
				User user = new User();
				user = (User)objUser;
				listUsers.add(user);
			}
		}
		request.setAttribute("allUsers", listUsers);
		
		this.getServletContext().getRequestDispatcher("users.jsp").forward(request, response);
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
