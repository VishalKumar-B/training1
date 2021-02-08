package com.programs;

import java.util.Scanner;
import java.util.Vector;

public class Program2 {
	static Scanner sc = new Scanner(System.in);
	int options;

	public void displayAmount() {
		System.out.println("enter the amount in the below format:" + "1, 5, 10, 25, 50, 100");
	}

	public int menu() {
		do {
			System.out.println("select any one option to proceed \n" + "1.Air Max Plus(125)\r\n"
					+ "2.Epic React Flynit (150)\r\n" + "3.Air VaporMax Flyknit 2 (190)\r\n" + "4.Air Max 270 (150)\r\n"
					+ "5.Zoom Stefan Janoski (85)\r\n" + "6.Exit\r\n");
			options = sc.nextInt();
			if (options < 1 || options > 6)
				System.out.println("invalid option please select valid option\n");
		} while (options < 1 || options > 6);
		System.out.println("option selected is " + options);
		return options;
	}

	public void cancel() {
		menu();
	}

	public void payment(int price) {
		int[] dollars = new int[] { 1, 5, 10, 25, 50, 100 };
		int amountpaid = 0;
		while (sc.hasNext()) {
			int input = sc.nextInt();

			if (input != 100 && input != 50 && input != 25 && input != 10 && input != 5 && input != 1) {
				System.out.println("invalid format, please enter the amount in valid format");
			} else {
				amountpaid = amountpaid + input;
				if (amountpaid == price) {
					break;
				} else if (amountpaid < price)
					System.out.println("pay the balance amount of: " + (price - amountpaid));
				else if (amountpaid > price) {
					System.out.println("collect the balance of: " + (amountpaid - price));
					int v = amountpaid - price;
					Vector<Integer> ans = new Vector<>();
					for (int i = dollars.length - 1; i >= 0; i--) {
						while (v >= dollars[i]) {
							v -= dollars[i];
							ans.add(dollars[i]);
						}
					}

					for (int i = 0; i < ans.size(); i++) {
						System.out.println("dollar: " + ans.elementAt(i));
					}
					break;
				}
			}
		}
		System.out.println("total amount paid please collect the product: ");
	}

	public void airMaxPlus() {
		displayAmount();
		int price = 125;
		payment(price);
		System.out.println("returning to main menu...");
		System.out.println();

	}

	public void epicReactFlynit() {
		displayAmount();
		int price = 150;
		payment(price);
		System.out.println("returning to main menu...");
		System.out.println();

	}

	public void airVaporMaxFlyknit2() {
		displayAmount();
		int price = 190;
		payment(price);
		System.out.println("returning to main menu...");
		System.out.println();

	}

	public void airMax270() {
		displayAmount();
		int price = 150;
		payment(price);
		System.out.println("returning to main menu...");
		System.out.println();

	}

	public void zoomStefanJanoski() {
		displayAmount();
		int price = 85;
		payment(price);
		System.out.println("returning to main menu...");
		System.out.println();

	}

	public static void main(String[] args) {
		Program2 p = new Program2();
		int option;
		int answer;

		do {
			option = p.menu();
			switch (option) {
			case 1: {
				System.out.println("you have selected Air Max Plus which is of $ 125");
				System.out.println("do you want to purchase the product? \n1.yes \n2.no ");
				answer = sc.nextInt();
				if (answer == 1)
					p.airMaxPlus();

			}
				break;
			case 2: {
				System.out.println("you have selected Epic React Flynit which is of $ 150");
				System.out.println("do you want to purchase the product? \n1.yes \n2.no ");
				answer = sc.nextInt();
				if (answer == 1)
					p.epicReactFlynit();

			}
				break;
			case 3: {
				System.out.println("you have selected Air VaporMax Flyknit 2 which is of $ 190");
				System.out.println("do you want to purchase the product? \n1.yes \n2.no ");
				answer = sc.nextInt();
				if (answer == 1)
					p.airVaporMaxFlyknit2();

			}
				break;
			case 4: {
				System.out.println("you have selected Air Max 270 which is of $ 150");
				System.out.println("do you want to purchase the product? \n1.yes \n2.no ");
				answer = sc.nextInt();
				if (answer == 1)
					p.airMax270();

			}
				break;
			case 5: {
				System.out.println("you have selected Zoom Stefan Janoski which is of $ 85");
				System.out.println("do you want to purchase the product? \n1.yes \n2.no ");
				answer = sc.nextInt();
				if (answer == 1)
					p.zoomStefanJanoski();

			}
				break;
			case 6: {
				System.out.println("you have selected exit option");
				System.out.println("exiting....");
			}
				break;
			default:
				System.out.println("invalid");
				break;
			}
			if (option == 6)
				break;
		} while (option > 1 || option < 6);
		System.out.println("exited successfully");

	}

}
