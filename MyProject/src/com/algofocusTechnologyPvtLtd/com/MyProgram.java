package com.algofocusTechnologyPvtLtd.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
//import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/call")
public class MyProgram extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter your number");
		     long phone_Number=sc.nextLong();
		   String name = req.getParameter("name");
		   String dob = req.getParameter("dob");
		   String email = req.getParameter("email");
	   System.out.println( phone_Number);
		   
		  PrintWriter writer = resp.getWriter();
		   writer.println(name);
		   writer.println(dob);
		   writer.println(email);
		  writer.println("You are successfully submitted");
	  
		 
		   
	}

}
