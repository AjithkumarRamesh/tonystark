package com.tech.tonystark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TonyController {
@GetMapping("/theNameis")
public String theNameis() {
	return "IRON MAN";
}
}
