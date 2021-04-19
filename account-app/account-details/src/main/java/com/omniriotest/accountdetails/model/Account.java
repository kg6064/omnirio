package com.omniriotest.accountdetails.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account {

	@Id
	private String accountId;
	private String accountType;
	private Date openDate;
	private int customerId;
	private String customerName;
	private String branch;
	private char isMonir;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public char getIsMonir() {
		return isMonir;
	}
	public void setIsMonir(char isMonir) {
		this.isMonir = isMonir;
	}
	public Account(String accountId, String accountType, Date openDate, int customerId, String customerName,
			String branch, char isMonir) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.openDate = openDate;
		this.customerId = customerId;
		this.customerName = customerName;
		this.branch = branch;
		this.isMonir = isMonir;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", openDate=" + openDate
				+ ", customerId=" + customerId + ", customerName=" + customerName + ", branch=" + branch + ", isMonir="
				+ isMonir + "]";
	}
}
