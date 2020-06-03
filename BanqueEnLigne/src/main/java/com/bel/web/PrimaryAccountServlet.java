package com.bel.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bel.dao.IDao;
import com.bel.models.PrimaryAccount;


/**
 * Servlet implementation class PrimaryAccountServlet
 */
@WebServlet("/PrimaryAccountServlet")

public class PrimaryAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IDao iDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimaryAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
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
	
		
		
		
		List<PrimaryAccount> listPrimaryAccounts = new ArrayList<PrimaryAccount>();
		List<Object> allPrimaryAccounts = null;
		try {
			allPrimaryAccounts = iDao.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(allPrimaryAccounts != null && !allPrimaryAccounts.isEmpty()) {
			for(Object objPrimaryAccounts : allPrimaryAccounts) {
				PrimaryAccount primaryAccount = new PrimaryAccount();
				primaryAccount = (PrimaryAccount)objPrimaryAccounts;
				listPrimaryAccounts.add(primaryAccount);
			}
		}
		request.setAttribute("allPrimaryAccounts", listPrimaryAccounts);
		
		this.getServletContext().getRequestDispatcher("primaryAccounts.jsp").forward(request, response);
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
