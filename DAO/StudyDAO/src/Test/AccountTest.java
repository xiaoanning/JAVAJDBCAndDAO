package Test;

import java.util.List;

import org.junit.Test;

import dao.AccountDAOImplement;
import entity.Account;

public class AccountTest 
{
	private AccountDAOImplement ai = new AccountDAOImplement();
	
	private Account a = new Account(null,"username","passwo",10.00,"18500000000");
	
	@Test
	public void testSelectAll()
	{
		List<Account> list =  ai.selectAll();
		
		for(Account a : list)
		{
			System.out.println(a.toString());
		}
	}
	
	@Test
	public void testSelectByCardId()
	{
		Account a = ai.selectByCardId(1002);
		System.out.println(a.toString());

	}
	
	@Test
	public void testInsert()
	{
		ai.insert(a);
	}
	
	@Test
	public void testUpdate()
	{
		a = new Account(1002,"updateNa","123456",12.00,"11111111111");
		ai.update(a);
	}
	
	@Test
	
	public void testDelete()
	{
		ai.delete(1002);
	}
	
}
