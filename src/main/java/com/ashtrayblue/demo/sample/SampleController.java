package com.ashtrayblue.demo.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samples")
public class SampleController {
	@RequestMapping("/test")
	public String test() {
		return "{'code':'OK', 'msg': 'Test Message'}";
	}
}
