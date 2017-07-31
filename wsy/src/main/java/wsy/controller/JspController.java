package wsy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {
	@RequestMapping(value="/page1")
	public ModelAndView jsp1(HttpServletRequest request){
		return new ModelAndView("index");
	}
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request){
		return new ModelAndView("login/login");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login1(HttpServletRequest request){
		return new ModelAndView("login/login");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login3(HttpServletRequest request){
		return new ModelAndView("login/login");
	}
	
}
