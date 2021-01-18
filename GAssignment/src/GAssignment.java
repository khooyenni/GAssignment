import java.util.Scanner;
import javax.swing.JOptionPane;
public class GAssignment {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		JOptionPane.showMessageDialog(null, "Hello and Welcome to Bank UUM. ");
		PersonalInformation();
		in.close();
	}
	
	public static void PersonalInformation () {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Personal Information:");
		
		System.out.print("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age : " + age);
		System.out.println();
		
		if(age>=18) {
			System.out.println("Congratulation, you are eligible to apply the bank service." );
			System.out.println();
			
			System.out.print("Enter your name :");
			String name = in.next();
			
			System.out.print("Enter your gender :");
			String gender = in.next();
			
			System.out.print("Enter your marital :");
			String marital = in.next();
			
			System.out.println();
			
			String[][] personal = { {"Name\t: ", "Gender\t: ", "Marital\t: "},
									{name, gender, marital}
			};
			
			PersonalArray(personal);
			
			System.out.println();
			
			System.out.println("Please enter the number of service:");
			System.out.println("1. Business Loan \n2. Personal Account \n3. Credit Card \n4. Housing Loan \n5. Investment");
			System.out.print("Your choice:");
			int service = in.nextInt();
			System.out.println();
			
			if (service==1) {
				System.out.println("The service you choose is Business Loan.");
				BusinessLoan();
			}
			else if (service==2) {
				System.out.println("The service you choose is Personal Account.");
				PersonalAccount();
			}
			else if (service==3) {
				System.out.println("The service you choose is Credit Card.");
				CreditCard();
			}
			else if (service==4) {
				System.out.println("The service you choose is Housing Loan.");
				HousingLoan();
			}
			else if (service==5) {
				System.out.println("The service you choose is Investment.");
				Investment();
			}
			else {
				System.out.println("Please enter the valid number");
			}
			
			System.out.println();
			
		}else
			System.out.print("Sorry, you are not eligible to apply the bank service.");
		System.out.println();
		
		System.out.println("Please come again and thank you for choosing us. ");
	}

	public static void PersonalArray (String [][] x) {
		System.out.println(x[0][0] + x[1][0]);
		System.out.println(x[0][1] + x[1][1]);
		System.out.println(x[0][2] + x[1][2]);
		
	}
	public static void BusinessLoan() {
		Scanner in = new Scanner (System.in);
		B2();
		B3();
		B4();
		in.close();
	}
	
	public static void B2() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type of Business Loan Provide: ");
		String loan1 = in.next();
		String loan2 = in.next();
		String loan3 = in.next();
		
		System.out.println();
		
		System.out.println("Type of Business Loan Provide: ");
		String[]LoanProvide= {loan1, loan2, loan3};
		B2Array(LoanProvide);
		System.out.println();
	}
	
	public static void B2Array(String[]y) {
		int j=0;
		while(j<y.length) {
			System.out.println(y[j]);
			j++;
		};
	}
	
	public static void B3() {
		Scanner in = new Scanner(System.in);	
		System.out.println("Interest for business loan :");
		String[][]loan= {{"1. More or equal to RM10000 is ","2. Less than RM10000 is ",},
						{"6%.","7%."}
		};
		B3Array(loan);
		System.out.println();
	}	
	
	public static void B3Array(String[][]z) {
		System.out.println(z[0][0] +z[1][0]);
		System.out.println(z[0][1] +z[1][1]);
	}
	
	public static void B4() {
		Scanner in = new Scanner(System.in);	
		System.out.println("Enter the amount borrowed: ");
		int amount = in.nextInt();
		System.out.println("Amount borrowed : " + "RM" + amount);
		System.out.println();
		
		System.out.println("The number of months to pay the loan back: ");
		int months = in.nextInt();
		System.out.println("The number of months to pay the loan back : " + months + "months");
		System.out.println();
		
		
		int interest1 = 6;
		int interest2 = 7;	
		if(amount>=10000) {
			System.out.println("Interest per year is : " + interest1 + "%");
		}else if(amount<10000){
			System.out.println("Interest per year is : " + interest2 + "%");
		}
		System.out.println();
		
		double rate1 = amount * (0.06/12);
		double rate2 = amount * (0.07/12);
		if(amount>=10000) {
			System.out.printf("Total interest per month : RM%.2f ", rate1);
		}else if(amount<10000){
			System.out.printf("Total interest per month : RM%.2f ", rate2);
		}
		System.out.println();
		
		double tinterestloan1 = months * rate1;
		double tinterestloan2 = months * rate2;
		if(amount>=10000) {
			System.out.printf("Total interest per loan : RM%.2f ", tinterestloan1);
		}else if(amount<10000){
			System.out.printf("Total interest per loan : RM%.2f ", tinterestloan2);
		}
		System.out.println();
		
		double mpayment1 = rate1 + (amount/12);
		double mpayment2 = rate2 + (amount/12);
		if(amount>=10000) {
			System.out.printf("Monthy payment  : RM%.2f ", mpayment1);
		}else if(amount<10000){
			System.out.printf("Monthy payment  : RM%.2f ", mpayment2);
		}
		System.out.println();
		
		double tpayback1 = tinterestloan1+ amount;
		double tpayback2 = tinterestloan1+ amount;
		if(amount>=10000) {
			System.out.printf("Total borrowing cost : RM%.2f ", tpayback1);
		}else if(amount<10000){
			System.out.printf("Total borrowing cost : RM%.2f ", tpayback2);
		}
	}
	
	public static void PersonalAccount() {
		Scanner sc = new Scanner (System.in);
		
		long acc ;
		int balance = 0, year , register  ;
		double intrest=0, yearbalance=0 , totalintrest=0;

		System.out.println("Enter Account Number: ");
		acc = sc.nextLong();
		
		System.out.println("For your information, your intrest rate will increase to 4.0% after 10 year your registration.");
		
		System.out.println("\nEnter how many year you registered with this bank account: ");
		register = sc.nextInt();
		
		if (register <= 10) {
		System.out.println("How many year did you want to Check Interest?");
		year = sc.nextInt();
		
		System.out.print("\nEnter Current Saving Account: RM ");
		balance = sc.nextInt();
		System.out.println("Intrest rate for this account is 2.0% per year");
		
		
		for(int i = 0 ; i < year ; i++) {
		
		intrest = balance * 0.02 ;
		
	    totalintrest = intrest + totalintrest ;
		}
		
		yearbalance = balance + totalintrest ;
		}
		
		else if (register > 10) {
			System.out.println("How many year did you want to Check Interest?");
			year = sc.nextInt();
			
			System.out.print("\nEnter Current Saving Account: RM ");
			balance = sc.nextInt();
			System.out.println("\nIntrest rate for this account is 4.0% per year.");
				for(int i = 0 ; i < year ; i++) {
				
				intrest = balance * 0.04 ;
				
			    totalintrest = intrest + totalintrest ;
				}
				
				yearbalance = balance + totalintrest ;
				
				
				int [] gift1 = {5};
				System.out.println("Did you know that you will get free gift because of your loyalty in our service");
				System.out.println("You can get random item by enter one of this number 1, 2, 3, 4, 5. ");
				
				for (int k=0 ; k<gift1.length; k++) {
				System.out.print("Enter the number of the gift: ");
				gift1[k] = sc.nextInt();
				if (gift1[k] == 1) {
					System.out.println("You will get Umbrella as a gift.");
				}
				else if(gift1[k] == 2) {
					System.out.println("You will get Bottle as a gift.");
				}
				else if (gift1[k] == 3) {
					System.out.println("You will get Tote Bag as a gift.");
				}
				else if (gift1[k] == 4) {
					System.out.println("You will get Mini Fan as a gift.");
				
				}
				else if (gift1[k] == 5) {
					System.out.println("You will get PowerBank as a gift.");
				
				}
		
			}
		}
		
		System.out.println();
		System.out.println("*************************************************");
	    System.out.println("ACCOUNT NUMBER      : "+acc);

	    System.out.println("\nYour year intrest          :RM " + intrest);
	    System.out.println("Your total intrest         :RM " + totalintrest);
	    System.out.println("Your balance before intrest : RM " +balance);
		System.out.println("Your balance after intrest : RM " +yearbalance);
		System.out.println("Makesure to checkout your gift at bank counter by show this resit.");
		
		System.out.println("\n*Thank You For Using Our Services*");
		System.out.println("*************************************************");
		
		sc.close();
	}
	
	public static void CreditCard() {
		Scanner in=new Scanner(System.in);
		System.out.println("Here is the break section for those who want to apply credit cards. ");
		for(int i=0; i<6; i++) {
			for(int p=0; p<i; p++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		phonenumber();
		register();
		incomeperannum();
		listofcard();
		fact();
		fees();
		payment();
		malaysiaprihatin();
		total();
		
	}
	
	public static void phonenumber() {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter a phone number registered under your name: ");
		int phone = in.nextInt();
	}
	
	public static void register() {
		Scanner in=new Scanner(System.in);
		System.out.println("Please wait for a five-digit code on your registered phone number just now. ");
		String[] code = new String[5];
		System.out.println("Enter the five-digit code one by one by tapping enter here: ");
		for(int i=0; i<code.length; i++) {
			code[i] = in.next();
		}
		System.out.println();
		
		System.out.println("Here is the five-digit code you have typed. ");
		for(int i=0; i<code.length; i++) {
			System.out.println(code[i]);
		}
		System.out.println();
	}
	
	public static void incomeperannum() {
		Scanner in=new Scanner(System.in);
		System.out.println("Please note that you might need to enter your income per annum for a few times to confirm and verify your income's value. ");
		System.out.print("Please enter your income per annum: ");
		int income = in.nextInt();
		if(income>=24000) {
			System.out.println("Congratulations! You are qualified to apply credit cards from our bank.");
		} else if(income<24000) {
			System.out.println("Oops, you have not achieved the minimum eligibility for new credit card holders.");
		}
		
		if(income>=50000) {
			System.out.println("Type of credit card(s) provided are 'Platinum Credit Card', 'Gold Credit Card' and 'Signature Credit Card'.");
		} else if(income<50000 && income>=24000) {
			System.out.println("Type of credit card(s) provided are 'Classic Credit Card' and 'Harimau Credit Card'");
		}
		System.out.println();
		
		System.out.println("Our customer service will contact you to choose the type of credit card(s) you would like to apply after paying the total fees. ");
		
		System.out.println("Please wait while we try to serve you with the best service. ");
		for(int i=0; i<20; i++) {
			System.out.print("--");
		}System.out.println("");
		
		System.out.println("Thank you for connecting with our best customer service. ");
		for(int i=0; i<20; i++) {
			System.out.print("--");
		}
		System.out.println("");
	}
	
	public static void listofcard() {
		Scanner in=new Scanner(System.in);
		String [][] creditcardList = {{"Platinum Credit Card", "Gold Credit Card", "Signature Credit Card"},
									  {"Classic Credit Card", "Harimau Credit Card"}
		};
		chosenArray(creditcardList);
	}
	
	public static void chosenArray(String[][]a) {
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter your income per annum: ");
		int income = in.nextInt();
		if(income>=50000) {
			System.out.println("The type of credit card you would like to apply is "+ a[0][0]);
		} else if(income>=24000 && income<50000) {
			System.out.println("The type of credit card you would like to apply is " + a[1][1]);
		}
		
		for(int i=0; i<20; i++) {
			System.out.print("--");
		}
		System.out.println("");
	}
	
	public static void fact() {
		System.out.println("HERE COMES THE FACT TIME ");
		System.out.println("DO YOU KNOW THAT ");
		int[] customerList = {10, 40, 24, 5, 32};
		int total = 0; 
		for(int i=0; i<customerList.length; i++) {
			total += customerList[i];
		}
		System.out.println("THE TOTAL NUMBER OF CUSTOMERS APPLYING BANK CREDIT CARD(S) IN YOUR STATE AREA IS " + total);
		
		for(int i=0; i<20; i++) {
			System.out.print("--");
		}
		System.out.println("");
	}
	
	public static void fees() {
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter your income per annum: ");
		int income = in.nextInt();
		if(income>=50000) {
			System.out.println("The annual fees is RM130 and the interest rate per month is 1.30% to 1.70%.");
		} else if(income>=24000 && income<50000) {
			System.out.println("The annual fees is RM60 and the interest rate per month is 1.25% to 1.50%.");
		}
		
		int[][] cardAmount = {{1, 2, 3, 4},
							  {1, 2, 3, 4}		
		};
		if(income>=50000) {
			System.out.println("The maximum amount of credit cards you can apply is " + cardAmount[0][1]);
		} else if(income>=24000 && income<50000) {
			System.out.println("The maximum amount of credit cards you can apply is " + cardAmount[1][0]);
		}
		
		System.out.print("Please enter the amount of credit cards you would like to apply: ");
		int card = in.nextInt();
		System.out.println();
		
		System.out.println("Please note that we have a surcharge of RM3 for service charges. ");
		for(int i=0; i<20; i++) {
			System.out.print("--");
		} 
		System.out.println("");
		
		System.out.println("Please wait while we calculate the total fees for this one-time service. ");
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.print("--");
		}
		System.out.println("");
		
		int sum2 = card*60*3;
		if(income>=24000 && income<50000) {
			System.out.println("The total fees that you have to pay is " + "RM" + sum2);
		} else if(income>=50000) {
			int sum1 = card*130*3;
			System.out.println("The total fees that you have to pay is " + "RM" + sum1);
		}
	}
		
	public static void payment() {
		System.out.print("Please wait while we connect to our payment system. ");
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.print("---");
		}
		System.out.println("");
	}
	
	public static void malaysiaprihatin() {
		double[][] water = {{1.7, 2.7, 3.7, 4.7},
							{5.7, 6.7, 7.7, 8.7}
		};
		System.out.println("A brief reminder from us <3");
		System.out.println("Please drink at least " + water[0][2] + "litres of water a day in this pandemic situation and don't forget to wear mask in public. ");
		System.out.println("MALAYSIA PRIHATIN. ");
		
		for(int i=0; i<20; i++) {
			System.out.print("---");
		}
		System.out.println("");
	}
	
	public static void total() {
		System.out.println("Please move on to pay the total fees. ");
		System.out.println();
		
		int [] secure = {12, 63, 80, 5, 13};
		System.out.print("Here are the security codes to use to retrieve your credit card at our nearest bank branches. ");
		for(int i=0; i<secure.length; i++) {
			System.out.println(secure[i]);
		}
		System.out.println("DO REMEMBER TO SHOW THESE NUMBERS TO OUR FRONT HELP CENTER. ");
		
		for(int i=0; i<20; i++) {
			System.out.print("---");
		}
		System.out.println("");
		
		String [][] service = { {"Mr.", "Mrs.", "Ms."},
								{"Mohamed", "Mahfuzah", "Athirah"}
		};
		System.out.println(service[0][0] + " " + service[1][0] + " is glad to be in your service. ");
		System.out.println();
		
		System.out.println("We will inform you when the credit card(s) is ready by the number of 03-1234567. ");
		
		for(int i=0; i<6; i++) {
			for(int p=5; p>i; p--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static int age;
	static int salary;
	static int choice;
	static int housingloan;
	static float changers;
	public static void HousingLoan() {
		ReceiveInformation();
		printToH();
		printFinalform();
	}
	
	public static void ReceiveInformation() {
		Scanner input = new Scanner (System.in);
		
	do {
		System.out.println("Enter your age:");
		age=input.nextInt();
		
		{
		System.out.println("Enter your salary: ");
		salary=input.nextInt();
		if(salary<2000) {
			System.out.println("Your salary is not met the condition ");	
		}
		else if (age<21||age>60) {
			System.out.println("Your age is not met the condition ");
		}
		else {
			System.out.println(" ");
		}
		}
	} while (salary<2000 || age<21 || age>60 );
	 
	}

	public static void printToH() {
		Scanner input = new Scanner (System.in);
		
		String banglo[] = {"Banglo","Maximum housing loan = RM500000","Payment limited: 10years ","Changers: 3% "};
		String condo[] = {"Condo","Maximum housing loan = RM200000","Payment limited: 3years ","Changers: 2% "};
		String hometown[] = {"Hometown","Maximum housing loan = RM400000","Payment limited: 5years ","Changers: 3% "};
		System.out.println("===================");
		System.out.println("== Type of house ==");
		System.out.println("===================");
		System.out.println("1: Banglo ");
		System.out.println("2: Condo ");
		System.out.println("3: Hometown ");
		System.out.println("Please enter your choice: ");
		choice = input.nextInt();
		if(choice==1) {
			System.out.println(banglo[0]);
			System.out.println(banglo[1]);
			System.out.println(banglo[2]);
			System.out.println(banglo[3]);
			
			System.out.println("Enter your Housingloan: ");
			housingloan=input.nextInt();
			changers = (housingloan*3/100);
		}
	    else if(choice==2) {
	    	System.out.println(condo[0]);
	    	System.out.println(condo[1]);
	    	System.out.println(condo[2]);
	    	System.out.println(condo[3]);
	    	
			System.out.println("Enter your Housingloan: ");
			housingloan=input.nextInt();
			changers = (housingloan*2/100);
	    }
	    else if(choice==3) {
	    	System.out.println(hometown[0]);
	    	System.out.println(hometown[1]);
	    	System.out.println(hometown[2]);
	    	System.out.println(hometown[3]);
			
			System.out.println("Enter your Housingloan: ");
			housingloan=input.nextInt();
			changers = (housingloan*3/100);
	    }
	    else {
	    	 System.out.print("Invalid number !!!");
	}
	}
	public static void printFinalform() { 
		System.out.println("");
		System.out.println("=================");
		System.out.println("== INFORMATION ==");
		System.out.println("=================");
		System.out.println("");
		System.out.println("Age: " + age);
		System.out.println("");
		System.out.println("Salary: RM" + salary);
		System.out.println("");
		System.out.println("Housingloan: RM" + housingloan);
		System.out.println("");
		
		String banglo[] = {"Banglo","Maximum housing loan = RM500000","Payment limited: 10 years ","Changers: 3% "};
		String condo[] = {"Condo","Maximum housing loan = RM200000","Payment limited: 3 years ","Changers: 2% "};
		String hometown[] = {"Hometown","Maximum housing loan = RM400000","Payment limited: 5 years ","Changers: 3% "};
		
		if(choice==1) {
			System.out.println(banglo[0]);
			System.out.println(banglo[1]);
			System.out.println(banglo[2]);
			System.out.println(banglo[3]);
			System.out.println("Total Changers = RM" + changers );
			
		}
	    else if(choice==2) {
	    	System.out.println(condo[0]);
	    	System.out.println(condo[1]);
	    	System.out.println(condo[2]);
	    	System.out.println(condo[3]);
			System.out.println("Total Changers = RM "+ changers);
	    }
	    else {
	    	System.out.println(hometown[0]);
	    	System.out.println(hometown[1]);
	    	System.out.println(hometown[2]);
	    	System.out.println(hometown[3]);
			System.out.println("Total Changers = RM"+changers);
			}
	  }
	
	public static void Investment () {
		Scanner in = new Scanner (System.in);
		//I2();
		I3();
		I4();
		in.close();
	}
	
	public static void I2 () {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the investment provide :");
		String invest1 = in.next();
		String invest2 = in.next();
		String invest3 = in.next();
		String invest4 = in.next();
		String invest5 = in.next();
		
		System.out.println();
		
		System.out.println("Investment provided :");
		String[] investmentprovide = {invest1, invest2, invest3, invest4, invest5};
		
		I2Array(investmentprovide);
		
		System.out.println();
		
	}
	
	public static void I2Array (String [] y) {
		int j=0;
		while (j<y.length) {
			System.out.println(y[j]);
			j++;
		}
	}
	
	public static void I3 () {
		System.out.println("Price of investment :");
		String[] investment = {"per property", "per stock", "gold per kg", "bonds per year", "annuity per year"};
		int [] price = {760000, 150, 7600, 98, 1200};
		
		for (int i=0; i<investment.length; i++) {
			System.out.print("Price of " + investment[i] + " : " + price[i]);
			System.out.println();
		}
		
		System.out.println();
	}

	public static void I4 () {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the number of investment:");
		int items = in.nextInt();
		System.out.print("Enter price of first investment:");
		double price1 = in.nextDouble();
		System.out.print("Enter quantity of first investment:");
		int quantity1 = in.nextInt();
		System.out.println();
		
		if (items<=2) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = ((price1*quantity1) + (price2*quantity2));
			System.out.printf("Total price		:RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>100000) {
				double discount = totalprice/100*10;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
		
		if (items>2 && items<=3) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of third investment:");
			double price3 = in.nextDouble();
			System.out.print("Enter quantity of third investment:");
			int quantity3 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = (price1*quantity1) + (price2*quantity2) + (price3*quantity3);
			System.out.printf("Total price		:RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>200000) {
				double discount = totalprice/100*20;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
		
		
		if (items>3 && items<=4) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of third investment:");
			double price3 = in.nextDouble();
			System.out.print("Enter quantity of third investment:");
			int quantity3 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of fourth investment:");
			double price4 = in.nextDouble();
			System.out.print("Enter quantity of fourth investment:");
			int quantity4 = in.nextInt();
			System.out.println();
			
			double totalprice = (price1*quantity1) + (price2*quantity2) + (price3*quantity3) + (price4*quantity4);
			System.out.printf("Total price		:RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>300000) {
				double discount = totalprice/100*30;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
	}


	}


