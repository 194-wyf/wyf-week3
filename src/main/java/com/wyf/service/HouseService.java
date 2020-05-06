package com.wyf.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wyf.domain.House;
import com.wyf.domain.HouseVO;

public interface HouseService {

	int inserts(List<House> list);
	
	PageInfo<House> select(HouseVO houseVO,Integer pageSize,Integer pageNum);
}
