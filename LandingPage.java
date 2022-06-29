package org.resortmanagement.console;

import java.util.Scanner;

public class LandingPage {

	void start() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("                            Welcome to My Resort                                       ");
		System.out.println("-----------------------------------------------------------------------------");
		selectOption();
	}

	void selectOption() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("1.About Us \n2.Book your Slot ");
		System.out.println("-----------------------------------------------------------------------------");
		enterChoice();
	}
	void enterChoice() {
		Scanner sc = new Scanner(System.in);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			AboutUs au = new AboutUs();
			au.viewFacilities();
			break;
		case 2:
			book();
			break;
		case 3:
			
		default :
			System.out.println("Enter a valid choice");
		   
		}
	}
	

	

	public static void main(String[] args) {
		LandingPage lp = new LandingPage();
		lp.start();
	}
}
