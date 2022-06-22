package com.ssamz.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssamz.biz.dao.KBStarBankVO;
import com.ssamz.biz.dao.WooriBankVO;
import com.ssamz.biz.service.BankService;

@Controller
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@PostMapping("/getBalance.do")
	public String getBalance(WooriBankVO woori, Model model) {
		model.addAttribute("wooriAccount", bankService.getWooriAccount(woori));
		return "getBalance";
	}
	
	@GetMapping("/transferView.do")
	public String transferView(WooriBankVO woori, Model model) {
		model.addAttribute("wooriAccount", bankService.getWooriAccount(woori));
		return "transfer";
	}
	
	@PostMapping("/transferResult.do")
	public String transferResult(WooriBankVO woori, KBStarBankVO kbStar, Model model) {
		if(woori.getBankName().equals("KB")) {
			bankService.updateAccount(woori, kbStar);
			model.addAttribute("wooriAccount", bankService.getWooriAccount(woori));
			model.addAttribute("kbStarAccount", bankService.getKBStarAccount(kbStar));
		}
		return "transferResult";
	}
	
}
