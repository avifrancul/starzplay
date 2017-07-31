package com.starzplay.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.starzplay.model.Entries;
import com.starzplay.service.MediaService;

@RestController
@RequestMapping("/media")
public class MediaController {

	
	@Autowired
	private MediaService service;

	
	@RequestMapping
	public List<Entries> welcome(@RequestParam (value="filter",required=false) String filter,
            @RequestParam(value="level",required=false) String level) {
		System.out.println("Filter is"+filter);
		System.out.println("Level is"+level);
		if(filter==null&level==null){
			System.out.println("Inside Null check");
			return service.retrieveEntries();
		}
		
		return service.retrieveEntries(filter,level);
	}
	
	
	
	
	
	
}
