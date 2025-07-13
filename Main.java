

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OnlineOrdering;

import java.util.Scanner;


/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean customerloop = true, LorRloop = true, userloop = true, staffloop = true;
       
        String foodId = null,foodName,riceType,noodleType,type = null,option="",paymentMethod="",cardName="";
                  int foodQuantity;
                  double rm;
                  
                 
       Food food[] = new Food[2];
        User user[] = new User[2];
        Reservation reservation[] = new Reservation[1];
        boolean loginstatus = false;
        
    user[0] = new Staff("AB123", "Staff", "abc123456", 123456789, "123,Jalan Duta, Lorong 2", "stafffos@gmail.com");
    
    
    while(userloop == true){
    System.out.println("Welcome to Online Ordering System");
    System.out.println("Choose Your UserType [1:Customer 2:Staff 3.Exit]:");
    int usertype = sc.nextInt();
    
    while(LorRloop=true){
       if(usertype==1){
           System.out.println("1. Sign Up 2. Login 3.Exit");
           int LorR= sc.nextInt();
           sc.nextLine();
       
        if (LorR==1){
            System.out.println("Enter Your Name");
            String rname = sc.nextLine();
            System.out.println("Enter Your ID");
            String rid = sc.nextLine();
            System.out.println("Enter Your Email");
            String remail = sc.nextLine();
            System.out.println("Enter Your password");
            String rpassword = sc.nextLine();
            System.out.println("Enter Your Phone Number");
            int rphone = sc.nextInt();
                         sc.nextLine();
            System.out.println("Enter Your Address");
            String raddress = sc.nextLine();
            user[1] = new Customer(rid, rname, rpassword, rphone, raddress, remail);

        }

        if (LorR==2){
            //Login
            String cidinput = "";
            String cpasswordinput = "";
             while(loginstatus == false){
                 System.out.println("Login");
                 System.out.println("Enter ID: ");
                 cidinput = sc.nextLine();
                 System.out.println("Enter Password: ");
                 cpasswordinput = sc.nextLine();
                 if(cidinput.equals(user[1].getid()) && cpasswordinput.equals(user[1].getPassword())){
                    loginstatus = true;
                    System.out.println("Login Success");
                 }else{
                     System.out.println("Login Failed");
                    }
                    while (customerloop == true){
                        System.out.println("1. View Menu 2.Place Order 3.Make Reservation 4.View Resit 5.Make Payment 6.Exit");
                        int customerchoice= sc.nextInt();
                        sc.nextLine();
                        
                        if (customerchoice==1){
                        
                             option=sc.nextLine();
                         if(option.equals("1")){
                      //View MENUUUUUUU FUNCTIONNNNNNNNNNNNNNNNNNNNNNNNNNNNNN STARTTTT
                       //FOOD MENU FUNCTIONNNNNNNNNNNNNNNNNNN STARTTT      (FOR CUSTOMER FUNCTION)
                      System.out.println("Function: View Menu "+option);
                      System.out.println("Food Name:RICE: 1) Nasi Lemak (RM20)  2) Nasi Ayam(RM20) | Noodles: 3) Mee Ayam(RM20)  4) Mee Siam(RM20) ");

                  }
                        }
                        
                        if (customerchoice==2){
                            System.out.print("Function: Place Order"+option);
                      System.out.print("Enter Food Name: ");
                      foodName=sc.nextLine();
                      
                      if(foodName.equals("1")){
                      System.out.print("Enter Food Name: Nasi Lemak \n"+foodName);
                      }

                      else if(foodName.equals("2")){
                      System.out.print("Enter Food Name: Nasi Ayam \n"+foodName);
                      }

                      else if(foodName.equals("3")){
                      System.out.print("Enter Food Name: Mee Ayam \n"+foodName);
                      }
                      
                      else if(foodName.equals("4")){
                      System.out.print("Enter Food Name: Mee Siam \n"+foodName);
                      }

                      System.out.print("Enter Food Quantity: ");
                      foodQuantity = sc.nextInt();
                      sc.nextLine(); // Consume newline character

                      System.out.print("Enter Food Type (Rice/Noodle): ");
                      type = sc.nextLine();
                        }
                        
                        int i = 0; // Declare the variable i

                        if (customerchoice == 3) {
                            System.out.println(" Make Reservation");
                            System.out.println("Enter Date (DAY): ");
                            int day = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Month: ");
                            int month = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Year: ");
                            int year = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Number of Customer: ");
                            int numofCustomer = sc.nextInt();
                            sc.nextLine();
                            reservation[0] = new Reservation((Customer) user[1], user[1].getUsername(), day, month, year, numofCustomer);
                            System.out.println("Reservation Date: " + reservation[i].getDay() + "/" + reservation[i].getMonth() + "/" + reservation[i].getYear());
                        }
                        
                        if (customerchoice==4){
                            
                            
                            System.out.println("Receipt Details:");
                            if(food[0]!=null){
                            System.out.println("Product: "+food[0].getFoodName());
                            
                            }if(food[1]!=null){
                             System.out.println("Product: "+food[0].getFoodName());   
                            }
                            
                            System.out.println("Payment Method: " + paymentMethod);
                            System.out.println("Card Name: " + cardName);
                             System.out.println("Payment Made: RM "+(((Rice)food[0]).totalRicePrice()+((Noodle)food[1]).totalNoodlePrice()));
                            
                            
                            
                        }
                        
                        if (customerchoice==5){
                             
            int cardNum,cvv,expiredate;
        
        
        System.out.println("        Payment PAGE   ");
        System.out.println("Total Price : RM"+(((Rice)food[0]).totalRicePrice()+((Noodle)food[1]).totalNoodlePrice()));
        System.out.print("Choose Payment Method: 1) Debit Card /t 2) Credit Card ");
        paymentMethod=sc.nextLine();
        
        if(paymentMethod.equals("1")){
            
            
            System.out.print("Please Enter Your Card Name: ");
            cardName=sc.nextLine();
            System.out.print("Please Enter Your Card Number: ");
            cardNum=sc.nextInt();
            sc.nextLine();
            System.out.print("Please Enter Your CVV Number: ");
            cvv=sc.nextInt();
            sc.nextLine();
            System.out.print("Please Enter Bank Card Expiration date: ");
            expiredate=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Digit Paying(RM): ");
            rm = sc.nextDouble();
            sc.nextLine();
            //rm is for the amounmt that customer have to pay 
            
            
            //Print total payment
            System.out.println("Receipt Details ");
            System.out.println("Payment Method: Debit Card");
            System.out.println("Card Name: "+cardName);
            System.out.println("Card Number: "+cardNum);
            System.out.println("CVV Number: "+cvv);
            System.out.println("Bank Expire Date: "+expiredate);
            if(food[0]!=null){
            System.out.println("Payment Made: RM "+((Rice)food[0]).totalRicePrice());
            }
            else if (food[1]!=null){
            System.out.println("Payment Made: RM "+((Noodle)food[1]).totalNoodlePrice());
            }
            else if (food[0]!=null && food[1]!=null){
            System.out.println("Payment Made: RM "+(((Rice)food[0]).totalRicePrice()+((Noodle)food[1]).totalNoodlePrice()));  
        }

       else if (paymentMethod.equals("2")) {
        
            System.out.print("Please Enter Your Card Name: ");
            cardName=sc.nextLine();
            System.out.print("Please Enter Your Card Number: ");
            cardNum=sc.nextInt();
            sc.nextLine();
            System.out.print("Please Enter Your CVV Number: ");
            cvv=sc.nextInt();
            System.out.print("Please Enter Bank Card Expiration date: ");
            expiredate=sc.nextInt();
            System.out.println("Enter Digit Paying(RM): ");
            rm=sc.nextDouble();
            
            //Print total payment
            System.out.println("Receipt Details ");
            System.out.println("Payment Method: Credit Card");
            System.out.println("Card Name: "+cardName);
            System.out.println("Card Number: "+cardNum);
            System.out.println("CVV Number: "+cvv);
            System.out.println("Bank Expire Date: "+expiredate);
            System.out.println("Payment Made: RM "+rm); 
            
        }
                            
                        }
                        
        if (customerchoice==6){
            customerloop=false;
                            
            }
   
       
        }
       }
       if (LorR==3){
           LorRloop = false;
       }
    }
        if (usertype==2){
            //Staff

            while(loginstatus == false){
            System.out.println("Login as Staff");
            System.out.println("Enter ID: ");
            String sidinput = sc.nextLine();
            System.out.println("Enter Password: ");
            String spasswordinput = sc.nextLine();
            if(sidinput.equals(user[0].getid()) && spasswordinput.equals(user[0].getPassword())){
                loginstatus = true;
                System.out.println("Login Success");
            }
            else{
                System.out.println("Login Failed");
            }
        
            }
            while (staffloop == true){
                System.out.println(" Modify Reservation");
                            System.out.println("Enter Date (DAY): ");
                            int day = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Month: ");
                            int month = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Year: ");
                            int year = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Number of Customer: ");
                            int numofCustomer = sc.nextInt();
                            sc.nextLine();
                            ModifyReservation modifyReservation = new ModifyReservation(day, month, year);
                            reservation[0] = new Reservation((Customer) user[1], user[1].getUsername(), modifyReservation.getModifyDay(), modifyReservation.getModifyMonth(), modifyReservation.getModifyYear(), numofCustomer);
                            System.out.println("Reservation Date: " + reservation[0].getDay() + "/" + reservation[0].getMonth() + "/" + reservation[0].getYear());
                // Continue with Staff Function
            }
        }

        if (usertype==3){
            userloop = false;
        }
    }
             }
    
            }
        }
    }
}
