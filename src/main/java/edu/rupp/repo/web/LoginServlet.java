package edu.rupp.repo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.jsp").include(request, response);
		//from client
		String email    = request.getParameter("name");
		String password = request.getParameter("password");
		
		//Start Create mockup list of users info 10 records		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
	    ArrayList<User> emps = new ArrayList<User>();
	    try {
			emps.add(new User(1,"u1@c.com", "pass1", sdf.parse("2011-11-19"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\blue_sky_hill_small_lake_hd_picture_166027.jpg" ));
			emps.add(new User(2,"u2@c.com", "pass2", sdf.parse("2011-11-20"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\cute_little_rabbit_hd_picture_168915.jpg" ));
		    emps.add(new User(3,"u3@c.com", "pass3", sdf.parse("2011-11-21"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\cute_moufflon_baby_515730.jpg" ));
		    emps.add(new User(4,"u4@c.com", "pass4", sdf.parse("2011-11-22"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\goa_small_bird_202958.jpg" ));
		    emps.add(new User(5,"u5@c.com", "pass5", sdf.parse("2011-11-23"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\green_canopy_194243.jpg" ));
		    emps.add(new User(6,"u6@c.com", "pass6", sdf.parse("2011-11-24"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\green_lizard_199521.jpg" ));
		    emps.add(new User(7,"u7@c.com", "pass7", sdf.parse("2011-11-25"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\hedge_funds_182848.jpg" ));
		    emps.add(new User(8,"u8@c.com", "pass8", sdf.parse("2011-11-26"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\little_nutbrown_hare_highdefinition_picture_168891.jpg" ));	
		    emps.add(new User(9,"u9@c.com", "pass9", sdf.parse("2011-11-27"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\small_black_dog_hd_picture_168893.jpg" ));
		    emps.add(new User(10,"u10@c.com", "pass10", sdf.parse("2011-11-28"), "C:\\workspace\\servlet-jsp-html-exercise\\uploads\\small_stream_194877.jpg" ));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //END Create mockup list of users info 10 records
	    
		int valid = 0;
		for(User item:emps){
			if(password.equals(item.getPassword())){
				if(email.equals(item.getEmail())){
					out.print("Welcome, "+email);
					HttpSession session=request.getSession();
					//session.setAttribute("s_id",item.getId());
					session.setAttribute("s_email",item.getEmail());
					session.setAttribute("s_password",item.getPassword());
					session.setAttribute("s_createddate",item.getCreatedDate());
					session.setAttribute("s_urlphoto",item.getUrlPhoto());
					valid = 1;
					response.sendRedirect(request.getContextPath() + "/myProfile.jsp");
				}
			}
		}
		if(valid == 0){
			out.print("The email or passord you have entered doesn’t match any account!");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		
		out.close();
	}

}
