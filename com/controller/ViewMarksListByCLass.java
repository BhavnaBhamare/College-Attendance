package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Classdetail;
import com.pojo.Division;
import com.pojo.Examtransaction;
import com.pojo.Examtype;
import com.pojo.Studentdetail;
import com.pojo.Subject;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class ViewMarksListByCLass
 */
@WebServlet("/ViewMarksListByCLass")
public class ViewMarksListByCLass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMarksListByCLass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BLmanager bl = new BLmanager();
		
		
		
		int examTypeId =1; //Integer.parseInt(request.getParameter("examType"));
		int subjectId = 1;//Integer.parseInt(request.getParameter("subjectName"));
		int classId = 1;//Integer.parseInt(request.getParameter("className"));
		int divId = 1;//Integer.parseInt(request.getParameter("divName"));

		Classdetail cd = bl.searchByClassId(classId);
		Division div = bl.searchByDivId(divId);
		Subject sub = bl.searchSubject(subjectId);
		Examtype etp = bl.searchExamType(examTypeId);
		
		

		List<Classdetail> l = bl.viewClassDetails();
		List<Division> l2 = bl.viewDivision();
		List<Subject> l3 = bl.searchBySubjectList();
		List<Examtype> l4 = bl.viewExamTypeList();

		List<Examtransaction> list = bl.searchByExamType(examTypeId, subjectId, classId, divId);
		List<Studentdetail> list2=bl.seachByStudList(cd.getClassName(), div.getDivName());
		
		System.out.println("subject "+l3.size());
		int n=l3.size();
		int i=0;
		
		for(Studentdetail e:list2){
			System.out.println(e.getStudName()+" ");
			
			Set<Examtransaction> s=e.getExamtransactions();
			
			for(i=0; i<=n; i++){
				for(Examtransaction etr:s){
				
				if(etr.getSubject().getId()!=l3.get(1).getId()){
					
				}else{
					System.out.print(etr.getSubject().getId()+"  "+etr.getExamTransPercentage()+" ");
					
				}
			}
			}
		}
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
