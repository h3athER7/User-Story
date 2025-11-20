import java.util.Scanner;

public class UserStory {

/*
* 1D arrays for files
*/
private String[] foods;
private String[] foodType;
private String[] vendors;
private int[] calories;
private String[] ffVendors = {
  "McDonalds", "KFC", "Burger King", 
  "School Lunch", "Wendys", "Chick-Fil-A", 
  "Popeyes", "Potato Corner", "Baskin Robbins", 
  "Taco Bell", "IHOP", "Digiorno", "Dominos", 
  "Little Caesars", "Papa Johns", "Pizza Hut", "Arbys",
  "Subway"
};
private String[] ffFoods= {
  "Biscuit", "French Toast", "Burger", "Fish", "Burrito", 
  "Taco", "Chicken", "Hash Brown", "Fries", "Ice cream",
  "Nachos", "Pancakes", "Pizza", "Coleslaw", "Salad", "Sandwich",
  "Waffle"
};
/*
* scanner method for user to choose which
* method to start with
*/
public void startProgram() {
  Scanner input = new Scanner(System.in);
  boolean running=true;
  while(running) {
  System.out.print("Choose 1 or 2 \n >");
  String choice= input.nextLine();
 
  if(choice.equals("1")) {
    start();
    running=shouldContinue();
  } else if(choice.equals("2")) {
    begin();
    running=shouldContinue();
  } else {
    System.out.println("That's not a choice, try again!");
    running=shouldContinue();
  }
  }
  
}

  /*
  * method for continuing the program
  * if user wishes to
  */
 public boolean shouldContinue() {
    Scanner input = new Scanner(System.in);
    boolean found = false;
    boolean isRunning = true;
    
    while (!found) {
      System.out.println("Would you like to continue? (yes or no)");
      System.out.print("> "); 
      String choice = input.nextLine();
      if (choice.equals("yes")) {
        isRunning = true;
        found = true;
      } else if (choice.equals("no")) {
        isRunning = false; 
        found = true;
      } else {
        System.out.println("That's not a choice, try again!");
      }
    } 
   input.close();
    return isRunning;
 }
  

  /*
  * scanner method for users to interact and type out a vendor
  * to find which item has the most calories under that vendor
  */
  public void start() {
    Scanner input = new Scanner(System.in);
    // ask the user to choose a vendor
System.out.println("Choose vendor to find their most caloric item: ");
    // print out all vendor options
System.out.println("(McDonalds, KFC, Burger King, School Lunch, Wendys, Chick-Fil-A, \n Popeyes, Potato Corner, Baskin Robbins, Taco Bell, IHOP, Digiorno, \n Dominos, Little Caesars, Papa Johns, Pizza Hut, Arbys, or Subway) \n ");
    String choice = input.nextLine();
    // call numMostCalories() with the user's chosen vendor
boolean found = false;

for (int i = 0; i < ffVendors.length; i++) {
    if (choice.equals(ffVendors[i])) {
        found = true;
    }
}
    if (found) {
    System.out.println(numMostCalories(choice));
} else {
    System.out.println("That's not a choice, try again!");
      
}
  } 
/*
* method for printing out
* most caloric item under vendor
*/  
  public String numMostCalories(String vendor) {
    int max=0;
    String result= "";
 
    for (int i=0; i < foods.length; i++) {
      // Check to see if its the same vendor
      if (calories[i] > max && vendors[i].equals(vendor)) {
        max= calories[i];
        result= "\n" + vendor + "'s most caloric item has " + max + " calories. \n This item is the " + foods[i] + ". \n" ;
      }
    }
    return result;
  }
/*
* method for naming what food item has the most calories
* for that specific food item
*/
   public void begin() {
    Scanner input = new Scanner(System.in);
    // ask the user to name a food
System.out.println("Name a food to find its most caloric version: ");
    // print out all food options
System.out.println("(Biscuit, French Toast, Burger, Fish, Burrito, Taco, \nChicken, Hash Brown, Fries, Ice cream, Nachos, Pancakes, \nPizza, Coleslaw, Salad, Sandwich, or Waffle) \n ");
    String choice = input.nextLine();
    // call foodMostCalories() with the user's chosen vendor
boolean found = false;

for (int i = 0; i < ffFoods.length; i++) {
    if (choice.equals(ffFoods[i])) {
        found = true;
    }
}
    if (found) {
    System.out.println(foodMostCalories(choice));
} else {
    System.out.println("That's not a choice, try again!");
}
  } 

  public String foodMostCalories(String food) {
    int max=0;
    String result= "";
 
    for (int i=0; i < foodType.length; i++) {
      // Check to see if its the same food
      if (calories[i] > max && foodType[i].equals(food)) {
        max= calories[i];
        result= "\n" + food + "'s most caloric version has " + max + " calories. \nThis item is the " + foods[i] + " from " + vendors[i] + ". \n";
      }
    }
    return result;
  }  
  
/*
* method for printing
* food items by vendor
*/
  public UserStory(String foodNameFile, String foodTypeFile, String vendorFile, String caloriesFile) {
    this.foods = FileReader.toStringArray(foodNameFile);
    this.foodType= FileReader.toStringArray(foodTypeFile);
    this.vendors = FileReader.toStringArray(vendorFile);
    this.calories= FileReader.toIntArray(caloriesFile);
  }
/*
* toString method
*/
  public String toString() {
    String result = "Fast food items: \n";
    for (int i = 0; i < foods.length; i++) {
      result += "Fast food name: " + foods[i] + "- Vendor: "  + vendors[i] + "- Calories: " + calories[i];
      result += "\n"; 
    }
    return result;
  } 
}