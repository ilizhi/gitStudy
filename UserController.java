package com.lsj.springmvc.controller;

@Controller
public class UserController{

	@RequestMapping(value="/visitUser", method=Request.POST)
	public String mappingHello(){
	    Map<String,Object> map = new HashMap();
	    map.put("dataModel",new Object);
	    return "list";
	}
}
