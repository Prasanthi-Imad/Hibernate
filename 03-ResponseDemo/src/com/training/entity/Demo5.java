package com.training.entity;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo5
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
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
		Set<Player> players = new HashSet<>();
		Player p1 = new Player(10,"Akhil",10,117,17,false);
		Player p2 = new Player(11,"Ravi",11,157,57,true);
		Player p3 = new Player(12,"Sandeep",119,90,18,false);
		Player p4 = new Player(13,"DeepKiran",126,80,26,false);
		Player p5 = new Player(14,"Chaitanya",103,100,13,false);
		Player p6 = new Player(15,"Vamsi",14,145,14,false);
		Player p7 = new Player(16,"Anil",13,167,19,false);
		Player p8 = new Player(17,"Kushal",12,172,17,false);
		Player p9 = new Player(18,"Bharath",11,168,16,false);
		Player p10 = new Player(19,"Vijay",9,115,22,false);
		Player p11 = new Player(20,"Harsha",8,120,26,false);
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		players.add(p10);
		players.add(p11);
		
		PrintWriter out = response.getWriter();
		
		out.println("<link href = 'Style.css' rel = 'Stylesheet' >");
		out.println("<table border= '1'>");

		out.println("<tr>");
		out.println("<th>Player ID</th>");
		out.println("<th>Player Name</th>");
		out.println("<th>No. of Matches</th>");
		out.println("<th>Total Runs Scored</th>");
		out.println("<th>No. of Wickets</th>");
		out.println("<th>Captain</th>");
		out.println("<th>Batting Rating</th>");
		out.println("<th>Bowling Rating</th>");
		out.println("</tr>");
		/*Player p = new Player();*/
		for (Player p : players) {
			
				out.println("<tr>");
				out.println("<td>"+p.getPlayerId()+"</td>");
				out.println("<td>"+p.getPlayerName()+"</td>");
				out.println("<td>"+p.getNumOfmatches()+"</td>");
				out.println("<td>"+p.getTotalRunsScored()+"</td>");
				out.println("<td>"+p.getNumOfWickets()+"</td>");
				out.println("<td>"+p.captain+"</td>");
				out.println("<td>"+p.getBattingRating()+"</td>");
				out.println("<td>"+p.getBowlingRating()+"</td>");
				out.println("</tr>");
				
			}
		
		out.println("</table>");
		
		
		
	}

}
