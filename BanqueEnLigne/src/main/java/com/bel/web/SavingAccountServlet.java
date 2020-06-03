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
import com.bel.models.SavingAccount;

/**
 * Servlet implementation class SavingAccountServlet
 */

@WebServlet("/SavingAccountServlet")
public class SavingAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDao iDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SavingAccountServlet() {
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
		
		List<SavingAccount> listSavingAccounts = new ArrayList<SavingAccount>();
		List<Object> allSavingAccounts = null;
		try {
			allSavingAccounts = iDao.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(allSavingAccounts != null && !allSavingAccounts.isEmpty()) {
			for(Object objSavingAccounts : allSavingAccounts) {
				SavingAccount savingAccount = new SavingAccount();
				savingAccount = (SavingAccount)objSavingAccounts;
				listSavingAccounts.add(savingAccount);
			}
		}
		request.setAttribute("allSavingAccounts", listSavingAccounts);
		
		this.getServletContext().getRequestDispatcher("savingAccounts.jsp").forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
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
