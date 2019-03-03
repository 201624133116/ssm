package com.sola.controller;

import com.sola.pojo.Admin;
import com.sola.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Administrator
 *
 * @author sola
 * @date 2019/02/26 14:15
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@ResponseBody
	@RequestMapping("/{id}")
	public Admin queryAdminById(@PathVariable Integer id){
		Admin admin = adminService.queryAdminById(id);
		return admin;
	}



}
