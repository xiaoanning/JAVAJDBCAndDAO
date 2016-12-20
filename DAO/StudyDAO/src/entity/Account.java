package entity;

import java.io.Serializable;

public class Account implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer char_id ;
	private String username ;
	private String password ;
	private Double balance ;
	private String mobile ;
	public Integer getChar_id() {
		return char_id;
	}
	public void setChar_id(Integer char_id) {
		this.char_id = char_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Account(Integer char_id, String username, String password,
			Double balance, String mobile) {
		super();
		this.char_id = char_id;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.mobile = mobile;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [char_id=" + char_id + ", username=" + username
				+ ", password=" + password + ", balance=" + balance
				+ ", mobile=" + mobile + ", getChar_id()=" + getChar_id()
				+ ", getUsername()=" + getUsername() + ", getPassword()="
				+ getPassword() + ", getBalance()=" + getBalance()
				+ ", getMobile()=" + getMobile() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
