package superCalc;

import java.util.*;

public class User {
	Price pr;
	User us;
	Scanner sc = new Scanner(System.in);
	ArrayList<HashMap<String,Object>> shop = new ArrayList<>();
	double price = 0;
	int ind=0;
	public void showList(int choice) {
	    // TODO Auto-generated method stub
	    
	    switch(choice) {
	        case 1:
	            showVegList();
	            break;
	        case 2:
	            showFruitList();
	            break;
	        case 3:
	            showDairyList();
	            break;
	        case 4:
	            showStapleList();
	            break;
	        case 5:
	            showSpicesList();
	            break;
	        case 6:
	            showSnackList();
	            break;
	        case 7:
	            showBeverageList();
	            break;
	        case 8:
	            break;
	        default:
	            System.out.println("Enter Correct Choice!");    
	    }
	}

	private void showVegList() {
	    HashMap<String, Integer> veg = pr.getVegetables();
	    showItemList(veg, "Vegetables");
	}

	private void showFruitList() {
	    HashMap<String, Integer> fruits = pr.getFruits();
	    showItemList(fruits, "Fruits");
	}

	private void showDairyList() {
	    HashMap<String, Integer> dairy = pr.getDairy();
	    showItemList(dairy, "Dairy");
	}

	private void showStapleList() {
	    HashMap<String, Integer> staple = pr.getStap();
	    showItemList(staple, "Staples");
	}

	private void showSpicesList() {
	    HashMap<String, Integer> spices = pr.getSpices();
	    showItemList(spices, "Spices");
	}

	private void showSnackList() {
	    HashMap<String, Integer> snacks = pr.getSnacks();
	    showItemList(snacks, "Snacks");
	}

	private void showBeverageList() {
	    HashMap<String, Integer> beverages = pr.getBeverages();
	    showItemList(beverages, "Beverages");
	}

	private void showItemList(HashMap<String, Integer> items, String category) {
	    int ch;
	    double qty;
	    do {
	        System.out.println("Select the " + category + ":");
	        int i = 1;
	        for (String item : items.keySet()) {
	            System.out.println(i + ". " + item + " - ₹" + items.get(item));
	            i++;
	        }
	        System.out.println(i + ". Next");
	        
	        ch = sc.nextInt();
	        if (ch == i) break; 
	        
	        System.out.println("Enter the Quantity(in Kg):");
	        qty = sc.nextDouble();
	        
	        String selectedItem = (String) items.keySet().toArray()[ch - 1];
	        Map<String, Object> item1 = new HashMap<>();
	        item1.put("item", selectedItem);
	        item1.put("Category", category);
	        item1.put("Price", items.get(selectedItem));
	        item1.put("Quantity", qty);
	        price += items.get(selectedItem)*qty;
	        shop.add((HashMap<String, Object>) item1);
	        ind++;
	        us.showBill();
	    } while (true);
	}


	private void showBill() {
		// TODO Auto-generated method stub
		int i = 1;
		double total = 0;
		double grandTotal = 0;
		System.out.println(String.format("%-5s %-20s %-15s %-10s %-10s %-10s", 
		    "No", "Item", "Category", "Price", "Quantity", "Total"));

		for (Map<String, Object> item : shop) {
		    // Ensure Quantity is correctly handled as a double
		    double quantity = ((Number) item.get("Quantity")).doubleValue();  // Double for fractional values
		    total = ((Number) item.get("Price")).doubleValue() * quantity;
		    grandTotal += total;
		    
		    // Print the values with correct formatting
		    System.out.println(String.format("%-5d %-20s %-15s %-10.2f %-10.2f %-10.2f", 
		        i, item.get("item"), item.get("Category"), 
		        ((Number) item.get("Price")).doubleValue(), 
		        quantity, total));
		    i++;
		}

		// Print the Grand Total with correct formatting
		System.out.println(String.format("%-5s %-20s %-15s %-10s %-10s %-10.2f", 
		    "", "", "", "", "Grand Total", grandTotal));

		price = grandTotal;
		System.out.println("Do you like to modify list (y/n):");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
		    us.modifyBill();
		}


	}

	private void modifyBill() {
		// TODO Auto-generated method stub
		while(true) {
			int i;
			do{
				System.out.println("Enter the item No to Delete(0-Exit):");
			    i = sc.nextInt();
			    if(i>ind)System.out.println("Enter the correct No");
			    else if(i==0)return;
			}while(i>ind);
			shop.remove(i-1);
			ind--;
			us.showModBill();
		}
		
	}

	void showModBill() {
		int i = 1;
		double total = 0;
		double grandTotal = 0;  // Use double for more precision
		System.out.println(String.format("%-5s %-20s %-15s %-10s %-10s %-10s", 
		    "No", "Item", "Category", "Price", "Quantity", "Total"));

		for (Map<String, Object> item : shop) {
		    // Use double for accurate calculations
		    double price = ((Number) item.get("Price")).doubleValue(); 
		    double quantity = ((Number) item.get("Quantity")).doubleValue();
		    
		    // Calculate total as double
		    total = price * quantity;
		    grandTotal += total;

		    // Use %.2f for double values like Price, Quantity, and Total for two decimal places
		    System.out.println(String.format("%-5d %-20s %-15s %-10.2f %-10.2f %-10.2f", 
		        i, item.get("item"), item.get("Category"), price, quantity, total));
		    i++;
		}

		// Print the Grand Total with correct formatting
		System.out.println(String.format("%-5s %-20s %-15s %-10s %-10s %-10.2f", 
		    "", "", "", "", "Grand Total", grandTotal));

		price = grandTotal;

	}

	public void setPath(Price pr) {
		this.pr = pr;
		// TODO Auto-generated method stub
		
	}
	public void setOrgPath(User us) {
		this.us = us;
		// TODO Auto-generated method stub
		
	}

	public boolean checkDiscount(int dis) {
		// TODO Auto-generated method stub
		if(dis>pr.disLimit) {
			System.out.println("Please Enter the Discount In range of 0-"+pr.disLimit+":");
			return false;
		}
		return true;
	}

	public double checkDiscountPrice(int dis) {
		// TODO Auto-generated method stub
		double discountAmount = (price * dis) / 100;
		double discountedPrice = price - discountAmount;
		System.out.println(String.format("%-5s %-20s %-15s %-10s %-10s %-10s", "", "", "", "", "Discount (" + dis + "%)", String.format("%.2f", discountAmount)));
		return discountedPrice;
	}
	
}
//rice = 70
//sugar = 65
//tea = 900
//coffee = 900
//biscuit = 30
//apple = 240
//orange = 130
//grapes = 160
