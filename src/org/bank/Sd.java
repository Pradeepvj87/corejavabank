package org.bank;

public class Sd extends RBI {
	public void accountNum() {
		System.out.println("enter ur account number");
		}
		private void accountName() {
		System.out.println("enter account holder name");
			
		}
		public static void main(String[] args) {
			Sd d = new Sd();
					d.accountName();
			d.accountNum();
			d.adhaarNum();
			d.panNum();
			
		}
}
