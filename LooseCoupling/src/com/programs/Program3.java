package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program3 {

	static Scanner sc = new Scanner(System.in);
	int options;

	public ArrayList<Products> add() {
		List<Products> al = new ArrayList<>();

		Products pen = new Products();
		pen.setName("pen");
		pen.setColor("red");
		pen.setStyle("retro");
		pen.setSize("small");
		pen.setPriorities("low");

		Products book = new Products();
		book.setName("book");
		book.setColor("white");
		book.setStyle("class");
		book.setSize("king");
		book.setPriorities("medium");

		Products phone = new Products();
		phone.setName("phone");
		phone.setColor("black");
		phone.setStyle("touch");
		phone.setSize("fullscreen");
		phone.setPriorities("high");
		
		Products laptop = new Products();
		laptop.setName("laptop");
		laptop.setColor("grey");
		laptop.setStyle("latest");
		laptop.setSize("medium");
		laptop.setPriorities("low");
		
		Products watch = new Products();
		watch.setName("watch");
		watch.setColor("grey");
		watch.setStyle("digital");
		watch.setSize("small");
		watch.setPriorities("high");

		al.add(pen);
		al.add(book);
		al.add(phone);
		al.add(laptop);
		al.add(watch);
		return (ArrayList<Products>) al;
	}

	public int menu() {
		do {
			System.out.println("select any one option to proceed \n" + "1.view list of products\r\n"
					+ "2.Replace the product\r\n" + "3.Change Priority\r\n" + "4.Shuffle Products\r\n" + "5.Exit\r\n");
			options = sc.nextInt();
			if (options < 1 || options > 5)
				System.out.println("invalid option please select valid option\n");
		} while (options < 1 || options > 5);
		System.out.println("option selected is " + options);
		return options;
	}

	public void displayList(ArrayList<Products> al) {
		int count = 1;
		for (Products p : al)
			System.out.println((count++) + "." + p.getName());
	}

	public void replace(ArrayList<Products> al) {

		System.out.println("select the product that you want to replace:");
		displayList(al);
		Products pp = new Products();
		int i = sc.nextInt();
		System.out.println("enter the product name");
		pp.setName(sc.next());
		System.out.println("enter the product style");
		pp.setStyle(sc.next());
		System.out.println("enter the product color");
		pp.setColor(sc.next());
		System.out.println("enter the product size");
		pp.setSize(sc.next());
		System.out.println("enter the priorities (low,medium,high)");
		pp.setPriorities(sc.next());

		al.set((i - 1), pp);
	}

	public void getPriorities(ArrayList<Products> al) {
		int count = 1;
		for (Products p : al) {
			System.out.println((count++) + "." + p.getName() + " - " + p.getPriorities());
		}
	}

	public void changePriorities(ArrayList<Products> al) {
		System.out.println("select the product that you want to change priorities: ");
		getPriorities(al);
		int i = sc.nextInt();
		System.out.println("select priority \n1.low \n2.medium \n3.high");
		int j = sc.nextInt();
		String s = "";
		switch (j) {
		case 1:
			s = "low";
			break;
		case 2:
			s = "medium";
			break;
		case 3:
			s = "high";
			break;
		default:
			System.out.println("invalid option");
			break;
		}
		System.out.println("priority selected is " + s);
		Products p = new Products();
		Products o = (Products) al.get(i - 1);
		p.setName(o.getName());
		p.setStyle(o.getStyle());
		p.setColor(o.getColor());
		p.setSize(o.getSize());
		p.setPriorities(s);
		al.set((i - 1), p);

	}

	public void shuffle(ArrayList<Products> al) {
		Collections.shuffle(al);
		System.out.println("list of products after shuffling:");
		displayList(al);
	}

	public static void main(String[] args) {

		Program3 p3 = new Program3();
		ArrayList<Products> al = p3.add();

		int option;
		do {
			option = p3.menu();
			switch (option) {
			case 1: {
				System.out.println("list of products:");
				p3.displayList(al);
				System.out.println();
			}
				break;
			case 2: {
				System.out.println("replace the product");
				p3.replace(al);
				System.out.println();
			}
				break;
			case 3: {
				System.out.println("change priority");
				p3.changePriorities(al);
				System.out.println();
			}
				break;
			case 4: {
				System.out.println("shuffle");
				p3.shuffle(al);
				System.out.println();
			}
				break;
			case 5: {
				System.out.println("you have selected exit option");
				System.out.println("exiting....");
			}
				break;
			default:
				System.out.println("invalid");
				break;
			}
			if (option == 5)
				break;
			System.out.println("do you want to continue y/n");
			String s = sc.next();
			if (s.equalsIgnoreCase("y"))
				continue;
			else
				break;
		} while (option > 1 || option < 6);
		System.out.println("exited successfully");
	}
}
