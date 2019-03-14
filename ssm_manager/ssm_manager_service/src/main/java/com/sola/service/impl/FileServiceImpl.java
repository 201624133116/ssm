package com.sola.service.impl;

import com.sola.mapper.FileMapper;
import com.sola.pojo.File;
import com.sola.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by Administrator
 *
 * @author sola
 * @date 2019/03/03 13:25
 */
@Service
public class FileServiceImpl implements FileService {

	@Autowired
	FileMapper fileMapper;

	@Override
	public File queryFileById(Integer id) {
		File file = null;
		try{
			file = fileMapper.selectByPrimaryKey(id);
			return file;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer saveFile(File file) {
		Integer id = null;
		try{
			id = fileMapper.insert(file);
		}catch (Exception e){
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public void deleteFileById(Integer id) {

	}

	@Override
	public void updateFileById(Integer id, File file) {

	}

	@Override
	public List<File> queryFilesByAdminId(Integer adminid) {
		return null;
	}
}
