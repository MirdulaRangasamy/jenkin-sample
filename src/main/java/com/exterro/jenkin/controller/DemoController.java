/**
 * @Placed com.exterro.jenkin.controller
 */
package com.exterro.jenkin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author MirdulaRangasamy
 *
 * @date 13 Aug 2025
 */
@Controller
public class DemoController {
	public static Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("home")
	public String getHome() {
		return "home.html";
	}
	
	@RequestMapping("message")
	@ResponseBody
	public String getMessage() {
		logger.info("msg");
		logger.info("msg111111111111111111111111111111");
		logger.info("msg55555555555555555555555");
		return "Hello World";
	}
}
