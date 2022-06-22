package com.ssamz.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssamz.biz.dao.KBStarBankDAOMyBatis;
import com.ssamz.biz.dao.KBStarBankVO;
import com.ssamz.biz.dao.WooriBankDAOMyBatis;
import com.ssamz.biz.dao.WooriBankVO;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private WooriBankDAOMyBatis wooriBankDAO;
	
	@Autowired
	private KBStarBankDAOMyBatis kbStarBankDAO;
	
	@Override
	public WooriBankVO getWooriAccount(WooriBankVO woori) {
		return wooriBankDAO.getAccount(woori);
	}

	@Override
	public KBStarBankVO getKBStarAccount(KBStarBankVO kbStar) {
		return kbStarBankDAO.getAccount(kbStar);
	}

	@Override
	public void updateAccount(WooriBankVO woori, KBStarBankVO kbStar) {
		wooriBankDAO.updateAccount(woori);
		kbStarBankDAO.updateAccount(kbStar);
	}
}
