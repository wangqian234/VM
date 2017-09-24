package com.mvc.service;

import java.util.List;
import java.util.Map;

import com.mvc.entiy.BusNeed;

/**
 * 班车
 * 
 * @author wanghuimin
 * @date 2017年8月9日
 */
public interface BusNeedService {

	// 添加,修改班车定制需求
	BusNeed saveBusNeed(BusNeed busNeed);

	String selectContent();
}
