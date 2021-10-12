package git.act.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import git.act.classes.Character;
import git.act.classes.Mount;

public class Main {
	public static void main(String[] args) {
		// Create mount
		List<Mount> mounts = new LinkedList<>();
		Mount m1 = new Mount("First mount ", 20, 40);
		Mount m2 = new Mount("Second mount", 40, 100);
		mounts.add(m1);
		mounts.add(m2);
		
		// Create Character
		System.out.println("Create character");
		List<Character> characters = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert name: ");
		String name = sc.nextLine();
		System.out.print("Insert level: ");
		int level = sc.nextInt();
		if (level > 80) {
			System.out.println("The level is to hight");
			System.exit(0);
		}		
		Character c1 = new Character(name, level);
		System.out.println("You have created the character " + c1.getName() + " with Level " + c1.getLevel());
		characters.add(c1);
	
		// Buy mount
		System.out.println("Select from the next option:" + "\n" + "01.Buy mount" + "\n" + "02.Leave game");
		System.out.println("Insert option: ");
		int buy = sc.nextInt();
		
		if (buy == 01) {
			System.out.println("Select the desire mount: ");
			System.out.println(
					"01. " + m1.getName() + "; Under lvl: " + m1.getLevel() + "; With speed: " + m1.getSpeed());
			System.out.println(
					"02. " + m2.getName() + "; Under lvl: " + m2.getLevel() + "; With speed: " + m2.getSpeed());
		} else if (buy == 02) {
			System.out.println("Have a nice day");
			System.exit(0);
		}
		
		int buyOption = sc.nextInt();
		
		if (buyOption == 01 && c1.getLevel() < 20) {
			System.out.println("You are to low");
		}else if(buyOption==02 && c1.getLevel() < 40){
			System.out.print("You don't meet the requirements to by that mount");
		}else if (buyOption != 01 && buyOption != 02) {
			System.out.println("Have a nice day");
			System.exit(0);
		} else {
			System.out.println("You now have a mount");
		}
		sc.close();
	}
}
