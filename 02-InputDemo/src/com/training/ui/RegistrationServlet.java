package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Customer;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/cReg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Customer customer = new Customer();

		String strId = request.getParameter("textId");
		if (strId != null) {
			int id = Integer.parseInt(strId);
			customer.setId(id);
		}

		String strName = request.getParameter("textName");
		if (strName != null) {

			customer.setName(strName);
		}

		String strGender = request.getParameter("radGender");
		if (strGender != null) {
			int gender = Integer.parseInt(strGender);
			customer.setGender(gender);
		}

		String strIsPriviliged = request.getParameter("chkPriviliged");
		if (strIsPriviliged == null) {
			customer.setPriviliged(false);
		} else {
			if (strIsPriviliged.equals("Yes")) {
				customer.setPriviliged(true);
				
			}
		}

		String strEmail = request.getParameter("textEmail");
		if (strEmail != null) {
			customer.setEmail(strEmail);
			
		}

		String strPhone = request.getParameter("textPhoneNumber");
		if (strPhone.matches("[7-9]{1}[0-9]{9}")) {
			customer.setPhone(strPhone);
			
		}

		String address = request.getParameter("textAddress");
		if (address != null) {
			customer.setAddress(address);
			
		}
		
		String strDoj = request.getParameter("textdoj");
		if (strDoj != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date doj;
			try {
				doj = sdf.parse(strDoj);
				customer.setDateOfJoining(doj);
				
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
		}
		
		String strDesc = request.getParameter("textDesc");
		if (strDesc != null) {
			customer.setDescription(strDesc);
			
		} 
		
		String strBal = request.getParameter("textBal");
		if (strBal != null) {
			double balance = Double.parseDouble(strBal);
			customer.setBalancAmt(balance);
			
		}
		
		String strRating = request.getParameter("textRating");
		if (strRating != null) {
			int rating = Integer.parseInt(strRating);
			customer.setCustomerRating(rating);
			
		}
		out.println(customer.getId());
		out.println(customer.getName());
		out.println(customer.getGender());
		out.println(customer.getEmail());
		out.println(customer.getPhone());
		out.println(customer.getAddress());
		out.println(customer.getDateOfJoining());
		out.println(customer.isPriviliged());
		out.println(customer.getDescription());
		out.println(customer.getBalancAmt());
		out.println(customer.getCustomerRating());
	}

}
