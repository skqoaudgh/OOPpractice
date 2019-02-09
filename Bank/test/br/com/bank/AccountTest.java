/* TDD (테스트 주도 개발)
 *  1. 버그를 쉽게 찾아 수정할 수 있다.
 *  2. 프로그램 디자인을 향상시킬 수 있다.
 *  3. assertEquals를 이용하여 유닛 단위 테스트를 진행한다. (실제 값과 예상 값을 비교)
 */

package br.com.bank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

		@Test
		public void createNewAccount() {
			Account account = new Account();
			double current = account.getBalance();
			assertEquals(0, current, 0.000001);
		}
		
		@Test
		public void deposit() {
			Account account = new Account();
			
			account.deposit(123.45);	
			assertEquals(123.45, account.getBalance(), 0.000001);
			
			account.deposit(200);
			assertEquals(323.45, account.getBalance(), 0.000001);			
		}
		
		@Test
		public void withdraw() {
			Account account = new Account();
			
			account.deposit(100);
			account.withdraw(40);
			
			assertEquals(60, account.getBalance(), 0.000001);
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void exception() {
			Account account = new Account();
			
			account.deposit(100);
			account.withdraw(140);
		
		}
}
