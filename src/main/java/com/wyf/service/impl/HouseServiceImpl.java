package com.wyf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyf.dao.HouseMapper;
import com.wyf.domain.House;
import com.wyf.domain.HouseVO;
import com.wyf.service.HouseService;
@Service
public class HouseServiceImpl implements HouseService {

	@Resource
	private HouseMapper houseMapper;
	@Override
	public int inserts(List<House> list) {
		// TODO Auto-generated method stub
		return houseMapper.inserts(list);
	}
	@Override
	public PageInfo<House> select(HouseVO houseVO,Integer pageSize,Integer pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<House> list = houseMapper.select(houseVO);
		PageInfo<House> info = new PageInfo<House>(list);
		return info;
	}

}
