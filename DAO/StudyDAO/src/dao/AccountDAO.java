package dao;

import java.util.List;

import entity.Account;

public interface AccountDAO 
{
	void insert(Account a);
	
	void delete(Integer card_id);
	
	void update(Account a);
	
	List<Account> selectAll();
	Account selectByCardId(Integer card_id);
	
}
