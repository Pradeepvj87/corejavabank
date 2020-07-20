package org.bank;

public class Id extends RBI{
	public void accountNum() {
		System.out.println("enter ur account number");
		}
		private void accountName() {
		System.out.println("enter account holder name");
		}
		private void typeaccount() {
System.out.println("fixed account");
		}
		public static void main(String[] args) {
			Id d = new Id();
					d.accountName();
			d.accountNum();
			d.adhaarNum();
			d.panNum();
			
		}
}
