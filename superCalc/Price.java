package superCalc;

import java.util.*;

public class Price {
    HashMap<String, Integer> vegetables = new HashMap<>();
    HashMap<String, Integer> fruits = new HashMap<>();
    HashMap<String, Integer> dairyProducts = new HashMap<>();
    HashMap<String, Integer> staples = new HashMap<>();
    HashMap<String, Integer> spices = new HashMap<>();
    HashMap<String, Integer> snacks = new HashMap<>();
    HashMap<String, Integer> beverages = new HashMap<>();
    public int disLimit = 99;
    Scanner sc = new Scanner(System.in);

    Price() {
        // Initializing HashMaps with items and prices
        vegetables.put("Tomatoes (1 kg)", 30);
        vegetables.put("Potatoes (1 kg)", 25);
        vegetables.put("Onions (1 kg)", 35);
        vegetables.put("Carrots (1 kg)", 50);
        vegetables.put("Spinach (1 bunch)", 20);

        fruits.put("Apples (1 kg)", 150);
        fruits.put("Bananas (1 dozen)", 50);
        fruits.put("Oranges (1 kg)", 80);
        fruits.put("Grapes (1 kg)", 120);
        fruits.put("Watermelon (1 piece)", 60);

        dairyProducts.put("Milk (1 liter)", 60);
        dairyProducts.put("Butter (500 g)", 250);
        dairyProducts.put("Cheese (200 g)", 120);
        dairyProducts.put("Yogurt (1 kg)", 80);
        dairyProducts.put("Paneer (500 g)", 180);

        staples.put("Rice (5 kg)", 300);
        staples.put("Wheat Flour (5 kg)", 250);
        staples.put("Lentils (1 kg)", 120);
        staples.put("Sugar (1 kg)", 50);
        staples.put("Salt (1 kg)", 20);

        spices.put("Turmeric Powder (200 g)", 50);
        spices.put("Chili Powder (200 g)", 80);
        spices.put("Garam Masala (200 g)", 100);
        spices.put("Cumin Seeds (100 g)", 40);
        spices.put("Coriander Powder (200 g)", 60);

        snacks.put("Biscuits (1 pack)", 30);
        snacks.put("Chips (1 pack)", 20);
        snacks.put("Namkeen (500 g)", 100);
        snacks.put("Instant Noodles (1 pack)", 15);
        snacks.put("Chocolates (1 bar)", 50);

        beverages.put("Tea (500 g)", 250);
        beverages.put("Coffee (200 g)", 150);
        beverages.put("Soft Drinks (1.25 liter)", 40);
        beverages.put("Packaged Juice (1 liter)", 100);
        beverages.put("Mineral Water (1 liter)", 20);
    }

    // Getter methods for HashMaps
    public HashMap<String, Integer> getVegetables() {
        return vegetables;
    }

    public HashMap<String, Integer> getFruits() {
        return fruits;
    }

    public HashMap<String, Integer> getDairy() {
        return dairyProducts;
    }

    public HashMap<String, Integer> getStap() {
        return staples;
    }

    public HashMap<String, Integer> getSpices() {
        return spices;
    }

    public HashMap<String, Integer> getSnacks() {
        return snacks;
    }

    public HashMap<String, Integer> getBeverages() {
        return beverages;
    }

    // Function to display all HashMaps
    public void showAll() {
        showVegetables();
        showFruits();
        showDairy();
        showStaples();
        showSpices();
        showSnacks();
        showBeverages();
    }

    // Display vegetables HashMap
    public void showVegetables() {
        System.out.println("Vegetables:");
        showCategory(vegetables);
    }

    // Display fruits HashMap
    public void showFruits() {
        System.out.println("\nFruits:");
        showCategory(fruits);
    }

    // Display dairy products HashMap
    public void showDairy() {
        System.out.println("\nDairy Products:");
        showCategory(dairyProducts);
    }

    // Display staples HashMap
    public void showStaples() {
        System.out.println("\nStaples:");
        showCategory(staples);
    }

    // Display spices HashMap
    public void showSpices() {
        System.out.println("\nSpices:");
        showCategory(spices);
    }

    // Display snacks HashMap
    public void showSnacks() {
        System.out.println("\nSnacks:");
        showCategory(snacks);
    }

    // Display beverages HashMap
    public void showBeverages() {
        System.out.println("\nBeverages:");
        showCategory(beverages);
    }

    // Helper function to display a specific category
    private void showCategory(HashMap<String, Integer> category) {
    	int i =1;
        for (Map.Entry<String, Integer> entry : category.entrySet()) {
            System.out.println(i+". "+entry.getKey() + " - ₹" + entry.getValue());
            i++;
        }
    }
    public void modifyPrice(int categoryNumber, String item, int newPrice) {
        switch (categoryNumber) {
            case 1:
                modifyVegetablePrice(item, newPrice);
                break;
            case 2:
                modifyFruitPrice(item, newPrice);
                break;
            case 3:
                modifyDairyPrice(item, newPrice);
                break;
            case 4:
                modifyStaplePrice(item, newPrice);
                break;
            case 5:
                modifySpicePrice(item, newPrice);
                break;
            case 6:
                modifySnackPrice(item, newPrice);
                break;
            case 7:
                modifyBeveragePrice(item, newPrice);
                break;
            default:
                System.out.println("Invalid category number. Please try again.");
                break;
        }
    }

    // Modify price in vegetables category
    private void modifyVegetablePrice(String item, int newPrice) {
        if (vegetables.containsKey(item)) {
            vegetables.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println("Item not found in vegetables.");
        }
    }

    // Modify price in fruits category
    private void modifyFruitPrice(String item, int newPrice) {
        if (fruits.containsKey(item)) {
            fruits.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println("Item not found in fruits.");
        }
    }

    // Modify price in dairy products category
    private void modifyDairyPrice(String item, int newPrice) {
        if (dairyProducts.containsKey(item)) {
            dairyProducts.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println("Item not found in dairy products.");
        }
    }

    // Modify price in staples category
    private void modifyStaplePrice(String item, int newPrice) {
        if (staples.containsKey(item)) {
            staples.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println("Item not found in staples.");
        }
    }

    // Modify price in spices category
    private void modifySpicePrice(String item, int newPrice) {
        if (spices.containsKey(item)) {
            spices.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println("Item not found in spices.");
        }
    }

    // Modify price in snacks category
    private void modifySnackPrice(String item, int newPrice) {
        if (snacks.containsKey(item)) {
            snacks.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println("Item not found in snacks.");
        }
    }

    // Modify price in beverages category
    private void modifyBeveragePrice(String item, int newPrice) {
        if (beverages.containsKey(item)) {
            beverages.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println("Item not found in beverages.");
        }
    }

	public void modifyPrice(int i, String item) {
		// TODO Auto-generated method stub
		switch (i) {
        case 1:
            modifyVegetablePrice(item);
            break;
        case 2:
            modifyFruitPrice(item);
            break;
        case 3:
            modifyDairyPrice(item);
            break;
        case 4:
            modifyStaplePrice(item);
            break;
        case 5:
            modifySpicePrice(item);
            break;
        case 6:
            modifySnackPrice(item);
            break;
        case 7:
            modifyBeveragePrice(item);
            break;
        default:
            System.out.println("Invalid category number. Please try again.");
            break;
    }
	}

	private void modifyBeveragePrice(String item) {
	    if (beverages.containsKey(item)) {
	        beverages.remove(item);
	        System.out.println(item + " has been removed from the beverages category.");
	    } else {
	        System.out.println("Item not found in beverages.");
	    }
	}


	private void modifySnackPrice(String item) {
	    if (snacks.containsKey(item)) {
	        snacks.remove(item);
	        System.out.println(item + " has been removed from the snacks category.");
	    } else {
	        System.out.println("Item not found in snacks.");
	    }
	}

	private void modifySpicePrice(String item) {
	    if (spices.containsKey(item)) {
	        spices.remove(item);
	        System.out.println(item + " has been removed from the spices category.");
	    } else {
	        System.out.println("Item not found in spices.");
	    }
	}

	private void modifyStaplePrice(String item) {
	    if (staples.containsKey(item)) {
	        staples.remove(item);
	        System.out.println(item + " has been removed from the staples category.");
	    } else {
	        System.out.println("Item not found in staples.");
	    }
	}

	private void modifyDairyPrice(String item) {
	    if (dairyProducts.containsKey(item)) {
	        dairyProducts.remove(item);
	        System.out.println(item + " has been removed from the dairy products category.");
	    } else {
	        System.out.println("Item not found in dairy products.");
	    }
	}

	private void modifyFruitPrice(String item) {
	    if (fruits.containsKey(item)) {
	        fruits.remove(item);
	        System.out.println(item + " has been removed from the fruits category.");
	    } else {
	        System.out.println("Item not found in fruits.");
	    }
	}

	private void modifyVegetablePrice(String item) {
	    if (vegetables.containsKey(item)) {
	        vegetables.remove(item);
	        System.out.println(item + " has been removed from the vegetables category.");
	    } else {
	        System.out.println("Item not found in vegetables.");
	    }
	}

	public void addVegList() {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		do {
			System.out.println("Enter the item to add:");
			s = sc.nextLine();
			if(vegetables.containsKey(s)) {
				System.out.println("The Item Is Already In The List!!!");
			}else {
				System.out.println("Enter the price:");
				int n = sc.nextInt();
				vegetables.put(s, n);
				c=1;
				System.out.println("The Item"+s+"is Added to Vegetables");
			}
		}while(c==0);
		
		
	}

	public void addFruitList() {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		do {
			System.out.println("Enter the item to add:");
			s = sc.nextLine();
			if(fruits.containsKey(s)) {
				System.out.println("The Item Is Already In The List!!!");
			}else {
				System.out.println("Enter the price:");
				int n = sc.nextInt();
				fruits.put(s, n);
				c=1;

				System.out.println("The Item"+s+"is Added to Fruits");
			}
		}while(c==0);
		
	}

	public void addSnackList() {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		do {
			System.out.println("Enter the item to add:");
			s = sc.nextLine();
			if(snacks.containsKey(s)) {
				System.out.println("The Item Is Already In The List!!!");
			}else {
				System.out.println("Enter the price:");
				int n = sc.nextInt();
				snacks.put(s, n);
				c=1;

				System.out.println("The Item"+s+"is Added to Snacks");
			}
		}while(c==0);
		
	}

	public void addDairyList() {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		do {
			System.out.println("Enter the item to add:");
			s = sc.nextLine();
			if(dairyProducts.containsKey(s)) {
				System.out.println("The Item Is Already In The List!!!");
			}else {
				System.out.println("Enter the price:");
				int n = sc.nextInt();
				dairyProducts.put(s, n);
				c=1;

				System.out.println("The Item"+s+"is Added to Dairy Products");
			}
		}while(c==0);
		
	}

	public void addStaplesList() {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		do {
			System.out.println("Enter the item to add:");
			s = sc.nextLine();
			if(staples.containsKey(s)) {
				System.out.println("The Item Is Already In The List!!!");
			}else {
				System.out.println("Enter the price:");
				int n = sc.nextInt();
				staples.put(s, n);
				c=1;

				System.out.println("The Item"+s+"is Added to Staples");
			}
		}while(c==0);
		
	}

	public void addSpicesList() {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		do {
			System.out.println("Enter the item to add:");
			s = sc.nextLine();
			if(spices.containsKey(s)) {
				System.out.println("The Item Is Already In The List!!!");
			}else {
				System.out.println("Enter the price:");
				int n = sc.nextInt();
				spices.put(s, n);
				c=1;

				System.out.println("The Item"+s+"is Added to Spices");
			}
		}while(c==0);
		
	}

	public void addBeverList() {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		do {
			System.out.println("Enter the item to add:");
			s = sc.nextLine();
			if(beverages.containsKey(s)) {
				System.out.println("The Item Is Already In The List!!!");
			}else {
				System.out.println("Enter the price:");
				int n = sc.nextInt();
				beverages.put(s, n);
				c=1;

				System.out.println("The Item"+s+"is Added to Beverages");
			}
		}while(c==0);
		
	}

}
