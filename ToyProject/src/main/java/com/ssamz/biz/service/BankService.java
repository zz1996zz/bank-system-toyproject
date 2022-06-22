package com.ssamz.biz.service;

import com.ssamz.biz.dao.KBStarBankVO;
import com.ssamz.biz.dao.WooriBankVO;

public interface BankService {

	WooriBankVO getWooriAccount(WooriBankVO woori);
	KBStarBankVO getKBStarAccount(KBStarBankVO kbStar);
	void updateAccount(WooriBankVO woori, KBStarBankVO kbStar);
}