

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MovieBusinessLayer.*;
import MovieClassLayer.*;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	
	Films Filmdata = new Films();
	private static final long serialVersionUID = 1L;
	String s; 
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processResponse(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		response.getWriter().println();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		

		MovieBusinessLayer mbl = new MovieBusinessLayer();
		PrintWriter out=  response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); 
		String FilmNameList = request.getParameter("FilmNameList");
		String DirectorNameList = request.getParameter("DirectorNameList");
		String ActorNameList = request.getParameter("ActorNameList");
 
		System.out.println("FilmNameList= "+FilmNameList +" DirectorNameList ="+DirectorNameList+" ActorNameList = "+ActorNameList);

		if (FilmNameList == null || FilmNameList.equals("") && DirectorNameList == null || DirectorNameList.equals("") && ActorNameList == null || ActorNameList.equals("")) {
			System.out.println("everything");
			Filmdata = mbl.GetFilmsFromCSV("C:\\Everything\\Capita\\NovusMovieProject\\MovieDataLayer\\TestData.csv");
		}
		if(FilmNameList == null || FilmNameList.equals("")){
			System.out.println("null 65");
		}
		else
		{
			System.out.println("Film");
			 Filmdata=mbl.GetFilmSubsetByMovieID(Filmdata, FilmNameList);
		}
		if (DirectorNameList == null || DirectorNameList.equals("")) {
			System.out.println("null 73");

		}
		else{
			System.out.println("Director");

			Filmdata=mbl.GetFilmSubsetByDirectorID(Filmdata, DirectorNameList);
		}
		if (ActorNameList == null || ActorNameList.equals("")){
			System.out.println("null 82");
		}
		else{
			System.out.println("Actor");

			Filmdata=mbl.GetFilmSubsetByActorID(Filmdata, ActorNameList);
		}
		request.setAttribute("Filmdatarequest", Filmdata);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
