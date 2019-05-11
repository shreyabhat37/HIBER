 package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/admin")
public class Test {
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getInfo()
	{
		return "Info";
	}
	
	@RequestMapping(value = "/postparam",method = RequestMethod.POST)
	public String getParameters(
		@RequestParam("EmpID") String eid,
		@RequestParam("fname") String fname,
		@RequestParam("lname") String lname,
		@RequestParam("EDOB") String edob,
		@RequestParam("EDOJ") String edoj,
		@RequestParam("EmpDeptID") String eDiptId,
		@RequestParam("EmpGrade") String eGrade,
		@RequestParam("EmpDesignation") String eDesig,
		@RequestParam("EmpBasic") String eBasic,
		@RequestParam("EmpGender") String eGender,
		@RequestParam("EmpMaritalStatus") String eMar,
		@RequestParam("EmpHomeAddress") String eAddr,
		@RequestParam("EmpContactNum") String eContact
			
			)
	{
		System.out.println(eid);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(edob);
		System.out.println(edoj);
		System.out.println(eDiptId);
		System.out.println(eGrade);
		System.out.println(eDesig);
		System.out.println(eBasic);
		System.out.println(eGender);
		System.out.println(eMar);
		System.out.println(eAddr);
		System.out.println(eContact);
		
		return "Demo";
	}

}
