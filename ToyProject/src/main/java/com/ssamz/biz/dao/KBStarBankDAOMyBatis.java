package com.ssamz.biz.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class KBStarBankDAOMyBatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public KBStarBankVO getAccount(KBStarBankVO kbStar) {
		return (KBStarBankVO) mybatis.selectOne("KBStarBankDAO.getAccount", kbStar);
	}

	public void updateAccount(KBStarBankVO kbStar) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String nowDate = df.format(date);
		kbStar.setReceiptDate(nowDate);
		kbStar.setWithdrawDate(nowDate);
		mybatis.update("KBStarBankDAO.updateAccount", kbStar);
	}

	
	

}














