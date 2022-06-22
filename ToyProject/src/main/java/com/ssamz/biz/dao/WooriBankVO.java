package com.ssamz.biz.dao;

import lombok.Data;

@Data
public class WooriBankVO {
	
	private String accountNumber;
	private String name;
	private int balance;
	private String receiptDate;
	private String withdrawDate;
	
	private int amount;
	private String bankName;
	private String transferAccount;
}
