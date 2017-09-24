package com.mvc.service.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.BusNeedDao;
import com.mvc.entiy.BusNeed;
import com.mvc.service.BusNeedService;

/**
 * 班车
 * 
 * @author wanghuimin
 * @date 2017年8月9日
 */
@Service("busNeedServiceImpl")
public class BusNeedServiceImpl implements BusNeedService {

	@Autowired
	BusNeedDao busNeedDao;

	// 添加,修改班车定制需求
	@Override
	public BusNeed saveBusNeed(BusNeed busNeed) {
		BusNeed result = new BusNeed();
		if (result.getBune_id() != null) {
			return result;
		} else
			return null;
	}

	@Override
	public String selectContent() {
		// TODO Auto-generated method stub
		String str=busNeedDao.selectContent();
		return null;
	}

}
