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
		Admin admin = null;
		try{
			admin = adminMapper.selectByPrimaryKey(id);
		}catch (Exception e){
			e.printStackTrace();
		}
		if(admin != null){
			return admin;
		}

		return null;
	}

	@Override
	public void saveAdmin(Admin admin) {
		try {
			adminMapper.insertSelective(admin);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void updateAdminById(Integer id, Admin admin) {
		admin.setId(id);
		try {
			adminMapper.updateByPrimaryKeySelective(admin);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAdminById(Integer id) {
		try {
			adminMapper.deleteByPrimaryKey(id);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
