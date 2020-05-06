package com.wyf.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wyf.domain.House;
import com.wyf.domain.HouseVO;

@Repository
public interface HouseMapper {
//	房间预订分页条件查询（2分）
	List<House> select(HouseVO houseVO);
//	房间预订单条新增（2分）
	int insert(House house);
//	房间预订批量新增（2分） 
	int inserts(List<House> list);
	
	
}
