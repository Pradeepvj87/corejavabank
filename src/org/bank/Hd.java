



package org.bank;

public class Hd extends RBI {
	public void accountNum() {
		System.out.println("enter ur account number");
		}
		private void accountName() {
		System.out.println("enter account holder name");
			
		}
		private void accountype() {
System.out.println("it is a saving account");
		}
		public static void main(String[] args) {
			Hd d = new Hd();
					d.accountName();
			d.accountNum();
			d.adhaarNum();
			d.panNum();
			

}
}
