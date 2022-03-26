package com.simplilearn.servlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.simplilearn.entity.Product;
import com.simplilearn.util.Hibernate;

/**
 * Servlet implementation class ProductInsert
 */
@WebServlet("/productInsert")
public class ProductInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Map<String, String> dbMessages = new HashMap<String, String>();
		
		Session session = Hibernate.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Product p1 = new Product(Integer.parseInt(request.getParameter("productId")), request.getParameter("productName"));
		session.save(p1);
		tx.commit();
		
		dbMessages.put("success", "Product inserted");
	
		request.setAttribute("dbMessages", dbMessages);
		request.getRequestDispatcher("productform.jsp").forward(request,response);
	}

	}
