package com.sola.service;

import com.sola.pojo.File;

import java.util.List;

/**
 * Create by Administrator
 *
 * @author sola
 * @date 2019/03/03 13:24
 */
public interface FileService {

	/**
	 * 通过文件id查找文件
	 * @param id
	 * @return
	 */
	File queryFileById(Integer id);


	/**
	 * 通过闯进来文件保存文件信息
	 * @param file
	 * @return
	 */
	Integer saveFile(File file);

	/**
	 * 通过文件的id删除文件
	 * @param id
	 */
	void deleteFileById(Integer id);

	/**
	 * 通过文件id对文件进行更新操作
	 * @param id
	 * @param file
	 */
	void updateFileById(Integer id, File file);

	/**
	 * 通过用户ID查询相关的文件信息
	 * @param adminid
	 * @return
	 */
	List<File> queryFilesByAdminId(Integer adminid);

}
