 package com.mvc.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mvc.dao.BusNeedDao;
import com.mvc.entiy.BusNeed;

/**
  * 
  * @author wanghuimin
  * @date 2017年8月9日
  */
@Repository("busNeedDaoImpl")
public class BusNeedDaoImpl implements BusNeedDao {
	@Autowired
	@Qualifier("entityManagerFactory")
	EntityManagerFactory emf;

	//根据时间查询班车定制需求
	@SuppressWarnings("unchecked")
	@Override
	public List<BusNeed> findByUsertime(Map<String, Object> map) {
		String startDate = null;
		String endDate = null;
		String openid = null;
		if ((String) map.get("startDate")!=null) {
			startDate=(String) map.get("startDate");//开始时间
		}
		if ((String) map.get("endDate")!=null) {
			endDate=(String) map.get("endDate");//结束时间
		}
		if ((String) map.get("openid")!=null) {
			openid=(String) map.get("openid");//结束时间
		}
		EntityManager em=emf.createEntityManager(); 
		String sql;
		if(startDate==null || endDate==null ){
			sql="select * from bus_need where open_id='"+ openid +"' and is_delete=1 order by bune_gath_time desc ";		

		}else {
			sql="select * from bus_need where open_id='"+ openid +"' and is_delete=1 and "
					+ " bune_gath_time between '"+ startDate +"' and '"+ endDate +"' order by bune_gath_time desc ";		
		}
		Query query=em.createNativeQuery(sql,BusNeed.class);
		List<BusNeed> list=query.getResultList();
		em.close();
		return list;
	}

	@Override
	public String selectContent() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
