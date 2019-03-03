package com.sola.service;

import com.sola.pojo.Admin;

/**
 * Create by Administrator
 *
 * @author sola
 * @date 2019/02/27 10:12
 */

public interface AdminService {

	/**
	 * 通过 ID 查询 用户账号信息
	 * @param id
	 * @return
	 */
	Admin queryAdminById(Integer id);


	/**
	 * 创建新的用户
	 * @param admin
	 */
	void saveAdmin(Admin admin);

	/**
	 * 通过Id更新用户信息
	 * @param id
	 * @param admin
	 */
	void updateAdminById(Integer id, Admin admin);

	/**
	 * 通过ID删除用户
	 * @param id
	 */
	void deleteAdminById(Integer id);

}
