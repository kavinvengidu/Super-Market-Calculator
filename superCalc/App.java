package superCalc;
import java.util.*;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Price pr = new Price();
		while(true) {
			System.out.println("Welcome to XXX Supermarket");
			
			System.out.println("Are you a:");
			System.out.println("1. User");
			System.out.println("2. Admin");
			int role=sc.nextInt();
			if(role == 1) {
				User us = new User();
				us.setPath(pr);
				us.setOrgPath(us);
				char ch;
				do {
				System.out.println("Welcome User!");
				int choice;
				do {
					System.out.println("Please!Select the type item you want:");
					System.out.println("1. Vegetables");
					System.out.println("2. Fruits");
					System.out.println("3. Snacks");
					System.out.println("4. Daily Products");
					System.out.println("5. Stables");
					System.out.println("6. Spices");
					System.out.println("7. Beverages");
					System.out.println("8. Next");
					choice = sc.nextInt();
					us.showList(choice);
				}while(choice!=8);
				
				int dis;
				do{
					System.out.println("Enter the discount:");
					dis = sc.nextInt();
					
				}while(!us.checkDiscount(dis));
				us.showModBill();
				double price=us.checkDiscountPrice(dis);
				
				System.out.println(String.format("%-5s %-20s %-15s %-10s %-10s %-10s", "", "", "", "", "Discounted Price", String.format("%.2f", price)));
				System.out.println("Do you want to continue(y/n):");
				ch = sc.next().charAt(0);
				}while(ch=='y');
				System.out.println("We appreciate your visit. Come back soon!");
				System.out.println();
			}
			else if(role==2) {
				Admin adm = new Admin();
				adm.setPath(pr);
				adm.setOrgPath(adm);
				int choice;
				do {
					System.out.println("Welcome Administartor!");
					System.out.println("What Do you Want do:");
					System.out.println("1. Check Groceries");
					System.out.println("2. Modify Groceries List");
					System.out.println("3. Check Discount Limit");
					System.out.println("4. Modify Discount Limit");
					System.out.println("5. Add Item To Groceries List");
					System.out.println("6. Exit");
					choice = sc.nextInt();
					adm.process(choice);
				}while(choice!=6);
				System.out.println();
			}
		}

	}

}
