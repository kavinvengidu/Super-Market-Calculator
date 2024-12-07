package superCalc;

import java.util.*;

public class Admin {
	Price pr;
	private Admin adm;
	Scanner sc = new Scanner(System.in);
	public void setPath(Price pr) {
		// TODO Auto-generated method stub
		this.pr = pr;
	}
	public void setOrgPath(Admin adm) {
		// TODO Auto-generated method stub
		this.adm = adm;
	}
	public void process(int choice) {
		// TODO Auto-generated method stub
		switch(choice) {
			case 1:
				adm.showGroceryList();
				break;
			case 2:
				adm.modifyGroceryList();
				break;
			case 3:
				adm.checkDiscountLim();
				break;
			case 4:
				adm.alterDiscount();
				break;
			case 5:
				adm.addItems();
				break;
			case 6:
				break;
			default:
				System.out.println("Enter The Correct Option!");
			
		}
	}
	private void addItems() {
		// TODO Auto-generated method stub
		int ch;
		do {
			System.out.println("Enter the category you like to add item:");
			System.out.println("1. Vegetables");
			System.out.println("2. Fruits");
			System.out.println("3. Snacks");
			System.out.println("4. Daily Products");
			System.out.println("5. Stables");
			System.out.println("6. Spices");
			System.out.println("7. Beverages");
			System.out.println("8. Next");
			ch = sc.nextInt();
			adm.addCateg(ch);
		}while(ch!=8);
		
	}
	private void addCateg(int ch) {
		// TODO Auto-generated method stub
		
		switch(ch) {
		case 1:
			pr.showVegetables();
			pr.addVegList();
			break;
		case 2:
			pr.showFruits();
			pr.addFruitList();
			break;
		case 3:
			pr.showSnacks();
			pr.addSnackList();
			break;
		case 4:
			pr.showDairy();
			pr.addDairyList();
			break;
		case 5:
			pr.showStaples();
			pr.addStaplesList();
			break;
		case 6:
			pr.showSpices();
			pr.addSpicesList();
			break;
		case 7:
			pr.showBeverages();
			pr.addBeverList();
			break;
		case 8:
			break;
		default:
			System.out.println("Enter The Correct Option!");
		
	}
		
	}
	private void alterDiscount() {
		// TODO Auto-generated method stub
		adm.checkDiscountLim();
		System.out.println("Enter the New Limit:");
		int n = sc.nextInt();
		pr.disLimit=n;
	}
	private void checkDiscountLim() {
		// TODO Auto-generated method stub
		System.out.println("Discount Limit:"+pr.disLimit);
	}
	private void modifyGroceryList() {
		// TODO Auto-generated method stub
		int cat;
		do {
			System.out.println("Enter the Category No for Modification:");
			System.out.println("1. Vegetables");
			System.out.println("2. Fruits");
			System.out.println("3. Snacks");
			System.out.println("4. Daily Products");
			System.out.println("5. Stables");
			System.out.println("6. Spices");
			System.out.println("7. Beverages");
			System.out.println("8. Next");
			cat = sc.nextInt();
			
			String Name;
			int price;
			char ch;
			switch (cat) {
	        case 1:
	            pr.showVegetables();
	            Name=adm.getItemName(1);
	            System.out.println("Do you Want to delete"+Name+"(y/n):");
	            ch = sc.next().charAt(0);
	            if(ch!='y'){
	            	price = adm.getModPrice();
	            	pr.modifyPrice(1,Name,price);
	            }
	            else pr.modifyPrice(1,Name);
	            break;
	        case 2:
	            pr.showFruits();
	            Name=adm.getItemName(2);
	            System.out.println("Do you Want to delete"+Name+"(y/n):");
	            ch = sc.next().charAt(0);
	            if(ch!='y'){
	            	price = adm.getModPrice();
	            	pr.modifyPrice(2,Name,price);
	            }
	            else pr.modifyPrice(2,Name);
	            break;
	        case 3:
	            pr.showDairy();
	            Name=adm.getItemName(3);
	            System.out.println("Do you Want to delete"+Name+"(y/n):");
	            ch = sc.next().charAt(0);
	            if(ch!='y'){
	            	price = adm.getModPrice();
	            	pr.modifyPrice(3,Name,price);
	            }
	            else pr.modifyPrice(3,Name);
	            break;
	        case 4:
	            pr.showStaples();
	            Name=adm.getItemName(4);
	            System.out.println("Do you Want to delete"+Name+"(y/n):");
	            ch = sc.next().charAt(0);
	            if(ch!='y'){
	            	price = adm.getModPrice();
	            	pr.modifyPrice(4,Name,price);
	            }
	            else pr.modifyPrice(4,Name);
	            break;
	        case 5:
	            pr.showSpices();
	            Name=adm.getItemName(5);
	            System.out.println("Do you Want to delete"+Name+"(y/n):");
	            ch = sc.next().charAt(0);
	            if(ch!='y'){
	            	price = adm.getModPrice();
	            	pr.modifyPrice(5,Name,price);
	            }
	            else pr.modifyPrice(5,Name);
	            break;
	        case 6:
	        	pr.showSnacks();
	            Name=adm.getItemName(6);
	            System.out.println("Do you Want to delete"+Name+"(y/n):");
	            ch = sc.next().charAt(0);
	            if(ch!='y'){
	            	price = adm.getModPrice();
	            	pr.modifyPrice(6,Name,price);
	            }
	            else pr.modifyPrice(6,Name);
	            break;
	        case 7:
	        	pr.showBeverages();
	            Name=adm.getItemName(7);
	            System.out.println("Do you Want to delete"+Name+"(y/n):");
	            ch = sc.next().charAt(0);
	            if(ch!='y'){
	            	price = adm.getModPrice();
	            	pr.modifyPrice(7,Name,price);
	            }
	            else pr.modifyPrice(7,Name);
	            break;
	        case 8:
	        	break;
	        default:
	            System.out.println("Invalid category number. Please try again.");
	            break;
			}
		}while(cat!=8);	
		System.out.println();
	}
	private int getModPrice() {
		// TODO Auto-generated method stub
		System.out.println("Enter the price to change:");
		int n = sc.nextInt();
		
		return n;
	}
	private String getItemName(int i) {
		// TODO Auto-generated method stub
		String ans="";
		switch(i) {
	        case 1:
	            ans=showVegList();
	            break;
	        case 2:
	        	ans=showFruitList();
	            break;
	        case 3:
	        	ans=showDairyList();
	            break;
	        case 4:
	        	ans=showStapleList();
	            break;
	        case 5:
	        	ans=showSpicesList();
	            break;
	        case 6:
	        	ans=showSnackList();
	            break;
	        case 7:
	        	ans=showBeverageList();
	            break;
	        case 8:
	            break;
	        default:
	            System.out.println("Enter Correct Choice!");    
		}
		return ans;
		
	}
	private String showVegList() {
	    HashMap<String, Integer> veg = pr.getVegetables();
	    String ans =showItemList(veg, "Vegetables");
	    return ans;
	}

	private String showFruitList() {
	    HashMap<String, Integer> fruits = pr.getFruits();
	    String ans=showItemList(fruits, "Fruits");
	    return ans;
	}

	private String showDairyList() {
	    HashMap<String, Integer> dairy = pr.getDairy();
	    String ans=showItemList(dairy, "Dairy");
	    return ans;
	}

	private String showStapleList() {
	    HashMap<String, Integer> staple = pr.getStap();
	    String ans=showItemList(staple, "Staples");
	    return ans;
	}

	private String showSpicesList() {
	    HashMap<String, Integer> spices = pr.getSpices();
	    String ans=showItemList(spices, "Spices");
	    return ans;
	}

	private String showSnackList() {
	    HashMap<String, Integer> snacks = pr.getSnacks();
	    String ans=showItemList(snacks, "Snacks");
	    return ans;
	}

	private String showBeverageList() {
	    HashMap<String, Integer> beverages = pr.getBeverages();
	    String ans=showItemList(beverages, "Beverages");
	    return ans;
	}
	private String showItemList(HashMap<String, Integer> items, String string) {
		// TODO Auto-generated method stub
		int ch,i;
		String itemName="";
	    do {
	        System.out.println("Select the Item of"+string+"to modify:");
	        ch = sc.nextInt();
	        i = 1;
	        for (String item : items.keySet()) {
	        	if(i==ch) itemName = item;
	            i++;
	        }
	        if (ch >=i) System.out.println("Enter The Correct No!");
	    }while(ch>=i);
	    return itemName;
	}
	private void showGroceryList() {
		// TODO Auto-generated method stub
		pr.showAll();
		System.out.println();
	}

}
