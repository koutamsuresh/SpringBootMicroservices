package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlacesController {
	/**
	 * 
	 * handle the start end point
	 */
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	/**
	 * 
	 * handle the slash endpoint
	 */
	
	@RequestMapping("/")
	public String index() {
		return "start";
	}
	
}
