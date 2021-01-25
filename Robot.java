import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Robot{
   
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      int i = 1;
      int rounds = 1;
      
      while (rounds > 0){
      System.out.println("Hello what is your name? One word pls :/");
      customer new_customer = new customer(scanner.next(), i);
      System.out.println("Hello, " + new_customer.customer);
      
      System.out.println("How many people are in your party?");
      int result = Integer.parseInt(scanner.next());
      
      System.out.println("Your table number is " + new_customer.table + " please go to your table");
      
      taking_orders(result, new_customer);
      rounds --;
      i ++;
      }
      
   }
      public static int taking_orders(int result, customer new_customer){
      Scanner scanner = new Scanner(System.in);
      ArrayList<String>arr = new ArrayList<String>();
      ArrayList<Integer>arr_price = new ArrayList<Integer>();
      
      while (result > 0) { // while there are still people in the party, keep taking their order


      System.out.println("Do you want a hamburger? (Y) or (N)");
      String the_hamburger = scanner.next();
      if (the_hamburger.contains("y") || the_hamburger.contains ("Y")){ 
         order new_order = new order("hamburger", 5);
         arr.add(new_order.order);
         arr_price.add(new_order.price);
        }
      else{
         System.out.println("okay no need to be so rude");
      }
        
      System.out.println("Do you want fries? (Y) or (N)");
      String the_fries = scanner.next();
      if (the_fries.contains("y") || the_fries.contains("Y")){
         order new_order = new order("fries", 3);
         arr.add(new_order.order);
         arr_price.add(new_order.price);
         }
      else{
         System.out.println("okay no need to be so rude");
      }
      
      System.out.println("I have your order");
      
      result --;
      }
      
      System.out.println("Let me put in your order and get your food");
      
      System.out.println(new_customer.customer + " at table " + new_customer.table);
      System.out.println("Here is your total order" + arr); 
      System.out.println("Your prices are" + arr_price);
      
      return result;
      }
      
      


}
