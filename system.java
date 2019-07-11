import java.util.*;
public class system
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        
       Queue infoQ=new Queue(); //original queue
       Queue tempInfoQ=new Queue(); //temporary queue
       Queue rentInfo=new Queue();
       Queue rentList=new Queue(); //rent information after return
       Stack carMPV=new Stack();
       Stack carSport=new Stack();
       Stack carSedan=new Stack();
       Stack rentMPV=new Stack();
       Stack rentSport=new Stack();
       Stack rentSedan=new Stack();
       
       String plate;
       //sport car
       for(int i=0;i<1;i++)
       {
           carSport.push(plate="DBX5445");
           carSport.push(plate="DBX5442");
           carSport.push(plate="DBX5448");
        }
        
       //mpv car
       for(int i=0;i<1;i++)
       {
           carMPV.push(plate="DBX5436");
           carMPV.push(plate="DBX5437");
           carMPV.push(plate="DBX5438");
       }
       
       //sedan car
       for(int i=0;i<1;i++)
       {
           carSedan.push(plate="DBX5225");
           carSedan.push(plate="DBX5226");
           carSedan.push(plate="DBX5228");
       }
        
       Object rent;
       int qMPV=3;
       int qSport=3;
       int qSedan=3;
       String resp="yes";
       while(resp.equalsIgnoreCase("yes")||resp.equalsIgnoreCase("YES"))
       {
            System.out.println("Status : RENT/RETURN");
            System.out.println("Enter rent/RENT to rent a car");
            System.out.println("Enter return/RETURN to returned a car");
            System.out.println("");
            System.out.print("Rent status is : ");
            String status=sc.next();
            
            if(status.equalsIgnoreCase("rent")||status.equalsIgnoreCase("RENT"))
            {
                System.out.print("         ---------------------------------------------------------------------------------------------------------------------------------------"); 
                System.out.print("\n         ***************************************************WELCOME TO MUDOHH BASO RENTAL CAR SDN. BHD******************************************");
                System.out.print("\n         ---------------------------------------------------------------------------------------------------------------------------------------");
                 
                System.out.println();
                System.out.println();
                System.out.print("\n          TYPE OF CAR            NAME OF CAR    QUANTITY OF CAR      PRICE PER HOURS          PRICE PER HALF DAYS           PRICE PER DAYS");
                System.out.print("\n             MPV                     ALZA              "+qMPV+"                 RM 10.00                   RM 84.00                    RM 120.00  ");
                 
                System.out.println();
                System.out.print("\n            SPORT                   SKYLINE            "+qSport+"                 RM 50.00                   RM 420.00                   RM 600.00  ");
                 
                System.out.println();
                System.out.print("\n            SEDAN                    SAGA              "+qSedan+"                 RM 25.00                   RM 210.00                   RM 300.00  ");
                 
                System.out.println();
                System.out.print("\n         ---------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("\n         ***************************************************************************************************************************************");
                System.out.println("\n         ---------------------------------------------------------------------------------------------------------------------------------------");
                //information about renter
                System.out.println("Please insert the information to rent a car");
                System.out.print("");
                System.out.print("Enter name : ");
                String name=sc.next();
                System.out.print("Enter ic number : ");
                String ic=sc.next();
                System.out.print("Enter age : ");
                int age=sc.nextInt();
                System.out.print("Enter gender : ");
                String gender=sc.next();
                System.out.print("Type of car : ");
                String typeCar=sc.next();
                System.out.print("Enter day to rent : ");
                int day=sc.nextInt();
                System.out.print("Enter hour to rent : ");
                int hour=sc.nextInt();
               
                user u=new user(name,ic,age,gender,typeCar,day,hour);
                infoQ.enqueue(u);
                
                Object da;
                Object data;
                user us;
                
                while(!infoQ.isEmpty())
                {
                     da=infoQ.dequeue();
                     us=(user)da;
                         
                    if(us.getTypeCar().equalsIgnoreCase("MPV")||us.getTypeCar().equalsIgnoreCase("mpv"))
                    {
                          rent=carMPV.pop();
                          if (rent!=null)
                          {
                                System.out.println("Car is ready to use");
                                System.out.println("Plat number : "+rent);
                                System.out.println("DRIVE CAREFULLY!");
                                rentMPV.push(rent);
                                qMPV--;
                          }
                          else
                          {
                                System.out.println("Sorry! Car is not available");
                          }
                                              }
                    else if(us.getTypeCar().equalsIgnoreCase("SPORT")||us.getTypeCar().equalsIgnoreCase("sport"))
                    {
                          rent=carSport.pop();
                          if (rent!=null)
                          {
                              System.out.println("Car is ready to use");
                              System.out.println("Plat number : "+rent);
                              System.out.println("DRIVE CAREFULLY!");
                              rentSport.push(rent);
                              qSport--;
                          }
                          else
                          {
                              System.out.println("Sorry! Car is not available");
                          } 
                    }
                    else if(us.getTypeCar().equalsIgnoreCase("sedan")||us.getTypeCar().equalsIgnoreCase("SEDAN"))
                    {
                          rent=carSedan.pop();
                          if(rent!=null)
                          {
                              System.out.println("Car is ready to use");
                              System.out.println("Plat number: "+rent);
                              System.out.println("DRIVE CAREFULLY!");
                              rentSedan.push(rent);
                              qSedan--;
                          }
                          else
                          {
                              System.out.println("Sorry! Car is not available");
                          } 
                    }
                    tempInfoQ.enqueue(us);
                }           
            }
            else if(status.equalsIgnoreCase("return")||status.equalsIgnoreCase("RETURN"))
            {
                Object z;
                user y;
                System.out.print("");
                System.out.print("Enter name : ");
                String n = sc.next();
                System.out.print("Enter type of car rent : ");
                String t = sc.next();
                System.out.print("Enter car plat number : ");
                String num = sc.next();
                System.out.print("");
                
                double totald=0.00;
                double total=0.00;
                double ttalPrice=0.00;
                while(!tempInfoQ.isEmpty())
                {
                    z=tempInfoQ.dequeue();
                    y=(user) z;
                    
                    double nDay=y.getDay();
                    double nHour=y.getHour(); 
                    if(y.getName().equalsIgnoreCase(n))
                    {
                        if(y.getTypeCar().equalsIgnoreCase("MPV")||y.getTypeCar().equalsIgnoreCase("mpv"))
                        {
                            carMPV.push(num);
                            qMPV++;
                            if(y.getDay()>0)
                            {
                               System.out.println("You rent ALZA for " + y.getDay() +" day");
                               totald=120.00*nDay;
                               System.out.println("The price is : RM"+totald);
                            }
                            if(y.getHour()<12)
                            {
                               System.out.println("You rent ALZA for " + y.getHour() +" hour");
                               total=10.00*nHour;
                               System.out.println("The price is : RM"+total);
                            }
                            else if(y.getHour()==12)
                            {
                               System.out.println("You rent ALZA for " + y.getHour() +" hour");
                               total=84.00;
                               System.out.println("The price is : RM"+total);
                            }
                            else if(y.getHour()>12 && y.getHour()<24)
                            {
                               System.out.println("You rent ALZA for " + y.getHour() +" hour");
                               total=10.00*nHour;
                               System.out.println("The price is : RM"+total);
                            }
                            System.out.println("Total : RM"+(ttalPrice=totald + total));        
                        }
                    }
                    else if(y.getTypeCar().equalsIgnoreCase("SPORT")||y.getTypeCar().equalsIgnoreCase("sport"))
                    {
                           carSport.push(num);
                           qSport++;
                           if(y.getDay()>0)
                           {
                               System.out.println("You rent SKYLINE for " + y.getDay() +" day");
                               totald=600.00*nDay;
                               System.out.println("The price is : RM"+totald);
                           }
                           if(y.getHour()<12)
                           {
                               System.out.println("You rent SKYLINE for " + y.getHour() +" hour");
                               total=50.00*nHour;
                               System.out.println("The price is : RM"+total);
                           }
                           else if(y.getHour()==12)
                           {
                               System.out.println("You rent SKYLINE for " + y.getHour() +" hour");
                               total=420.00;
                               System.out.println("The price is : RM"+total);
                           }
                           else if(y.getHour()>12 && y.getHour()<24)
                           {
                               System.out.println("You rent SKYLINE for " + y.getHour() +" hour");
                               total=50.00*nHour;
                               System.out.println("The price is : RM"+total);
                           }
                           System.out.println("Total : RM"+(ttalPrice=totald + total));    
                    }
                    else if(y.getTypeCar().equalsIgnoreCase("sedan")||y.getTypeCar().equalsIgnoreCase("SEDAN"))
                    {
                           carSedan.push(num);
                           qSedan++;
                           if(y.getDay()>0)
                           {
                               System.out.println("You rent WIRA for " + y.getDay() +" day");
                               totald=240.00*nDay;
                               System.out.println("The price is : RM"+totald);
                           }
                           if(y.getHour()<12)
                           {
                               System.out.println("You rent WIRA for " + y.getHour() +" hour");
                               total=20.00*nHour;
                               System.out.println("The price is : RM"+total);
                           }
                           else if(y.getHour()==12)
                           {
                               System.out.println("You rent WIRA for " + y.getHour() +" hour");
                               total=168.00;
                               System.out.println("The price is : RM"+total);
                           }
                           else if(y.getHour()>12 && y.getHour()<24)
                           {
                               System.out.println("You rent WIRA for " + y.getHour() +" hour");
                               total=20.00*nHour;
                               System.out.println("The price is : RM"+total);
                           }
                           System.out.println("Total : RM"+(ttalPrice=totald + total));    
                    }
                    rentList.enqueue(y);
                }    
            }  
            else
            {
                System.out.println("Status error!!!");
            }
            System.out.println("");
            System.out.print("Do you want to continue (yes/no): ");
            resp=sc.next();
            System.out.println("");
        }
    }
}