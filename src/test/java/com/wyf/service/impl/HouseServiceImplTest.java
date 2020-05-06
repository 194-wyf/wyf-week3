package com.wyf.service.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyf.domain.House;
import com.wyf.service.HouseService;
import com.wyf.until.DateUtil;
import com.wyf.until.RandomUtil;
import com.wyf.until.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class HouseServiceImplTest {

	@Resource
	private HouseService houseService;
	@Test
	public void testInserts() {
		ArrayList<House> list = new ArrayList<House>();
		for (int i = 0; i < 100; i++) {
			House house = new House();
			Calendar c = Calendar.getInstance();
			c.set(2020, 5, 1);
			//预订日期   模拟从2020年5月1日至今任意随机日期
			Date random = DateUtil.random(c.getTime(), new Date());
			house.setCreattime(random);
//			姓名       调用StringUtil.generateChineseName()创建
			house.setName(StringUtil.generateChineseName());
//			手机       11位数字
			house.setPhone(RandomUtil.random(11));
//			房型id    来自房型类型表
			house.setTid(RandomUtil.random(1, 3));
//			房型id    来自房型类型表
			house.setOther(StringUtil.randomChineseString(10));
			list.add(house);
		}
		houseService.inserts(list);
	}

}
