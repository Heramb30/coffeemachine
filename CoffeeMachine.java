    package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");
    Scanner sc=new Scanner(System.in);
    
    
    
      System.out.println("Write how many ml of water the coffee machine has:");
      int a=sc.nextInt();
      System.out.println("Write how many ml of milk the coffee machine has:");
      int b=sc.nextInt();
      System.out.println("Write how many grams of coffee beans the coffee machine has:");
      int c=sc.nextInt();
      System.out.println("Write how many cups of coffee you will need:");
      int x=sc.nextInt();
      int min;
      if(a/200<=b/50)
      {
          if(a/200<=c/15)
          min = a/200;
          else
          min = c/15;
          
      }
      else
      {
          if(b/50<=c/15)
          min = b/50;
          else
          min = c/15;
      }
      if(min==x)
      System.out.println("Yes, I can make that amount of coffee");
      else if(min>x)
      System.out.println("Yes, I can make that amount of coffee (and even "+(min-x)+" more than that)");
      else
      System.out.println("No, I can make only "+min+" cup(s) of coffee");
    
    
    
    
    }
    
}
