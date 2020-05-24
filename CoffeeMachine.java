    package machine;
import java.util.Scanner;
import java.lang.*;
public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");
    Scanner sc=new Scanner(System.in);
    
    
      
      // new code
      int milk=540,bean=120,water=400,cup=9,money=550;
      String action;
      
      
      while(true)
      {
      System.out.println("Write action (buy, fill, take, remaining, exit):");
      action=sc.next();
       
       switch(action)
       { 
           
      
      
       case "remaining" :
          System.out.println("The coffee machine has");
          System.out.println(water+" of water\n"+milk+" of milk\n"+bean+" of coffee beans\n"+cup+" of disposable cups\n"+money+" of money");
           break;
           
    
      case "exit" :
         System.exit(0);
           break;
       case "take" :
              System.out.println("I gave you $"+money);
             money=0;
             break;
       case "fill" :
              System.out.println("Write how many ml of water do you want to add:");
             int pq=sc.nextInt();
             water=water+pq;
             System.out.println("Write how many ml of milk do you want to add: ");
             pq=sc.nextInt();
             milk=milk+pq;
             System.out.println("Write how many grams of coffee beans do you want to add:");
             pq=sc.nextInt();
             bean=bean+pq;
             System.out.println("Write how many disposable cups of coffee do you want to add:");
             pq=sc.nextInt();
             cup=cup+pq;
             break;
          case "buy" :
              System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
              String num=sc.next();
              if(num.equals("1"))
              {
                  if(water<250 || bean<16)
                  {  System.out.print("sorry ,not enough ");
                      if(water<250)
                       System.out.print("water ");
                       if(bean<16)
                       System.out.print("and bean");
                       System.out.println("!");
                      
                  }
                  else
                  {  System.out.println("I have enough resources, making you a coffee!");
                     water=water-250;
                     bean=bean-16;
                     money=money+4; 
                     cup=cup-1;
                  }
                  
              break;}
              else if(num.equals("2"))
              {
                  if(water<350 || bean<20 || milk<75)
                  {
                      System.out.print("sorry ,not enough ");
                      if(water<350)
                       System.out.print("water ");
                       if(bean<20)
                       System.out.print("and bean");
                       if(milk<75)
                       System.out.print("and milk");
                       System.out.println("!");
                  }
                  else
                  {
                    System.out.println("I have enough resources, making you a coffee!");
                     water=water-350;
                     bean=bean-20;
                     money=money+7;
                     milk=milk-75; 
                   cup=cup-1;
                  }
              break;}
              
                  else if(num.equals("3"))
                  {
                       if(water<200 || bean<12 || milk<100)
                  {
                      
                      System.out.print("sorry ,not enough ");
                      if(water<200)
                       System.out.print("water ");
                       if(bean<12)
                       System.out.print("and bean");
                       if(milk<100)
                       System.out.print("and milk");
                       System.out.println("!");
                  }
                        else
                  {
                    System.out.println("I have enough resources, making you a coffee!");
                     water=water-200;
                     bean=bean-12;
                     money=money+6;
                     milk=milk-100; 
                   cup=cup-1;
                  }
              break;}
              else
              {
                  break;
              }
              default :
                 System.out.println("Plz enter valid action");
          }
        
    
    
    }
    
}
}
