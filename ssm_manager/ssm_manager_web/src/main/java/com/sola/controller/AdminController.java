package com.sola.controller;

import com.sola.bean.Admin;
import com.sola.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Administrator
 *
 * @author sola
 * @date 2019/02/26 14:15
 */
@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping("/run")
	@ResponseBody
	public  Admin run(){
		Admin admin = adminService.queryAdminById(1);
		return admin;
	}

}
