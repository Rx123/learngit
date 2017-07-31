package wsy.controller;

import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import wsy.repository.AppDao;
@RestController
@RequestMapping("/app")
public class restController {
	
	@Autowired
	private AppDao appDao;
	
	@RequestMapping(value = { "/{id}" }, method = { RequestMethod.GET })
	@ResponseBody
	public Map<String, Object> get(@PathVariable("id") String id){
		Map<String, Object> map = appDao.findOne(id);
//		return JSONObject.fromObject(map).toString();
		return map;
	}
}
