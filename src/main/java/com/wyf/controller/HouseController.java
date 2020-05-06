package com.wyf.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wyf.domain.House;
import com.wyf.domain.HouseVO;
import com.wyf.service.HouseService;

@Controller
public class HouseController {

	@Resource
	private HouseService houseService;
	@RequestMapping("index")
	public String select(Model model,HouseVO vo,@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "10") Integer pageSize) {
		
		PageInfo<House> info = houseService.select(vo, pageSize, pageNum);
		model.addAttribute("info", info);
		model.addAttribute("vo", vo);
		return "my/index";
		
	}
}
