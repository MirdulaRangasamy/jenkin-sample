/**
 * @Placed com.exterro.jenkin.controller
 */
package com.exterro.jenkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MirdulaRangasamy
 *
 * @date 13 Aug 2025
 */
@Controller
public class DemoController {
	@RequestMapping("home")
	public String getHome() {
		return "home.html";
	}
}
