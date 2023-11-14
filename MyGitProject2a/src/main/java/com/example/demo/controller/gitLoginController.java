package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class gitLoginController {


	//画面表示用
		@RequestMapping(path = "/gitlogin", method = RequestMethod.GET)
		public String viewPage() {

			return "gitlogin";
		}

		//ログイン検証用
		@RequestMapping(path = "/gitlogin", method = RequestMethod.POST)
		public String loginPost(String username, String password) {

			if (username.equals("gitlogin") && password.equals("gitpw")) {
				
				return "redirect:/gititemlist";
			}

			return "redirect:/gitlogin";
		}
	}