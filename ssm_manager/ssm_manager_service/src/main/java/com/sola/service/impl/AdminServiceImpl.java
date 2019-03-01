package com.sola.service.impl;

import com.sola.mapper.AdminMapper;
import com.sola.pojo.Admin;
import com.sola.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by Administrator
 *
 * @author sola
 * @date 2019/02/27 10:13
 */
@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;

	@Override
	public Admin queryAdminById(Integer id) {

		Admin admin = adminMapper.selectByPrimaryKey(id);
		if(admin != null){
			return admin;
		}

		return null;
	}
}
