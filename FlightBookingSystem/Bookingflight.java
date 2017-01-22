import java.io.*;
import java.lang.IndexOutOfBoundsException;
import java.lang.NumberFormatException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 
Hello !!! This is Idrees Dargahwala from STD X
I made this flight booking travel agency as my STD X Board Project.... 
*/
public class Bookingflight{

    Scanner userInput = new Scanner(System.in);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    
    public static void main(String[]args) throws IOException
    {
        Scanner userInput = new Scanner(System.in);
        int opt;
        
        
    
     System.out.println("                                                       **                       ");
     System.out.println("                                                     **  **                     ****"); 
     System.out.println("                                                   **    **                    ** **");
     System.out.println("                                                **       **                  **   **");
     System.out.println("                                              **         **               **      **");
     System.out.println("                                       ***********************************        **");     
     System.out.println("                                     *                                            **");
     System.out.println("                                   *                                              **");
     System.out.println("                                     *                                            **");
     System.out.println("                                       *********************************************");
     System.out.println("                                             **          **                       "); 
     System.out.println("                                               **        **                       "); 
     System.out.println("                                                  **     **                       ");
     System.out.println("                                                     **  **                       ");
     System.out.println("                                                        **                       ");
     System.out.println();
     
        boolean validuser = false;
    do{   
        System.out.println("                                *************************************");
        System.out.println("                                 WELCOME TO iDROID'S TRAVEL BOOKING");  
        System.out.println("                                *************************************");
        System.out.println("\f");
        System.out.println("1. Continue");
        System.out.println("2. Exit");
        
        System.out.print("Please Choose :- ");
        opt = userInput.nextInt();
        
        switch(opt)
        {
            case 1: System.out.println();
                    managerlogin();
                    validuser = true;
                
            case 2: System.out.println("Thank You !!!");
                    System.exit(0);
                            break;
                
            default: System.out.println("Incorrect Entry");
                            break;
        }
    }while(validuser == false);
    }
        public static void managerlogin() throws IOException // the manager will login to book tickets
        {
            boolean flag = false;
            do{
                
            
            Scanner input = new Scanner(System.in);
            
            String password = "admin";
            String username = "admin1234";
            
            System.out.print("Enter Username :- ");
            String username1 = input.next();
            
            System.out.print("Enter Password :- ");
            String pass = input.next();
            System.out.println();
    
            if(username1.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password))
            {
                System.out.println("Welcome Manager !!!");
                System.out.println();
                selectBooking();
                flag = true;
            }
            else
            {
                System.out.println("Incorrect Username or Password !!!! ");
                flag = false;
            }
            }while(flag == false);
        }
        
        public static void selectBooking() throws IOException // Where does the customer travel ? India OR Abroad
        {
            Scanner userInput = new Scanner(System.in);
            boolean flag = false;
            boolean flag1 = false;
            int opt1 = 0;
            
            do{
               do{  
                 try{   
                        System.out.println("Where Do You Want To Travel");// Ask the user where he wants to travel
                        System.out.println();
                        System.out.println("1. India");
                        System.out.println("2. International");
                        System.out.println("3. Exit");
                        System.out.println();
                        System.out.print("Enter Choice 1,2 or 3 :- ");
                        flag = true;
                        
                        opt1 = userInput.nextInt();
                        System.out.println();
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Please Enter The Correct Choice !!");
                        System.out.println();
                    }        
               }while(flag == false);
              
                    switch(opt1)
                    {
                        case 1: India();// This will go to method India
                                flag1 = true;
                                break;
                            
                        case 2: Abroad();// This will go to method Abroad
                                flag1 = true;
                                break;
                        
                        case 3: System.out.println("Thank You !!! Visit Again !!!");
                                System.exit(0);
                                break;
                            
                        default: System.out.println("Invalid !! Enter 1 or 2 ONLY !!");
                               flag1 = false;
                                break;
                    }
            }while(flag1 == false);        
            
        
        }
        public static void India() throws IOException // Method India 
        {
            Scanner userInput = new Scanner(System.in);
            
            int flag=0;
            String fromplace;
            String toplace;
            int fromno=-1;
            int tono=-1;
                do
                {
                    String places[] = new String[20]; //array declared for Indian Destinations
                    places[0] = "Mumbai";
                    places[1] = "Bangalore";
                    places[2] = "Ooty";
                    places[3] = "Kashmir";
                    places[4] = "Shimla";
                    places[5] = "Srinagar";
                    places[6] = "Chennai";
                    places[7] = "Kolkata";
                    places[8] = "Delhi";
                    places[9] = "Ahmedabad";
                    places[10] = "Nagpur";
                    places[11] = "Lucknow";
                    places[12] = "Vizag";
                    places[13] = "Sikkim";
                    places[14] = "Darjeeling"; 
                    places[15] = "Goa";
                    places[16] = "Mussourie";
                    places[17] = "Ladakh";
                    places[18] = "Kochi";
                    places[19] = "Jamshedpur";

                    System.out.println("These are the places in India for which we book air tickets");//Display of the places
                    System.out.println("Mumbai      Bangalore     Kashmir    Ooty      Shimla"); 
                    System.out.println("Srinagar    Chennai       Kolkata    Delhi     Ahmedabad");
                    System.out.println("Nagpur      Lucknow       Vizag      Sikkim    Darjeeling");
                    System.out.println("Goa         Musssourie    Ladakh     Kochi     Jamshedpur");


                    System.out.print("Please enter departure city(you want to fly from the list) :- ");            
                    fromplace = userInput.next(); 
                    
                    System.out.println();
                    
                    System.out.print("Please Enter the arrival city(from the list) :- ");// Ask the user where he wants to go in India
                    toplace = userInput.next();
                    
                    if(fromplace.equalsIgnoreCase(toplace))
                    {
                        System.out.println("Please enter different destination and a different source.");
                        System.out.println("If the source and destination is same the there is no need to travel");  
                        System.out.println("See the places again and Select your destination properly");
                        System.out.println();
              
                        India();
                    }
           
            
                    for(int i = 0;i<20;i++)
                    {
                        if(fromplace.equalsIgnoreCase(places[i]))
                        {
                            fromno=i;
                            break;
                        }
                
                    }
                    for(int i = 0;i<20;i++)
                    {
                        if(toplace.equalsIgnoreCase(places[i]))
                        {
                           tono=i;
                           break;
                        }
                    }
                    if(fromno==-1 || tono==-1) // To check if the user has chosen the place from the list
                    {
                        System.out.println("Please enter the place only from the list");
                        flag=0;                 
                    }
                    else             
                    {
                        airlines(fromplace,toplace);                
                        flag=1;
                    }
            
                }while(flag==0);
        }
        public static void airlines(String fromplace, String toplace) throws IOException // A brief introduction about the airlines
        {
            Scanner userInput = new Scanner(System.in);
            int flag=0;
            int choice = 0;
                do
                {
                    try
                    {
                        System.out.println("Now you have selcted your destinations,please select the airlines \n"+
                                            "1:Air India \n"+
                                            "2:Spice jet \n"+
                                            "3:Kingfisher Airlines");
                        System.out.println();
                        System.out.println("Air India :- Air India is the flag carrier airline of India owned by Air India Limited (AIL), a Government of India enterprise.");
                        System.out.println("             It is the third largest airline in India (after IndiGo and Jet Airways) in domestic market share, and operates a fleet of Airbus and Boeing aircraft serving various domestic and international airports.");
                        System.out.println("             It is headquartered at the Indian Airlines House in New Delhi.[3] Air India has two major domestic hubs at Indira Gandhi International Airport and Chhatrapati Shivaji International Airport, and secondary hubs at Chennai International Airport and Netaji Subhas Chandra Bose International Airport, Kolkata.");
                        System.out.println("             The airline formerly operated a hub at Frankfurt Airport which was terminated on account of high costs.");
                        System.out.println("             However, another international hub is being planned at the Dubai International Airport.");
                        System.out.println("             Each Passenger :- Rs 6000");
                        
                        System.out.println();
                        System.out.println();
                        
                        System.out.println("Spice Jet :- SpiceJet is an Indian low-cost airline owned by the Sun Group of India.");
                        System.out.println("             It is the fourth largest airline in India after IndiGo, Jet Airways and Air India.");
                        System.out.println("             It has its registered office in Chennai, Tamil Nadu, and a corporate office in Gurgaon, Haryana.");
                        System.out.println("             It began service in May 2005, and by December 2013, it had a market share of 19.1% in the Indian domestic market.");
                        System.out.println("             There Are many services offered by SpiceJet, like SpiceMAX, Flight Entertainment, Spice Add-ons, Spice Connect");
                        System.out.println("             Each Passenger :- Rs 8000");
                        
                        System.out.println();
                        System.out.println();
                        
                        System.out.println("Kingfisher :- Kingfisher Airlines Limited was an airline group based in India. Its head office is in Andheri (East), Mumbai and registered office in UB City, Bangalore.");
                        System.out.println("              Kingfisher Airlines had the second largest share in India's domestic air travel market.");
                        System.out.println("              The airlines provide several services like Kingfisher Xpress, Kingfisher Lounge, Kingfisher Red and many more");
                        System.out.println("              Each Passenger :- Rs 1000");
                        
                        System.out.print("Please Make Your Choice :- ");
                        choice = userInput.nextInt();//choice to select the airlines of India                   
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Invalid entry");
                        flag = 1;
                    }
                    switch(choice)
                    {
                        case 1:
                            AirIndia(fromplace, toplace);  
                            flag=1;
                            break;
                            
                        case 2:
                            SpiceJet(fromplace, toplace);   //actual parameters sent to the airline method
                            flag=1;
                            break;
                            
                        case 3:
                            Kingfisher(fromplace,toplace);
                            flag=1;
                            break;
                            
                        default:
                            System.out.println("Please enter the right Choice");
                            flag=0;
                    }
                }while(flag==0);
        }
                static String AirIndia[][] = new String[50][5];
                static String Spicejet[][] = new String[50][5];   
                static String Kingfisher[][] = new String[50][5];
                
        public static void AirIndia(String fromplace, String toplace) throws IOException
        {
            Scanner userInput = new Scanner(System.in);
            boolean flag = false;
            
            do
            {
                    int rateofticket = 6000;
                    int count = 0;
                    int numofpassengers = 0;
                    boolean flagtemp = false;
                    
                    do
                    {
                        try
                        {
                            
                            System.out.println("Enter Number Of Passengers");// user will enter number of passesngers 
                            numofpassengers = userInput.nextInt();
                            flag = true;
                        }
                        catch(Exception e)
                            {
                                System.out.println("Enter A Valid Number !!");
                                flag = false;
                                
                            }
                    }   while(flag == false);
                    
                    int m = 0;
                    
                    AirIndia[0][0] ="Raju"; //assigned seats of the airline
                    AirIndia[0][1] ="13";
                    AirIndia[0][2] ="mumbai";
                    AirIndia[0][3] ="Kochi"; 
                    AirIndia[0][4] ="Air India";

                    AirIndia[1][0] ="Burhan";
                    AirIndia[1][1] ="11";
                    AirIndia[1][2] ="Goa";
                    AirIndia[1][3] ="Ooty"; 
                    AirIndia[1][4] ="Air India";

                    AirIndia[2][0] ="Idrees";
                    AirIndia[2][1] ="12";
                    AirIndia[2][2] ="Goa";
                    AirIndia[2][3] ="Nagpur"; 
                    AirIndia[2][4] ="Air India";

                    AirIndia[3][0] ="Taher";
                    AirIndia[3][1] ="16";
                    AirIndia[3][2] ="Kochi";
                    AirIndia[3][3] ="Delhi"; 
                    AirIndia[3][4] ="Air India";

                    AirIndia[4][0] ="Mustafa";
                    AirIndia[4][1] ="16";
                    AirIndia[4][2] ="mumbai";
                    AirIndia[4][3] ="Kochi"; 
                    AirIndia[4][4] ="Air India";

                    AirIndia[5][0] ="Huzefa";
                    AirIndia[5][1] ="16";
                    AirIndia[5][2] ="Delhi";
                    AirIndia[5][3] ="Kochi"; 
                    AirIndia[5][4] ="Air India";

                    AirIndia[6][0] ="Bakir";
                    AirIndia[6][1] ="16";
                    AirIndia[6][2] ="Delhi";
                    AirIndia[6][3] ="Goa"; 
                    AirIndia[6][4] ="Air India";

                    AirIndia[7][0] ="Rahul";
                    AirIndia[7][1] ="16";
                    AirIndia[7][2] ="Delhi";
                    AirIndia[7][3] ="Ooty"; 
                    AirIndia[7][4] ="Air India";

                    AirIndia[8][0] ="James";
                    AirIndia[8][1] ="16";
                    AirIndia[8][2] ="Kochi";
                    AirIndia[8][3] ="Goa"; 
                    AirIndia[8][4] ="Air India";
                    
                    
                    int i,j;
                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)
                               count++;
                       }
                       if(numofpassengers>count)
                       {
                           System.out.println("only " + (numofpassengers-count) +" Less Seats Available ");
                           flag=true;
                           continue;
                       }

                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)   //checks whether the AirIndia array is null
                           {
                                m = i;
                               break;             
                           }
                       }
                            System.out.println();
                            
                            int x;
                            boolean flag1=false;
                            String str = " ";
                            
                for(x=0; x<numofpassengers; x++)
                {
        
                    do
                    {
                            System.out.println("Please Enter Passengers name"); //asking the name of the passenger
                            AirIndia[m][0] = userInput.next();
                            char strname[]=new char[20];                
                            str = AirIndia[m][0].trim();  
                            for(int i1=0;i1<str.length();i1++)
                            {
                                strname[i1]=str.charAt(i1);
                            }
                            int c1;
                            for(c1=0;c1<str.length();c1++)
                            {
                                if((strname[c1]>=65 && strname[c1]<=91) || (strname[c1]>=97 && strname[c1]<=123))  //to check if the name entered by the user is valid
                                {
                                    flag1=true;
                                }
                                else
                                {
                                    System.out.println("Name cannot contain Numbers or special characters ");
                                    flag1=false;
                                    break;                       
                                }                    
                            }
                    }while (flag1==false);
                
                            System.out.println();
                            int age=0;
                            boolean flag10 = true ;
                            
                    do //to accept the age of the passenger
                    {
                        try
                        {
                            flag10=true;
                            System.out.println("Please Enter Passengers Age");
                            age= userInput.nextInt();
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Please Enter the age properly");
                            flag10 = false;
                        }
                            if(age<0 || age>120) 
                            {
                                System.out.println("This age is not possible"); 
                                flag10 = false; 
                            } 
                    }while (flag10==false);
                    
                        AirIndia[m][0]=str;
                        AirIndia[m][1]=String.valueOf(age);
                        AirIndia[m][2] =fromplace;
                        AirIndia[m][3] =toplace;
                        AirIndia[m][4] ="Air India";      
                        m++;
                }
                
                        int ctr;
                        int choice1 = 0;
                        boolean flag8= true;
                        boolean flag0 = true;
                do
                {
                    do
                    {
                        try
                        {
                            flag0=true;
                            System.out.println("Want to see  the list of passengers travelling in AirIndia airlines (TYPE 1)");
                            System.out.println("Want to see the list entered by the user  (TYPE 2)");
                            choice1 = userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices properly");   
                            flag0=false; 
                        }
                    }while(flag0==false);  
                
               
                                if (choice1==1)
                                {
                                    flag8 = true;
                                    int ctr1=0;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \tAirways \tRate");
        
                                    for (ctr1=0;ctr1<m;ctr1++)
                                    {
                                        System.out.println(AirIndia[ctr1][0]+"\t\t"+AirIndia[ctr1][1]+"\t"+AirIndia[ctr1][2]+"\t\t"+AirIndia[ctr1][3]+"\t\t"+AirIndia[ctr1][4]+"\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);        
                                }
                                else if (choice1==2)
                                {
                                    flag8 = true;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \t\t Airways \t\t Rate");
                                    
                                    for(;i<m;i++)
                                    {           
                                        System.out.println(AirIndia[i][0]+"\t\t"+AirIndia[i][1]+"\t"+AirIndia[i][2]+"\t\t"+AirIndia[i][3]+"\t\t"+AirIndia[i][4]+"\t\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);      
                                }  
                                else if(choice1<1||choice1>2)
                                {
                                flag8 = false;
                                }
                                
                }while(flag8==false); 
                flag=true;
                
            }while(flag==false);
            
                        boolean flag8=true;
                        boolean flag3 = true;
                        int choice = 0;
                    do
                    {
                        do
                        {
                            try
                            { 
                                flag8 = true;
                                flag3 = true;
                                System.out.println("Do you want to continue to book tickets ? (If YES, type 1 or if NO, type 2");
                                choice  = userInput.nextInt(); //choice for the user to continue to book tickets
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please type 1 for Yes or 2 for No");
                                flag3 = false;
                            }
                        }while(flag3==false);
                        
                        if(choice==1)
                        {
                            India();
                            flag8 = true;
                        }  
                        else if(choice==2)
                        {
                            System.out.println("Thank you for visiting our agency.");
                            System.out.println("Wish you a happy journey");
                            System.exit(0);
                            flag8 = true;
                        }
                        else if(choice<1||choice>2)   
                        {
                            System.out.println("Please enter the choice 1 or choice 2 only"); 
                            flag8 = false;
                        }
                    }while(flag8==false); 
        }
        public static void SpiceJet(String fromplace ,String toplace) throws IOException
        {
            Scanner userInput = new Scanner(System.in);
           boolean flag = false;
            
            do
            {
                    int rateofticket = 8000;
                    int count = 0;
                    int numofpassengers = 0;
                    boolean flagtemp = false;
                    
                    do
                    {
                        try
                        {
                            
                            System.out.println("Enter Number Of Passengers");
                            numofpassengers = userInput.nextInt();
                            flag = true;
                        }
                        catch(Exception e)
                            {
                                System.out.println("Enter A Valid Number !!");
                                flag = false;
                                
                            }
                    }   while(flag == false);
                    
                    int m = 0;
                    
                    Spicejet[0][0] ="Raju"; //assigned seats of the airline
                    Spicejet[0][1] ="13";
                    Spicejet[0][2] ="mumbai";
                    Spicejet[0][3] ="Kochi"; 
                    Spicejet[0][4] ="Air India";

                    Spicejet[1][0] ="Burhan";
                    Spicejet[1][1] ="11";
                    Spicejet[1][2] ="Goa";
                    Spicejet[1][3] ="Ooty"; 
                    Spicejet[1][4] ="Air India";

                    Spicejet[2][0] ="Idrees";
                    Spicejet[2][1] ="12";
                    Spicejet[2][2] ="Goa";
                    Spicejet[2][3] ="Nagpur"; 
                    Spicejet[2][4] ="Air India";

                    Spicejet[3][0] ="Taher";
                    Spicejet[3][1] ="16";
                    Spicejet[3][2] ="Kochi";
                    Spicejet[3][3] ="Delhi"; 
                    Spicejet[3][4] ="Air India";

                    Spicejet[4][0] ="Mustafa";
                    Spicejet[4][1] ="16";
                    Spicejet[4][2] ="mumbai";
                    Spicejet[4][3] ="Kochi"; 
                    Spicejet[4][4] ="Air India";

                    Spicejet[5][0] ="Huzefa";
                    Spicejet[5][1] ="16";
                    Spicejet[5][2] ="Delhi";
                    Spicejet[5][3] ="Kochi"; 
                    Spicejet[5][4] ="Air India";

                    Spicejet[6][0] ="Bakir";
                    Spicejet[6][1] ="16";
                    Spicejet[6][2] ="Delhi";
                    Spicejet[6][3] ="Goa"; 
                    Spicejet[6][4] ="Air India";

                    Spicejet[7][0] ="Rahul";
                    Spicejet[7][1] ="16";
                    Spicejet[7][2] ="Delhi";
                    Spicejet[7][3] ="Ooty"; 
                    Spicejet[7][4] ="Air India";

                    Spicejet[8][0] ="James";
                    Spicejet[8][1] ="16";
                    Spicejet[8][2] ="Kochi";
                    Spicejet[8][3] ="Goa"; 
                    Spicejet[8][4] ="Air India";
                    
                    
                    int i,j;
                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)
                               count++;
                       }
                       if(numofpassengers>count)
                       {
                           System.out.println("only " + (numofpassengers-count) +" Less Seats Available ");
                           flag=true;
                           continue;
                       }


                       for(i=0,j=0;i<50;i++)
                       {
                           if (Spicejet[i][j]==null)   //checks whether the AirIndia array is null
                           {
                                m = i;
                               break;             
                           }
                       }
                            System.out.println();
                            System.out.println();

                            int x;
                            boolean flag1=false;
                            String str = " ";
                            
                for(x=0; x<numofpassengers; x++)
                {
        
                    do
                    {
                            System.out.println("Please Enter Passengers name"); //asking the name of the passenger
                            Spicejet[m][0] = userInput.next();
                            char strname[]=new char[20];                
                            str = Spicejet[m][0].trim();  
                            for(int i1=0;i1<str.length();i1++)
                            {
                                strname[i1]=str.charAt(i1);
                            }
                            int c1;
                            for(c1=0;c1<str.length();c1++)
                            {
                                if((strname[c1]>=65 && strname[c1]<=91) || (strname[c1]>=97 && strname[c1]<=123))  //to check if the name entered by the user is valid
                                {
                                    flag1=true;
                                }
                                else
                                {
                                    System.out.println("Name cannot contain Numbers or special characters ");
                                    flag1=false;
                                    break;                       
                                }                    
                            }
                    }while (flag1==false);
                
                            System.out.println();
                            int age=0;
                            boolean flag10 = true ;
                            
                    do //to accept the age of the passenger
                    {
                        try
                        {
                            flag10=true;
                            System.out.println("Please Enter Passengers Age");
                            age= userInput.nextInt();
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Please Enter the age properly");
                            flag10 = false;
                        }
                            if(age<0 || age>120) 
                            {
                                System.out.println("This age is not possible"); 
                                flag10 = false; 
                            } 
                    }while (flag10==false);
                    
                        Spicejet[m][0]=str;
                        Spicejet[m][1]=String.valueOf(age);
                        Spicejet[m][2] =fromplace;
                        Spicejet[m][3] =toplace;
                        Spicejet[m][4] ="Spicejet";      
                        m++;
                }
                
                        int ctr;
                        int choice1 = 0;
                        boolean flag8= true;
                        boolean flag0 = true;
                do
                {
                    do
                    {
                        try
                        {
                            flag0=true;
                            System.out.println("Want to see  the list of passengers travelling in Spicejet airlines (TYPE 1)");
                            System.out.println("Want to see the list entered by the user  (TYPE 2)");
                            choice1 = userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices properly");   
                            flag0=false; 
                        }
                    }while(flag0==false);  
                
               
                                if (choice1==1)
                                {
                                    flag8 = true;
                                    int ctr1=0;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \tAirways \tRate");
        
                                    for (ctr1=0;ctr1<m;ctr1++)
                                    {
                                        System.out.println(Spicejet[ctr1][0]+"\t\t"+Spicejet[ctr1][1]+"\t"+Spicejet[ctr1][2]+"\t\t"+Spicejet[ctr1][3]+"\t\t"+Spicejet[ctr1][4]+"\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);        
                                }
                                else if (choice1==2)
                                {
                                    flag8 = true;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \t\t Airways \t\t Rate");
                                    
                                    for(;i<m;i++)
                                    {           
                                        System.out.println(Spicejet[i][0]+"\t\t"+Spicejet[i][1]+"\t"+Spicejet[i][2]+"\t\t"+Spicejet[i][3]+"\t\t"+Spicejet[i][4]+"\t\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);      
                                }  
                                else if(choice1<1||choice1>2)
                                {
                                flag8 = false;
                                }
                }while(flag8==false); 
                flag=true;
                
            }while(flag==false);
            
                        boolean flag8=true;
                        boolean flag3 = true;
                        int choice = 0;
                    do
                    {
                        do
                        {
                            try
                            { 
                                flag8 = true;
                                flag3 = true;
                                System.out.println("Do you want to continue to book tickets ? (If YES, type 1 or if NO, type 2");
                                choice  = userInput.nextInt(); //choice for the user to continue to book tickets
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please type 1 for Yes or 2 for No");
                                flag3 = false;
                            }
                        }while(flag3==false);
                        
                        if(choice==1)
                        {
                            India();
                            flag8 = true;
                        }  
                        else if(choice==2)
                        {
                            System.out.println("Thank you for visiting our agency.");
                            System.out.println("Wish you a happy journey");
                            System.exit(0);
                            flag8 = true;
                        }
                        else if(choice<1||choice>2)   
                        {
                            System.out.println("Please enter the choice 1 or choice 2 only"); 
                            flag8 = false;
                        }
                    }while(flag8==false); 
           
        }
        
        public static void Kingfisher(String fromplace, String toplace) throws IOException 
        {
           Scanner userInput = new Scanner(System.in);
           boolean flag = false;
            
            do
            {
                    int rateofticket = 10000;
                    int count = 0;
                    int numofpassengers = 0;
                    boolean flagtemp = false;
                    
                    do
                    {
                        try
                        {
                            
                            System.out.println("Enter Number Of Passengers");
                            numofpassengers = userInput.nextInt();
                            flag = true;
                        }
                        catch(Exception e)
                            {
                                System.out.println("Enter A Valid Number !!");
                                flag = false;
                                
                            }
                    }   while(flag == false);
                    
                    int m = 0;
                    
                    Kingfisher[0][0] ="Raju"; //assigned seats of the airline
                    Kingfisher[0][1] ="13";
                    Kingfisher[0][2] ="mumbai";
                    Kingfisher[0][3] ="Kochi"; 
                    Kingfisher[0][4] ="Air India";

                    Kingfisher[1][0] ="Burhan";
                    Kingfisher[1][1] ="11";
                    Kingfisher[1][2] ="Goa";
                    Kingfisher[1][3] ="Ooty"; 
                    Kingfisher[1][4] ="Air India";

                    Kingfisher[2][0] ="Idrees";
                    Kingfisher[2][1] ="12";
                    Kingfisher[2][2] ="Goa";
                    Kingfisher[2][3] ="Nagpur"; 
                    Kingfisher[2][4] ="Air India";

                    Kingfisher[3][0] ="Taher";
                    Kingfisher[3][1] ="16";
                    Kingfisher[3][2] ="Kochi";
                    Kingfisher[3][3] ="Delhi"; 
                    Kingfisher[3][4] ="Air India";

                    Kingfisher[4][0] ="Mustafa";
                    Kingfisher[4][1] ="16";
                    Kingfisher[4][2] ="mumbai";
                    Kingfisher[4][3] ="Kochi"; 
                    Kingfisher[4][4] ="Air India";

                    Kingfisher[5][0] ="Huzefa";
                    Kingfisher[5][1] ="16";
                    Kingfisher[5][2] ="Delhi";
                    Kingfisher[5][3] ="Kochi"; 
                    Kingfisher[5][4] ="Air India";

                    Kingfisher[6][0] ="Bakir";
                    Kingfisher[6][1] ="16";
                    Kingfisher[6][2] ="Delhi";
                    Kingfisher[6][3] ="Goa"; 
                    Kingfisher[6][4] ="Air India";

                    Kingfisher[7][0] ="Rahul";
                    Kingfisher[7][1] ="16";
                    Kingfisher[7][2] ="Delhi";
                    Kingfisher[7][3] ="Ooty"; 
                    Kingfisher[7][4] ="Air India";

                    Kingfisher[8][0] ="James";
                    Kingfisher[8][1] ="16";
                    Kingfisher[8][2] ="Kochi";
                    Kingfisher[8][3] ="Goa"; 
                    Kingfisher[8][4] ="Air India";
                    
                    
                    int i,j;
                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)
                               count++;
                       }
                       if(numofpassengers>count)
                       {
                           System.out.println("only " + (numofpassengers-count) +" Less Seats Available ");
                           flag=true;
                           continue;
                       }


                       for(i=0,j=0;i<50;i++)
                       {
                           if (Kingfisher[i][j]==null)   //checks whether the AirIndia array is null
                           {
                                m = i;
                               break;             
                           }
                       }
                            System.out.println();
                            System.out.println();

                            int x;
                            boolean flag1=false;
                            String str = " ";
                            
                for(x=0; x<numofpassengers; x++)
                {
        
                    do
                    {
                            System.out.println("Please Enter Passengers name"); //asking the name of the passenger
                            
                            Kingfisher[m][0] = userInput.next();
                            char strname[]=new char[20];                
                            str = Kingfisher[m][0].trim();  
                            for(int i1=0;i1<str.length();i1++)
                            {
                                strname[i1]=str.charAt(i1);
                            }
                            int c1;
                            for(c1=0;c1<str.length();c1++)
                            {
                                if((strname[c1]>=65 && strname[c1]<=91) || (strname[c1]>=97 && strname[c1]<=123))  //to check if the name entered by the user is valid
                                {
                                    flag1=true;
                                }
                                else
                                {
                                    System.out.println("Name cannot contain Numbers or special characters ");
                                    flag1=false;
                                    break;                       
                                }                    
                            }
                    }while (flag1==false);
                
                            System.out.println();
                            int age=0;
                            boolean flag10 = true ;
                            
                    do //to accept the age of the passenger
                    {
                        try
                        {
                            flag10=true;
                            System.out.println("Please Enter Passengers Age");
                            age= userInput.nextInt();
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Please Enter the age properly");
                            flag10 = false;
                        }
                            if(age<0 || age>120) 
                            {
                                System.out.println("This age is not possible"); 
                                flag10 = false; 
                            } 
                    }while (flag10==false);
                    
                        Kingfisher[m][0]=str;
                        Kingfisher[m][1]=String.valueOf(age);
                        Kingfisher[m][2] =fromplace;
                        Kingfisher[m][3] =toplace;
                        Kingfisher[m][4] ="Kingfisher Airlines";      
                        m++;
                }
                
                        int ctr;
                        int choice1 = 0;
                        boolean flag8= true;
                        boolean flag0 = true;
                do
                {
                    do
                    {
                        try
                        {
                            flag0=true;
                            System.out.println("Want to see  the list of passengers travelling in Kingfisher (TYPE 1)");
                            System.out.println("Want to see the list entered by the user  (TYPE 2)");
                            choice1 = userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices properly");   
                            flag0=false; 
                        }
                    }while(flag0==false);  
                
               
                                if (choice1==1)
                                {
                                    flag8 = true;
                                    int ctr1=0;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \tAirways \tRate");
        
                                    for (ctr1=0;ctr1<m;ctr1++)
                                    {
                                        System.out.println(Kingfisher[ctr1][0]+"\t\t"+Kingfisher[ctr1][1]+"\t"+Kingfisher[ctr1][2]+"\t\t"+Kingfisher[ctr1][3]+"\t\t"+Kingfisher[ctr1][4]+"\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);        
                                }
                                else if (choice1==2)
                                {
                                    flag8 = true;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \t\t Airways \t\t Rate");
                                    
                                    for(;i<m;i++)
                                    {           
                                        System.out.println(Kingfisher[i][0]+"\t\t"+Kingfisher[i][1]+"\t"+Kingfisher[i][2]+"\t\t"+Kingfisher[i][3]+"\t\t"+Kingfisher[i][4]+"\t\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);      
                                }  
                                else if(choice1<1||choice1>2)
                                {
                                flag8 = false;
                                }
                        }while(flag8==false); 
                            flag=true;
                
                        }while(flag==false);
            
                        boolean flag8=true;
                        boolean flag3 = true;
                        int choice = 0;
                    do
                    {
                        do
                        {
                            try
                            { 
                                flag8 = true;
                                flag3 = true;
                                System.out.println("Do you want to continue to book tickets ? (If YES, type 1 or if NO, type 2");
                                choice  = userInput.nextInt(); //choice for the user to continue to book tickets
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please type 1 for Yes or 2 for No");
                                flag3 = false;
                            }
                        }while(flag3==false);
                        
                        if(choice==1)
                        {
                            India();
                            flag8 = true;
                        }  
                        else if(choice==2)
                        {
                            System.out.println("Thank you for visiting our agency.");
                            System.out.println("Wish you a happy journey");
                            System.exit(0);
                            flag8 = true;
                        }
                        else if(choice<1||choice>2)   
                        {
                            System.out.println("Please enter the choice 1 or choice 2 only"); 
                            flag8 = false;
                        }
                    }while(flag8==false);  
        }
        
        public static void Abroad()throws IOException
        {
            Scanner userInput = new Scanner(System.in);
        
                int flag=0;
                String fromplace;
                String toplace;
                int fromno=-1;
                int tono=-1;
            do
            {
                String places[] = new String[30];   //array for abroad destinations
                 places[0] = "New York";
                 places[1] = "London";
                 places[2] = "Canada";
                 places[3] = "Nairobi";
                 places[4] = "Berlin";
                 places[5] = "Lisbon";
                 places[6] = "Rome";
                 places[7] = "NewJercy";
                 places[8] = "LasVegas";
                 places[9] = "Monaco";
                 places[10]= "Riyadh";
                 places[11] = "Egypt";
                 places[12] = "Spain";
                 places[13] = "Malaysia";
                 places[14] = "Mumbai"; 
                 places[15] = "Honduras";
                 places[16] = "Morocco";
                 places[17] = "Dubai";
                 places[18] = "Israel";
                 places[19] = "Iraq";
                 places[20] = "Perth";
                 places[21] = "Indonesia";
                 places[22] = "Paris";
                 places[23] = "Turkey";
                 places[24] = "Russia";
                 places[25] = "Tokyo";
                 places[26] = "Beijing";
                 places[27] = "Karachi";
                 places[28] = "Jordon";
                 places[29] = "Srilanka";
                 
                 System.out.println("These are the places for which we book tickets for abroad");
                 System.out.println();
                 System.out.println();
                 System.out.println("New York      London        Canada        Nairobi        Berlin");  
                 System.out.println("Lisbon       Rome          NewJercy      LasVegas       Monaco ");
                 System.out.println("Riyadh       Egypt         Spain         Malaysia       Mumbai");
                 System.out.println("Honduras     Morocco       Dubai         Israel         Iraq");
                 System.out.println("Perth        Indonesia     Paris         Turkey         Russia"); 
                 System.out.println("Tokyo        Bejing        Karachi       Jordon         SriLanka");

                 System.out.println();
                 System.out.println("Please enter the name of the Source (you want to fly from the list)");            
                 fromplace = userInput.next();

                 System.out.println();

                 System.out.println("Please enter the name of the destination (you have chosen from the list)");            
                 toplace = userInput.next();
            
                 System.out.println();
                 
                        if(fromplace.equalsIgnoreCase(toplace))    //steps taken if source & destination are same
                        {
                            System.out.println("Please enter different destination and a different source.");
                            System.out.println("If the source and destination is same the there is no need to travel");  
                            System.out.println("See the places again and Select your destination properly");
                            flag=0;
                            continue; //to go back to the while statement
                        }
         
                        for(int i = 0;i<30;i++)
                        {
                            if(fromplace.equalsIgnoreCase(places[i]))
                            {
                                fromno=i;
                                break;
                            }
                        }
            
                        for(int i = 0;i<30;i++)
                        {
                            if(toplace.equalsIgnoreCase(places[i]))
                            {
                                tono=i;
                                break;
                            }
                        }
                        
                            if(fromno==-1 || tono==-1)
                            {
                                System.out.println("Please enter the place only from the list");
                                flag=0;                 
                            }
                            else             
                            {
                                Airways(fromplace,toplace);                
                                flag=1;
                            }
            
            }while(flag==0);
        }  
            public static void Airways(String fromplace , String toplace) throws IOException
            {
                Scanner userInput = new Scanner(System.in);
                
                int choice = 0;
                boolean flag = true;  
                int flag1 = 0;        
                
                System.out.println();
                System.out.println("Now you have selcted the places choose the airlines :-");
                System.out.println("1. British Airways");
                System.out.println("2. Emirates");
                System.out.println("3. Lufthansa Airlines");
                System.out.println("4. Cathay Pacific");
                
                System.out.println();
                
                System.out.println("1. British Airways :- British Airways is a flag carrier airline of the United Kingdom");
                System.out.println("                      its largest airline based on fleet size.");
                System.out.println("                      It is second-largest airlines in the world");
                System.out.println("                      It is the best airlines.");
                System.out.println("                      Each Passenger :- Rs 45,000");
                
                System.out.println();
                System.out.println();
                
                System.out.println("2. Emirates :- Emirates is an airline based in Dubai, United Arab Emirates. ");
                System.out.println("               It is the largest airline in the Middle East, operating nearly 3,400 flights per week from its hub at Dubai International Airport,");
                System.out.println("               to more than 142 cities in 78 countries across six continents. ");
                System.out.println("               Each Passensger :- Rs 50,000");
                System.out.println();
                System.out.println();
                
                System.out.println("3. Lufthansa Airlines :- Lufthansa is the flag carrier of Germany.");
                System.out.println("                         It is the largest airline in Europe, both in terms of overall passengers carried ");
                System.out.println("                         and fleet size when combined with its subsidiaries.");
                System.out.println("                         It operates services to 18 domestic destinations and 197 international destinations in 78 countries across Africa, the Americas, Asia, and Europe, using a fleet of more than 280 aircraft.");
                System.out.println("                         Each Passenger :- Rs 75,000");
                System.out.println();
                System.out.println();
                
                System.out.println("4. Cathay Pacific :- Cathay Pacific is the de facto international flag carrier airline of Hong Kong");
                System.out.println("                     StudioCX, Cathay Pacific's in-flight entertainment system, equipped with personal televisions (PTVs) in every seat, offers the latest Hollywood blockbuster movies,");
                System.out.println("                     popular Asian and Western TV programmes, music and games.");
                System.out.println("                     Each Passenger :- Rs 60,000");
                
                System.out.println();
                System.out.println();
                
                do
                {
                    do
                    {
                        try
                        {
                            flag = true;
                            System.out.println("Please enter your choice to select the airlines");
                            choice = userInput.nextInt();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices 1,2,3 or 4");
                            flag = false;
                        }
                    }while(flag==false);
                    
                        if(choice <=0 || choice>4)
                        {
                            System.out.println("We do not have any other alternative !!!!!!!");
                            flag1 = 1;
                        }
                }while(flag1==1);
                do{
                        switch(choice)
                        {
                            case 1: Britishairways(fromplace,toplace);
                                    flag = true;
                                    break;
                                
                            case 2: Emirates(fromplace,toplace);
                                    flag = true;
                                    break;
                                
                            case 3: Lufthansa(fromplace,toplace);
                                    flag = true;
                                    break;
                                
                            case 4: CathayPacific(fromplace, toplace);
                                    flag = true;
                                    break;
                                
                            default: System.out.println("Please enter the correct Choice");
                                     flag = false;
                                     break;
        
                        }
                }while(flag==false);
            }
                    static String Britishairways[][] = new String[50][5];
                    static String Emirates[][] = new String[50][5];   
                    static String Lufthansa[][] = new String[50][5];
                    static String CathayPacific[][] = new String[50][5];
                
            
            public static void Britishairways(String fromplace, String toplace) throws IOException
            {
                Scanner userInput = new Scanner(System.in);
                boolean flag = false;
            
            do
            {
                    int rateofticket = 45000;
                    int count = 0;
                    int numofpassengers = 0;
                    boolean flagtemp = false;
                    
                    do
                    {
                        try
                        {
                            
                            System.out.println("Enter Number Of Passengers");
                            numofpassengers = userInput.nextInt();
                            flag = true;
                        }
                        catch(Exception e)
                            {
                                System.out.println("Enter A Valid Number !!");
                                flag = false;
                                
                            }
                    }   while(flag == false);
                    
                    int m = 0;
                    
                    Britishairways[0][0] ="Raju"; //assigned seats of the airline
                    Britishairways[0][1] ="13";
                    Britishairways[0][2] ="mumbai";
                    Britishairways[0][3] ="london"; 
                    Britishairways[0][4] ="British Airways";

                    Britishairways[1][0] ="Burhan";
                    Britishairways[1][1] ="11";
                    Britishairways[1][2] ="Israel";
                    Britishairways[1][3] ="dubai"; 
                    Britishairways[1][4] ="British Airways";

                    Britishairways[2][0] ="Idrees";
                    Britishairways[2][1] ="12";
                    Britishairways[2][2] ="dubai";
                    Britishairways[2][3] ="mumbai"; 
                    Britishairways[2][4] ="British Airways";

                    Britishairways[3][0] ="Taher";
                    Britishairways[3][1] ="16";
                    Britishairways[3][2] ="dubai";
                    Britishairways[3][3] ="Delhi"; 
                    Britishairways[3][4] ="British Airways";

                    Britishairways[4][0] ="Mustafa";
                    Britishairways[4][1] ="16";
                    Britishairways[4][2] ="mumbai";
                    Britishairways[4][3] ="israel"; 
                    Britishairways[4][4] ="British Airways";

                    Britishairways[5][0] ="Huzefa";
                    Britishairways[5][1] ="16";
                    Britishairways[5][2] ="iraq";
                    Britishairways[5][3] ="israel"; 
                    Britishairways[5][4] ="Air India";

                    Britishairways[6][0] ="Bakir";
                    Britishairways[6][1] ="16";
                    Britishairways[6][2] ="mumbai";
                    Britishairways[6][3] ="israel"; 
                    Britishairways[6][4] ="Air India";

                    Britishairways[7][0] ="Rahul";
                    Britishairways[7][1] ="16";
                    Britishairways[7][2] ="london";
                    Britishairways[7][3] ="new york"; 
                    Britishairways[7][4] ="Air India";

                    Britishairways[8][0] ="James";
                    Britishairways[8][1] ="16";
                    Britishairways[8][2] ="lisbon";
                    Britishairways[8][3] ="new york"; 
                    Britishairways[8][4] ="Air India";
                    
                    
                    int i,j;
                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)
                               count++;
                       }
                       if(numofpassengers>count)
                       {
                           System.out.println("only " + (numofpassengers-count) +" Less Seats Available ");
                           flag=true;
                           continue;
                       }


                       for(i=0,j=0;i<50;i++)
                       {
                           if (Britishairways[i][j]==null)   //checks whether the AirIndia array is null
                           {
                                m = i;
                               break;             
                           }
                       }
                            System.out.println();
                            System.out.println();

                            int x;
                            boolean flag1=false;
                            String str = " ";
                            
                for(x=0; x<numofpassengers; x++)
                {
        
                    do
                    {
                            System.out.println("Please Enter Passengers name"); //asking the name of the passenger
                            
                            Britishairways[m][0] = userInput.next();
                            char strname[]=new char[20];                
                            str = Britishairways[m][0].trim();  
                            for(int i1=0;i1<str.length();i1++)
                            {
                                strname[i1]=str.charAt(i1);
                            }
                            int c1;
                            for(c1=0;c1<str.length();c1++)
                            {
                                if((strname[c1]>=65 && strname[c1]<=91) || (strname[c1]>=97 && strname[c1]<=123))  //to check if the name entered by the user is valid
                                {
                                    flag1=true;
                                }
                                else
                                {
                                    System.out.println("Name cannot contain Numbers or special characters ");
                                    flag1=false;
                                    break;                       
                                }                    
                            }
                    }while (flag1==false);
                
                            System.out.println();
                            int age=0;
                            boolean flag10 = true ;
                            
                    do //to accept the age of the passenger
                    {
                        try
                        {
                            flag10=true;
                            System.out.println("Please Enter Passengers Age");
                            age= userInput.nextInt();
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Please Enter the age properly");
                            flag10 = false;
                        }
                            if(age<0 || age>120) 
                            {
                                System.out.println("This age is not possible"); 
                                flag10 = false; 
                            } 
                    }while (flag10==false);
                    
                        Britishairways[m][0]=str;
                        Britishairways[m][1]=String.valueOf(age);
                        Britishairways[m][2] =fromplace;
                        Britishairways[m][3] =toplace;
                        Britishairways[m][4] ="British Airways";      
                        m++;
                }
                
                        int ctr;
                        int choice1 = 0;
                        boolean flag8= true;
                        boolean flag0 = true;
                do
                {
                    do
                    {
                        try
                        {
                            flag0=true;
                            System.out.println("Want to see  the list of passengers travelling in British Airways airlines (TYPE 1)");
                            System.out.println("Want to see the list entered by the user  (TYPE 2)");
                            choice1 = userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices properly");   
                            flag0=false; 
                        }
                    }while(flag0==false);  
                
               
                                if (choice1==1)
                                {
                                    flag8 = true;
                                    int ctr1=0;
                                    
                                    System.out.println("Name :- "+Britishairways[ctr1][0]);
                                    System.out.println("Age :- "+Britishairways[ctr1][1]);
                                    System.out.println("From :- "+Britishairways[ctr1][2]);
                                    System.out.println("To :- "+Britishairways[ctr1][3]);
                                    System.out.println("Airways :- "+Britishairways[ctr1][4]);
                                    System.out.println("Rate Of Ticket :- "+rateofticket);
                                    for (ctr1=0;ctr1<m;ctr1++)
                                    {
                                        System.out.println(Britishairways[ctr1][0]+"\t\t"+Britishairways[ctr1][1]+"\t"+Britishairways[ctr1][2]+"\t\t"+Britishairways[ctr1][3]+"\t\t"+Britishairways[ctr1][4]+"\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);        
                                }
                                else if (choice1==2)
                                {
                                    flag8 = true;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \t\t Airways \t\t Rate");
                                    
                                    for(;i<m;i++)
                                    {           
                                        System.out.println(Britishairways[i][0]+"\t\t"+Britishairways[i][1]+"\t"+Britishairways[i][2]+"\t\t"+Britishairways[i][3]+"\t\t"+Britishairways[i][4]+"\t\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);      
                                }  
                                else if(choice1<1||choice1>2)
                                {
                                flag8 = false;
                                }
                        }while(flag8==false); 
                            flag=true;
                
                        }while(flag==false);
            
                        boolean flag8=true;
                        boolean flag3 = true;
                        int choice = 0;
                    do
                    {
                        do
                        {
                            try
                            { 
                                flag8 = true;
                                flag3 = true;
                                System.out.println("Do you want to continue to book tickets ? (If YES, type 1 or if NO, type 2");
                                choice  = userInput.nextInt(); //choice for the user to continue to book tickets
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please type 1 for Yes or 2 for No");
                                flag3 = false;
                            }
                        }while(flag3==false);
                        
                        if(choice==1)
                        {
                            Abroad();
                            flag8 = true;
                        }  
                        else if(choice==2)
                        {
                            System.out.println("Thank you for visiting our agency.");
                            System.out.println("Wish you a happy journey");
                            System.exit(0);
                            flag8 = true;
                        }
                        else if(choice<1||choice>2)   
                        {
                            System.out.println("Please enter the choice 1 or choice 2 only"); 
                            flag8 = false;
                        }
                    }while(flag8==false);
            }
            
            public static void Emirates(String fromplace, String toplace) throws IOException
            {
                Scanner userInput = new Scanner(System.in);
                boolean flag = false;
            
            do
            {
                    int rateofticket = 50000;
                    int count = 0;
                    int numofpassengers = 0;
                    boolean flagtemp = false;
                    
                    do
                    {
                        try
                        {
                            
                            System.out.println("Enter Number Of Passengers");
                            numofpassengers = userInput.nextInt();
                            flag = true;
                        }
                        catch(Exception e)
                            {
                                System.out.println("Enter A Valid Number !!");
                                flag = false;
                                
                            }
                    }   while(flag == false);
                    
                    int m = 0;
                    
                    Emirates[0][0] ="Raju"; //assigned seats of the airline
                    Emirates[0][1] ="13";
                    Emirates[0][2] ="mumbai";
                    Emirates[0][3] ="london"; 
                    Emirates[0][4] ="Emirates";

                    Emirates[1][0] ="Burhan";
                    Emirates[1][1] ="11";
                    Emirates[1][2] ="Israel";
                    Emirates[1][3] ="dubai"; 
                    Emirates[1][4] ="Emirates";

                    Emirates[2][0] ="Idrees";
                    Emirates[2][1] ="12";
                    Emirates[2][2] ="dubai";
                    Emirates[2][3] ="mumbai"; 
                    Emirates[2][4] ="Emirates";

                    Emirates[3][0] ="Taher";
                    Emirates[3][1] ="16";
                    Emirates[3][2] ="dubai";
                    Emirates[3][3] ="Delhi"; 
                    Emirates[3][4] ="Emirates";

                    Emirates[4][0] ="Mustafa";
                    Emirates[4][1] ="16";
                    Emirates[4][2] ="mumbai";
                    Emirates[4][3] ="israel"; 
                    Emirates[4][4] ="Emirates";

                    Emirates[5][0] ="Huzefa";
                    Emirates[5][1] ="16";
                    Emirates[5][2] ="iraq";
                    Emirates[5][3] ="israel"; 
                    Emirates[5][4] ="Emirates";

                    Emirates[6][0] ="Bakir";
                    Emirates[6][1] ="16";
                    Emirates[6][2] ="mumbai";
                    Emirates[6][3] ="israel"; 
                    Emirates[6][4] ="Emirates";

                    Emirates[7][0] ="Rahul";
                    Emirates[7][1] ="16";
                    Emirates[7][2] ="london";
                    Emirates[7][3] ="new york"; 
                    Emirates[7][4] ="Emirates";

                    Emirates[8][0] ="James";
                    Emirates[8][1] ="16";
                    Emirates[8][2] ="lisbon";
                    Emirates[8][3] ="new york"; 
                    Emirates[8][4] ="Emirates";
                    
                    
                    int i,j;
                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)
                               count++;
                       }
                       if(numofpassengers>count)
                       {
                           System.out.println("only " + (numofpassengers-count) +" Less Seats Available ");
                           flag=true;
                           continue;
                       }


                       for(i=0,j=0;i<50;i++)
                       {
                           if (Emirates[i][j]==null)   //checks whether the AirIndia array is null
                           {
                                m = i;
                               break;             
                           }
                       }
                            System.out.println();
                            System.out.println();

                            int x;
                            boolean flag1=false;
                            String str = " ";
                            
                for(x=0; x<numofpassengers; x++)
                {
        
                    do
                    {
                            System.out.println("Please Enter Passengers name"); //asking the name of the passenger
                            
                            Emirates[m][0] = userInput.next();
                            char strname[]=new char[20];                
                            str = Emirates[m][0].trim();  
                            for(int i1=0;i1<str.length();i1++)
                            {
                                strname[i1]=str.charAt(i1);
                            }
                            int c1;
                            for(c1=0;c1<str.length();c1++)
                            {
                                if((strname[c1]>=65 && strname[c1]<=91) || (strname[c1]>=97 && strname[c1]<=123))  //to check if the name entered by the user is valid
                                {
                                    flag1=true;
                                }
                                else
                                {
                                    System.out.println("Name cannot contain Numbers or special characters ");
                                    flag1=false;
                                    break;                       
                                }                    
                            }
                    }while (flag1==false);
                
                            System.out.println();
                            int age=0;
                            boolean flag10 = true ;
                            
                    do //to accept the age of the passenger
                    {
                        try
                        {
                            flag10=true;
                            System.out.println("Please Enter Passengers Age");
                            age= userInput.nextInt();
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Please Enter the age properly");
                            flag10 = false;
                        }
                            if(age<0 || age>120) 
                            {
                                System.out.println("This age is not possible"); 
                                flag10 = false; 
                            } 
                    }while (flag10==false);
                    
                        Emirates[m][0]=str;
                        Emirates[m][1]=String.valueOf(age);
                        Emirates[m][2] =fromplace;
                        Emirates[m][3] =toplace;
                        Emirates[m][4] ="Emirates";      
                        m++;
                }
                
                        int ctr;
                        int choice1 = 0;
                        boolean flag8= true;
                        boolean flag0 = true;
                do
                {
                    do
                    {
                        try
                        {
                            flag0=true;
                            System.out.println("Want to see  the list of passengers travelling in Emirates airlines (TYPE 1)");
                            System.out.println("Want to see the list entered by the user  (TYPE 2)");
                            choice1 = userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices properly");   
                            flag0=false; 
                        }
                    }while(flag0==false);  
                
               
                                if (choice1==1)
                                {
                                    flag8 = true;
                                    int ctr1=0;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \tAirways \tRate");
        
                                    for (ctr1=0;ctr1<m;ctr1++)
                                    {
                                        System.out.println(Emirates[ctr1][0]+"\t\t"+Emirates[ctr1][1]+"\t"+Emirates[ctr1][2]+"\t\t"+Emirates[ctr1][3]+"\t\t"+Emirates[ctr1][4]+"\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);        
                                }
                                else if (choice1==2)
                                {
                                    flag8 = true;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \t\t Airways \t\t Rate");
                                    
                                    for(;i<m;i++)
                                    {           
                                        System.out.println(Emirates[i][0]+"\t\t"+Emirates[i][1]+"\t"+Emirates[i][2]+"\t\t"+Emirates[i][3]+"\t\t"+Emirates[i][4]+"\t\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);      
                                }  
                                else if(choice1<1||choice1>2)
                                {
                                flag8 = false;
                                }
                        }while(flag8==false); 
                            flag=true;
                
                        }while(flag==false);
            
                        boolean flag8=true;
                        boolean flag3 = true;
                        int choice = 0;
                    do
                    {
                        do
                        {
                            try
                            { 
                                flag8 = true;
                                flag3 = true;
                                System.out.println("Do you want to continue to book tickets ? (If YES, type 1 or if NO, type 2");
                                choice  = userInput.nextInt(); //choice for the user to continue to book tickets
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please type 1 for Yes or 2 for No");
                                flag3 = false;
                            }
                        }while(flag3==false);
                        
                        if(choice==1)
                        {
                            Abroad();
                            flag8 = true;
                        }  
                        else if(choice==2)
                        {
                            System.out.println("Thank you for visiting our agency.");
                            System.out.println("Wish you a happy journey");
                            System.exit(0);
                            flag8 = true;
                        }
                        else if(choice<1||choice>2)   
                        {
                            System.out.println("Please enter the choice 1 or choice 2 only"); 
                            flag8 = false;
                        }
                    }while(flag8==false);
            
            }
            public static void Lufthansa(String fromplace, String toplace) throws IOException
            {
                Scanner userInput = new Scanner(System.in);
                boolean flag = false;
            
            do
            {
                    int rateofticket = 75000;
                    int count = 0;
                    int numofpassengers = 0;
                    boolean flagtemp = false;
                    
                    do
                    {
                        try
                        {
                            
                            System.out.println("Enter Number Of Passengers");
                            numofpassengers = userInput.nextInt();
                            flag = true;
                        }
                        catch(Exception e)
                            {
                                System.out.println("Enter A Valid Number !!");
                                flag = false;
                                
                            }
                    }   while(flag == false);
                    
                    int m = 0;
                    
                    Lufthansa[0][0] ="Raju"; //assigned seats of the airline
                    Lufthansa[0][1] ="13";
                    Lufthansa[0][2] ="mumbai";
                    Lufthansa[0][3] ="london"; 
                    Lufthansa[0][4] ="Lufthansa";

                    Lufthansa[1][0] ="Burhan";
                    Lufthansa[1][1] ="11";
                    Lufthansa[1][2] ="Israel";
                    Lufthansa[1][3] ="dubai"; 
                    Lufthansa[1][4] ="Lufthansa";

                    Lufthansa[2][0] ="Idrees";
                    Lufthansa[2][1] ="12";
                    Lufthansa[2][2] ="dubai";
                    Lufthansa[2][3] ="mumbai"; 
                    Lufthansa[2][4] ="Lufthansa";

                    Lufthansa[3][0] ="Taher";
                    Lufthansa[3][1] ="16";
                    Lufthansa[3][2] ="dubai";
                    Lufthansa[3][3] ="Delhi"; 
                    Lufthansa[3][4] ="Lufthansa";

                    Lufthansa[4][0] ="Mustafa";
                    Lufthansa[4][1] ="16";
                    Lufthansa[4][2] ="mumbai";
                    Lufthansa[4][3] ="israel"; 
                    Lufthansa[4][4] ="Lufthansa";

                    Lufthansa[5][0] ="Huzefa";
                    Lufthansa[5][1] ="16";
                    Lufthansa[5][2] ="iraq";
                    Lufthansa[5][3] ="israel"; 
                    Lufthansa[5][4] ="Lufthansa";

                    Lufthansa[6][0] ="Bakir";
                    Lufthansa[6][1] ="16";
                    Lufthansa[6][2] ="mumbai";
                    Lufthansa[6][3] ="israel"; 
                    Lufthansa[6][4] ="Lufthansa";

                    Lufthansa[7][0] ="Rahul";
                    Lufthansa[7][1] ="16";
                    Lufthansa[7][2] ="london";
                    Lufthansa[7][3] ="new york"; 
                    Lufthansa[7][4] ="Lufthansa";

                    Lufthansa[8][0] ="James";
                    Lufthansa[8][1] ="16";
                    Lufthansa[8][2] ="lisbon";
                    Lufthansa[8][3] ="new york"; 
                    Lufthansa[8][4] ="Lufthansa";
                    
                    
                    int i,j;
                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)
                               count++;
                       }
                       if(numofpassengers>count)
                       {
                           System.out.println("only " + (numofpassengers-count) +" Less Seats Available ");
                           flag=true;
                           continue;
                       }


                       for(i=0,j=0;i<50;i++)
                       {
                           if (Lufthansa[i][j]==null)   //checks whether the AirIndia array is null
                           {
                                m = i;
                               break;             
                           }
                       }
                            System.out.println();
                            System.out.println();

                            int x;
                            boolean flag1=false;
                            String str = " ";
                            
                for(x=0; x<numofpassengers; x++)
                {
        
                    do
                    {
                            System.out.println("Please Enter Passengers name"); //asking the name of the passenger
                            
                            Lufthansa[m][0] = userInput.next();
                            char strname[]=new char[20];                
                            str = Lufthansa[m][0].trim();  
                            for(int i1=0;i1<str.length();i1++)
                            {
                                strname[i1]=str.charAt(i1);
                            }
                            int c1;
                            for(c1=0;c1<str.length();c1++)
                            {
                                if((strname[c1]>=65 && strname[c1]<=91) || (strname[c1]>=97 && strname[c1]<=123))  //to check if the name entered by the user is valid
                                {
                                    flag1=true;
                                }
                                else
                                {
                                    System.out.println("Name cannot contain Numbers or special characters ");
                                    flag1=false;
                                    break;                       
                                }                    
                            }
                    }while (flag1==false);
                
                            System.out.println();
                            int age=0;
                            boolean flag10 = true ;
                            
                    do //to accept the age of the passenger
                    {
                        try
                        {
                            flag10=true;
                            System.out.println("Please Enter Passengers Age");
                            age= userInput.nextInt();
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Please Enter the age properly");
                            flag10 = false;
                        }
                            if(age<0 || age>120) 
                            {
                                System.out.println("This age is not possible"); 
                                flag10 = false; 
                            } 
                    }while (flag10==false);
                    
                        Lufthansa[m][0]=str;
                        Lufthansa[m][1]=String.valueOf(age);
                        Lufthansa[m][2] =fromplace;
                        Lufthansa[m][3] =toplace;
                        Lufthansa[m][4] ="Lufthansa";      
                        m++;
                }
                
                        int ctr;
                        int choice1 = 0;
                        boolean flag8= true;
                        boolean flag0 = true;
                do
                {
                    do
                    {
                        try
                        {
                            flag0=true;
                            System.out.println("Want to see  the list of passengers travelling in Lufthansa airlines (TYPE 1)");
                            System.out.println("Want to see the list entered by the user  (TYPE 2)");
                            choice1 = userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices properly");   
                            flag0=false; 
                        }
                    }while(flag0==false);  
                
               
                                if (choice1==1)
                                {
                                    flag8 = true;
                                    int ctr1=0;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \tAirways \tRate");
        
                                    for (ctr1=0;ctr1<m;ctr1++)
                                    {
                                        System.out.println(Lufthansa[ctr1][0]+"\t\t"+Lufthansa[ctr1][1]+"\t"+Lufthansa[ctr1][2]+"\t\t"+Lufthansa[ctr1][3]+"\t\t"+Lufthansa[ctr1][4]+"\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);        
                                }
                                else if (choice1==2)
                                {
                                    flag8 = true;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \t\t Airways \t\t Rate");
                                    
                                    for(;i<m;i++)
                                    {           
                                        System.out.println(Lufthansa[i][0]+"\t\t"+Lufthansa[i][1]+"\t"+Lufthansa[i][2]+"\t\t"+Lufthansa[i][3]+"\t\t"+Lufthansa[i][4]+"\t\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);      
                                }  
                                else if(choice1<1||choice1>2)
                                {
                                flag8 = false;
                                }
                        }while(flag8==false); 
                            flag=true;
                
                        }while(flag==false);
            
                        boolean flag8=true;
                        boolean flag3 = true;
                        int choice = 0;
                    do
                    {
                        do
                        {
                            try
                            { 
                                flag8 = true;
                                flag3 = true;
                                System.out.println("Do you want to continue to book tickets ? (If YES, type 1 or if NO, type 2");
                                choice  = userInput.nextInt(); //choice for the user to continue to book tickets
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please type 1 for Yes or 2 for No");
                                flag3 = false;
                            }
                        }while(flag3==false);
                        
                        if(choice==1)
                        {
                            Abroad();
                            flag8 = true;
                        }  
                        else if(choice==2)
                        {
                            System.out.println("Thank you for visiting our agency.");
                            System.out.println("Wish you a happy journey");
                            System.exit(0);
                            flag8 = true;
                        }
                        else if(choice<1||choice>2)   
                        {
                            System.out.println("Please enter the choice 1 or choice 2 only"); 
                            flag8 = false;
                        }
                    }while(flag8==false);
            
            
            }
            public static void CathayPacific(String fromplace, String toplace) throws IOException
            {
               Scanner userInput = new Scanner(System.in);
                boolean flag = false;
            
            do
            {
                    int rateofticket = 60000;
                    int count = 0;
                    int numofpassengers = 0;
                    boolean flagtemp = false;
                    
                    do
                    {
                        try
                        {
                            
                            System.out.println("Enter Number Of Passengers");
                            numofpassengers = userInput.nextInt();
                            flag = true;
                        }
                        catch(Exception e)
                            {
                                System.out.println("Enter A Valid Number !!");
                                flag = false;
                                
                            }
                    }   while(flag == false);
                    
                    int m = 0;
                    
                    CathayPacific[0][0] ="Raju"; //assigned seats of the airline
                    CathayPacific[0][1] ="13";
                    CathayPacific[0][2] ="mumbai";
                    CathayPacific[0][3] ="london"; 
                    CathayPacific[0][4] ="Lufthansa";

                    CathayPacific[1][0] ="Burhan";
                    CathayPacific[1][1] ="11";
                    CathayPacific[1][2] ="Israel";
                    CathayPacific[1][3] ="dubai"; 
                    CathayPacific[1][4] ="Lufthansa";

                    CathayPacific[2][0] ="Idrees";
                    CathayPacific[2][1] ="12";
                    CathayPacific[2][2] ="dubai";
                    CathayPacific[2][3] ="mumbai"; 
                    CathayPacific[2][4] ="Lufthansa";

                    CathayPacific[3][0] ="Taher";
                    CathayPacific[3][1] ="16";
                    CathayPacific[3][2] ="dubai";
                    CathayPacific[3][3] ="Delhi"; 
                    CathayPacific[3][4] ="Lufthansa";

                    CathayPacific[4][0] ="Mustafa";
                    CathayPacific[4][1] ="16";
                    CathayPacific[4][2] ="mumbai";
                    CathayPacific[4][3] ="israel"; 
                    CathayPacific[4][4] ="Lufthansa";

                    CathayPacific[5][0] ="Huzefa";
                    CathayPacific[5][1] ="16";
                    CathayPacific[5][2] ="iraq";
                    CathayPacific[5][3] ="israel"; 
                    CathayPacific[5][4] ="Lufthansa";

                    CathayPacific[6][0] ="Bakir";
                    CathayPacific[6][1] ="16";
                    CathayPacific[6][2] ="mumbai";
                    CathayPacific[6][3] ="israel"; 
                    CathayPacific[6][4] ="Lufthansa";

                    CathayPacific[7][0] ="Rahul";
                    CathayPacific[7][1] ="16";
                    CathayPacific[7][2] ="london";
                    CathayPacific[7][3] ="new york"; 
                    CathayPacific[7][4] ="Lufthansa";

                    CathayPacific[8][0] ="James";
                    CathayPacific[8][1] ="16";
                    CathayPacific[8][2] ="lisbon";
                    CathayPacific[8][3] ="new york"; 
                    CathayPacific[8][4] ="Lufthansa";
                    
                    
                    int i,j;
                       for(i=0,j=0;i<50;i++)
                       {
                           if (AirIndia[i][j]==null)
                               count++;
                       }
                       if(numofpassengers>count)
                       {
                           System.out.println("only " + (numofpassengers-count) +" Less Seats Available ");
                           flag=true;
                           continue;
                       }


                       for(i=0,j=0;i<50;i++)
                       {
                           if (CathayPacific[i][j]==null)   //checks whether the AirIndia array is null
                           {
                                m = i;
                               break;             
                           }
                       }
                            System.out.println();
                            System.out.println();

                            int x;
                            boolean flag1=false;
                            String str = " ";
                            
                for(x=0; x<numofpassengers; x++)
                {
        
                    do
                    {
                            System.out.println("Please Enter Passengers name"); //asking the name of the passenger
                            
                            CathayPacific[m][0] = userInput.next();
                            char strname[]=new char[20];                
                            str = CathayPacific[m][0].trim();  
                            for(int i1=0;i1<str.length();i1++)
                            {
                                strname[i1]=str.charAt(i1);
                            }
                            int c1;
                            for(c1=0;c1<str.length();c1++)
                            {
                                if((strname[c1]>=65 && strname[c1]<=91) || (strname[c1]>=97 && strname[c1]<=123))  //to check if the name entered by the user is valid
                                {
                                    flag1=true;
                                }
                                else
                                {
                                    System.out.println("Name cannot contain Numbers or special characters ");
                                    flag1=false;
                                    break;                       
                                }                    
                            }
                    }while (flag1==false);
                
                            System.out.println();
                            int age=0;
                            boolean flag10 = true ;
                            
                    do //to accept the age of the passenger
                    {
                        try
                        {
                            flag10=true;
                            System.out.print("Please Enter Passengers Age :- ");
                            age= userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Please Enter the age properly");
                            flag10 = false;
                        }
                            if(age<0 || age>120) 
                            {
                                System.out.println("This age is not possible"); 
                                flag10 = false; 
                            } 
                    }while (flag10==false);
                    
                        CathayPacific[m][0]=str;
                        CathayPacific[m][1]=String.valueOf(age);
                        CathayPacific[m][2] =fromplace;
                        CathayPacific[m][3] =toplace;
                        CathayPacific[m][4] ="CathayPacific";      
                        m++;
                }
                
                        int ctr;
                        int choice1 = 0;
                        boolean flag8= true;
                        boolean flag0 = true;
                do
                {
                    do
                    {
                        try
                        {
                            flag0=true;
                            System.out.println("Want to see  the list of passengers travelling in Cathay Pacific airlines (TYPE 1)");
                            System.out.println("Want to see the list entered by the user  (TYPE 2)");
                            choice1 = userInput.nextInt();
                            System.out.println();
                        }
                        catch(NumberFormatException nf)
                        {
                            System.out.println("Please enter the choices properly");   
                            flag0=false; 
                        }
                    }while(flag0==false);  
                
               
                                if (choice1==1)
                                {
                                    flag8 = true;
                                    int ctr1=0;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \tAirways \tRate");
        
                                    for (ctr1=0;ctr1<m;ctr1++)
                                    {
                                        System.out.println(CathayPacific[ctr1][0]+"\t\t"+CathayPacific[ctr1][1]+"\t"+CathayPacific[ctr1][2]+"\t\t"+CathayPacific[ctr1][3]+"\t\t"+CathayPacific[ctr1][4]+"\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);        
                                }
                                else if (choice1==2)
                                {
                                    flag8 = true;
                                    System.out.println("Name \t\tAge \tSource \t\tDestination \t\t Airways \t\t Rate");
                                    
                                    for(;i<m;i++)
                                    {           
                                        System.out.println(CathayPacific[i][0]+"\t\t"+CathayPacific[i][1]+"\t"+CathayPacific[i][2]+"\t\t"+CathayPacific[i][3]+"\t\t"+CathayPacific[i][4]+"\t\t"+rateofticket);
                                    }
                                    
                                    System.out.println("Please pay : Rs"+rateofticket*numofpassengers);      
                                }  
                                else if(choice1<1||choice1>2)
                                {
                                flag8 = false;
                                }
                        }while(flag8==false); 
                            flag=true;
                
                        }while(flag==false);
            
                        boolean flag8=true;
                        boolean flag3 = true;
                        int choice = 0;
                    do
                    {
                        do
                        {
                            try
                            { 
                                flag8 = true;
                                flag3 = true;
                                System.out.println("Do you want to continue to book tickets ? (If YES, type 1 or if NO, type 2");
                                choice  = userInput.nextInt(); //choice for the user to continue to book tickets
                            }
                            catch(Exception e)
                            {
                                System.out.println("Please type 1 for Yes or 2 for No");
                                flag3 = false;
                            }
                        }while(flag3==false);
                        
                        if(choice==1)
                        {
                            Abroad();
                            flag8 = true;
                        }  
                        else if(choice==2)
                        {
                            System.out.println("Thank you for visiting our agency.");
                            System.out.println("Wish you a happy journey !!!!!");
                            System.exit(0);
                            flag8 = true;
                        }
                        else if(choice<1||choice>2)   
                        {
                            System.out.println("Please enter the choice 1 or choice 2 only"); 
                            flag8 = false;
                        }
                    }while(flag8==false);
            }                  
}