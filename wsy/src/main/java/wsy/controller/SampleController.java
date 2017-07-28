package wsy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wsy.repository.AppDao;

@Controller
@EnableAutoConfiguration
public class SampleController {
//	@Autowired
//	UUservice uuService ;
	@Autowired
	private AppDao uuDao;
	@RequestMapping("/")
    @ResponseBody
    String home() {
		
//		dao.
        return "Hello World!";
    }
	@SuppressWarnings("rawtypes")
	@RequestMapping("/a")
    @ResponseBody
    List home1(HttpServletRequest request) {
//		List list = uuService.findAll();
        return uuDao.findAll();
    }
    


}