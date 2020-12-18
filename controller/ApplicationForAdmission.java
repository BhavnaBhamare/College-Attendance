package com.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.model.BlManagerAdmission;
import com.pojo.Address;
import com.pojo.Applicationforadmission;
import com.pojo.Bachelordetail;
import com.pojo.Branch;
import com.pojo.Course;
import com.pojo.Diplomadetail;
import com.pojo.Hscdetail;
import com.pojo.Masterdetail;
import com.pojo.Registration;
import com.pojo.Sscdetail;
import com.pojo.Uploadeddocuments;

/**
 * Servlet implementation class ApplicationForAdmission
 */
@WebServlet("/ApplicationForAdmission")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*70,      // 10MB
  maxRequestSize=1024*1024*100)

public class ApplicationForAdmission extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BlManagerAdmission bl = new BlManagerAdmission();
	Applicationforadmission ap = new Applicationforadmission();
	Applicationforadmission appId = new Applicationforadmission();
	Address ad = new Address(), ad1 = new Address();
	Registration reg = new Registration();
	Branch b = new Branch();
	Course c = new Course();
	Sscdetail ssc = new Sscdetail(), ssc1 = new Sscdetail();
	Hscdetail hsc = new Hscdetail(), hsc1 = new Hscdetail();
	Diplomadetail dip = new Diplomadetail(), dip1 = new Diplomadetail();
	Bachelordetail bach = new Bachelordetail(), bach1 = new Bachelordetail();
	Masterdetail mast = new Masterdetail(), mast1 = new Masterdetail();
	Uploadeddocuments upl = new Uploadeddocuments(), upl1 = new Uploadeddocuments();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApplicationForAdmission() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession s1 = request.getSession();
		reg = (Registration) s1.getAttribute("RegisteredStudent");

		System.out.println(reg.getRegDob());

		String firstName = request.getParameter("firstname");
		String middleName = request.getParameter("middlename");
		System.out.println(firstName);
		String lastName = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String applicantAge = request.getParameter("age1");
		System.out.println(applicantAge);
		int age = Integer.parseInt(applicantAge);
		String emailId = request.getParameter("emailid");
		String bloodGroup = request.getParameter("bloodgroup");
		String motherTounge = request.getParameter("mothertounge");
		String nativePlace = request.getParameter("nativeplace");
		String fatherName = request.getParameter("fathername");
		String fatherOccupation = request.getParameter("fatheroccupation");
		String motherName = request.getParameter("mothername");
		String motherOccupation = request.getParameter("motheroccupation");
		String annualincome = request.getParameter("annualincome");
		double annualIncome = Double.parseDouble(annualincome);
		String nationality = request.getParameter("nationality");
		String religion = request.getParameter("religion");
		String caste = request.getParameter("caste");
		String category = request.getParameter("category");
		String hostel = request.getParameter("hostel");
		String transport = request.getParameter("transport");

		String currentAddress = request.getParameter("currentaddress");
		String currentStreet = request.getParameter("currentstreet");
		String currentCity = request.getParameter("currentcity");
		String currentzipcode = request.getParameter("currentzipcode");
		int currentZipcode = Integer.parseInt(currentzipcode);
		String currentState = request.getParameter("currentstate");
		String currentCountry = request.getParameter("currentcountry");
		String permanantAddress = request.getParameter("permanantaddress");
		String permanantStreet = request.getParameter("permanantstreet");
		String permanantCity = request.getParameter("permanantcity");
		String permanantzipcode = request.getParameter("permanantzipcode");
		int permanantZipcode = Integer.parseInt(permanantzipcode);
		String permanantState = request.getParameter("permanantstate");
		String permanantCountry = request.getParameter("permanantcountry");
		String mobilenumber = request.getParameter("mobilenumber");
		Long mobileNumber = Long.parseLong(mobilenumber);
		String mobilenumber2 = request.getParameter("mobilenumber2");
		Long AlternatemobileNumber = Long.parseLong(mobilenumber2);

		String selectedCourse = request.getParameter("selectedCourse");
		String selectedBranch = request.getParameter("selectedBranch");

		String SSCschoolname = request.getParameter("SSCschoolname");
		String SSCschoolcity = request.getParameter("SSCschoolcity");
		String SSCPercentage = request.getParameter("SSCpercentage");
		double SSCpercentage = Double.parseDouble(SSCPercentage);
		String SSCyearOfpassing = request.getParameter("SSCyearofpassing");
		System.out.println(SSCyearOfpassing);
		int SSCyearofpassing = Integer.parseInt(SSCyearOfpassing);
		String SSCboard = request.getParameter("SSCboard");
		String SSCSeatnumber = request.getParameter("SSCseatnumber");

		String HSCbackground = request.getParameter("HSCbackground");
		String HSCschoolname = request.getParameter("HSCschoolname");
		String HSCschoolcity = request.getParameter("HSCschoolcity");
		String HSCPercentage = request.getParameter("HSCpercentage");
		double HSCpercentage = Double.parseDouble(HSCPercentage);
		String HSCyearOfpassing = request.getParameter("HSCyearofpassing");
		int HSCyearofpassing = Integer.parseInt(HSCyearOfpassing);
		String HSCboard = request.getParameter("HSCboard");
		String HSCSeatnumber = request.getParameter("HSCseatnumber");

		String diplomacourse = request.getParameter("diplomacourse");
		String diplomaothercourse = request.getParameter("diplomaothercourse");
		String diplomaclgname = request.getParameter("diplomaclgname");
		String diplomaclgcode = request.getParameter("diplomaclgcode");
		String diplomaclgcity = request.getParameter("diplomaclgcity");
		String diplomaclgZipcode = request.getParameter("diplomaclgzipcode");
		int diplomaclgzipcode = Integer.parseInt(diplomaclgZipcode);
		String diplomauniversity = request.getParameter("diplomauniversity");
		String diplomaenrollmentno = request.getParameter("diplomaenrollmentno");
		String diplomaPercentage = request.getParameter("diplomapercentage");
		double diplomapercentage = Double.parseDouble(diplomaPercentage);
		String diplomayearOfpassing = request.getParameter("diplomayearofpassing");
		int diplomayearofpassing = Integer.parseInt(diplomayearOfpassing);

		String bachelorcourse = request.getParameter("bachelorcourse");
		String bachelorothercourse = request.getParameter("bachelorothercourse");
		String bachelorclgname = request.getParameter("bachelorclgname");
		String bachelorclgcode = request.getParameter("diplomaclgcode");
		String bachelorclgcity = request.getParameter("bachelorclgcity");
		String bachelorclgZipcode = request.getParameter("bachelorclgzipcode");
		int bachelorclgzipcode = Integer.parseInt(bachelorclgZipcode);
		String bacheloruniversity = request.getParameter("bacheloruniversity");
		String bachelorenrollmentno = request.getParameter("bachelorenrollmentno");
		String bachelorPercentage = request.getParameter("bachelorpercentage");
		double bachelorpercentage = Double.parseDouble(bachelorPercentage);
		String bacheloryearOfpassing = request.getParameter("bacheloryearofpassing");
		int bacheloryearofpassing = Integer.parseInt(bacheloryearOfpassing);

		String mastercourse = request.getParameter("mastercourse");
		String masterothercourse = request.getParameter("masterothercourse");
		String masterclgname = request.getParameter("masterclgname");
		String masterclgcode = request.getParameter("masterclgcode");
		String masterclgcity = request.getParameter("masterclgcity");
		String masterclgZipcode = request.getParameter("masterclgzipcode");
		int masterclgzipcode = Integer.parseInt(masterclgZipcode);
		String masteruniversity = request.getParameter("masteruniversity");
		String masterenrollmentno = request.getParameter("masterenrollmentno");
		String masterPercentage = request.getParameter("masterpercentage");
		double masterpercentage = Double.parseDouble(masterPercentage);
		String masteryearOfpassing = request.getParameter("masteryearofpassing");
		int masteryearofpassing = Integer.parseInt(masteryearOfpassing);

		Part part1 = request.getPart("studentphotograph");
		System.out.println(part1);
		Part part2 = request.getPart("studentdigsignature");
		Part part3 = request.getPart("studentageproof");
		Part part4 = request.getPart("studentcastcategrycerti");
		Part part5 = request.getPart("studentbplcerti");
		Part part6 = request.getPart("studentSSCmarksheet");
		Part part7 = request.getPart("studentHSCmarksheet");
		Part part8 = request.getPart("studentdiplomacerti");
		Part part9 = request.getPart("studentbachelorcerti");
		Part part10 = request.getPart("studentmastercerti");

		ap.setRegistration(reg);
		ap.setApplicantFirstName(firstName);
		ap.setApplicantMiddleName(middleName);
		ap.setApplicantLastName(lastName);
		ap.setApplicantDob(reg.getRegDob());
		ap.setApplicantAge(age);
		ap.setApplicatantEmailId(emailId);
		ap.setApplicantNativePlace(nativePlace);
		ap.setApplicantGender(gender);
		ap.setApplicantBloodgroup(bloodGroup);
		ap.setApplicantMotherTongue(motherTounge);
		ap.setApplicatantFatherName(fatherName);
		ap.setApplicatantFatherOccupation(fatherOccupation);
		ap.setApplicatantMotherName(motherName);
		ap.setApplicatantMotherOccupation(motherOccupation);
		ap.setAnnualIncome(annualIncome);
		ap.setApplicatantNationality(nationality);
		ap.setApplicatantReligion(religion);
		ap.setApplicatantCaste(caste);
		ap.setApplicatantCategory(category);
		ap.setHostelFacility(hostel);
		ap.setTransportationFacility(transport);

		ad.setCurrentAddress(currentAddress);
		ad.setCurrentStreet(currentStreet);
		ad.setCurrentCity(currentCity);
		ad.setCurrentZipCode(currentZipcode);
		ad.setCurrentState(currentState);
		ad.setCurrentCountry(currentCountry);
		ad.setPermanentAddress(permanantAddress);
		ad.setPermanentStrret(permanantStreet);
		ad.setPermanentCity(permanantCity);
		ad.setPermanentZipCode(permanantZipcode);
		ad.setPermanentState(permanantState);
		ad.setPermanentCountry(permanantCountry);
		ad.setMobileNumber(mobileNumber);
		ad.setAlternateMobileNumber(AlternatemobileNumber);

		int adId = bl.InsertApplicantAddress(ad);
		ad1 = bl.fetchStoredStudentAddress(adId);
		ap.setAddress(ad1);

		Branch b1 = bl.MatchBranch(selectedBranch);
		System.out.println(b1);
		ap.setBranch(b1);

		Course c1 = bl.MatchCourse(selectedCourse);
		System.out.println(c1);
		ap.setCourse(c1);

		ssc.setSscschoolName(SSCschoolname);
		ssc.setCity(SSCschoolcity);
		ssc.setPercentage(SSCpercentage);
		ssc.setPassingYear(SSCyearofpassing);
		ssc.setBoard(SSCboard);
		ssc.setSscseatNumber(SSCSeatnumber);

		int sscId = bl.InsertApplicantSSCDetail(ssc);
		ssc1 = bl.fetchStoredStudentSSCDetail(sscId);
		ap.setSscdetail(ssc1);

		hsc.setEducationBackground(HSCbackground);
		hsc.setHscschoolName(HSCschoolname);
		hsc.setCity(HSCschoolcity);
		hsc.setPercentage(HSCpercentage);
		hsc.setPassingYear(HSCyearofpassing);
		hsc.setBoard(HSCboard);
		hsc.setHscseatNumber(HSCSeatnumber);

		int hscId = bl.InsertApplicantHSCDetail(hsc);
		hsc1 = bl.fetchStoredStudentHSCDetail(hscId);
		ap.setHscdetail(hsc1);

		dip.setDiplomaCourse(diplomaothercourse);
		dip.setCollegeName(diplomaclgname);
		dip.setCollegeCode(diplomaclgcode);
		dip.setCity(diplomaclgcity);
		dip.setZipCode(diplomaclgzipcode);
		dip.setUniversity(diplomauniversity);
		dip.setPercentage(diplomapercentage);
		dip.setPassingYear(diplomayearofpassing);
		dip.setEnrollmentNumber(diplomaenrollmentno);

		int dipId = bl.InsertApplicantDiplomaDetail(dip);
		dip1 = bl.fetchStoredStudentDiplomaDetail(dipId);
		ap.setDiplomadetail(dip1);

		bach.setBachelorCourse(bachelorothercourse);
		bach.setCollegeName(bachelorclgname);
		bach.setCollegeCode(bachelorclgcode);
		bach.setCity(bachelorclgcity);
		bach.setZipCode(bachelorclgzipcode);
		bach.setUniversity(bacheloruniversity);
		bach.setPercentage(bachelorpercentage);
		bach.setPassingYear(bacheloryearofpassing);
		bach.setEnrollmentNumber(bachelorenrollmentno);

		int bachId = bl.InsertApplicantBachelorDetail(bach);
		bach1 = bl.fetchStoredStudentBachelorDetail(bachId);
		ap.setBachelordetail(bach1);

		mast.setMasterCourse(masterothercourse);
		mast.setCollegeName(masterclgname);
		mast.setCollegeCode(masterclgcode);
		mast.setCity(masterclgcity);
		mast.setZipCode(masterclgzipcode);
		mast.setUniversity(masteruniversity);
		mast.setPercentage(masterpercentage);
		mast.setPassingYear(masteryearofpassing);
		mast.setEnrollmentNumber(masterenrollmentno);

		int mastId = bl.InsertApplicantMasterDetail(mast);
		mast1 = bl.fetchStoredStudentMasterDetail(mastId);
		ap.setMasterdetail(mast1);

		InputStream in1 = (InputStream) part1.getInputStream();
		byte[] photo = new byte[in1.available()];
		in1.read(photo);
		InputStream in2 = (InputStream) part2.getInputStream();
		byte[] digSign = new byte[in2.available()];
		in2.read(digSign);
		InputStream in3 = (InputStream) part3.getInputStream();
		byte[] ageProof = new byte[in3.available()];
		in3.read(ageProof);
		InputStream in4 = (InputStream) part4.getInputStream();
		byte[] castCerti = new byte[in4.available()];
		in4.read(castCerti);
		InputStream in5 = (InputStream) part5.getInputStream();
		byte[] bplCerti = new byte[in5.available()];
		in5.read(bplCerti);
		InputStream in6 = (InputStream) part6.getInputStream();
		byte[] SSCmarksheet = new byte[in6.available()];
		in6.read(SSCmarksheet);
		InputStream in7 = (InputStream) part7.getInputStream();
		byte[] HSCmarksheet = new byte[in7.available()];
		in7.read(HSCmarksheet);
		InputStream in8 = (InputStream) part8.getInputStream();
		byte[] diplomaCerti = new byte[in8.available()];
		in8.read(diplomaCerti);
		InputStream in9 = (InputStream) part9.getInputStream();
		byte[] bachelorCerti = new byte[in9.available()];
		in9.read(bachelorCerti);
		InputStream in10 = (InputStream) part10.getInputStream();
		byte[] masterCerti = new byte[in10.available()];
		in10.read(masterCerti);

		upl.setPhotograph(photo);
		upl.setSignature(digSign);
		upl.setAgeProof(ageProof);
		upl.setCasteCategoryCertificate(castCerti);
		upl.setBplcertificate(bplCerti);
		upl.setSscmarksheet(SSCmarksheet);
		upl.setHscmarksheet(HSCmarksheet);
		upl.setDiplomaCertificate(diplomaCerti);
		upl.setBachelorDegreeCertificate(bachelorCerti);
		upl.setMastersDegreeCertificate(masterCerti);

		int uplId = bl.InsertApplicantUploadedDocs(upl);
		upl1 = bl.fetchStoredStudentUploadedDocs(uplId);
		ap.setUploadeddocuments(upl1);

		int ap1=bl.InsertApplication(ap);
		appId = bl.fetchStudentApllicationId(ap1);
		
		
		
		HttpSession s=request.getSession();
		s.setAttribute("StudentAppliId", appId);
		
		
		
		response.sendRedirect("StudentApprovalForAdmission.jsp");
	}

}
