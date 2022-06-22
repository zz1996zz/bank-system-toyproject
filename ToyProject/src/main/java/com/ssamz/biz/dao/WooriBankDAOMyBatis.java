package com.ssamz.biz.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class WooriBankDAOMyBatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public WooriBankVO getAccount(WooriBankVO woori) {
		return (WooriBankVO) mybatis.selectOne("WooriBankDAO.getAccount", woori);
	}

	public void updateAccount(WooriBankVO woori) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String nowDate = df.format(date);
		woori.setReceiptDate(nowDate);
		woori.setWithdrawDate(nowDate);
		mybatis.update("WooriBankDAO.updateAccount", woori);
	}

}














