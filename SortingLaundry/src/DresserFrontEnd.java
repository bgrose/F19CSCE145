/*
 * Written By Bradley Grose
 */

import java.util.Scanner;

public class DresserFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//Prompt
		System.out.println("Welcome to the Dresser");
		prompt();
		
		//Variables
		Dresser dresser = new Dresser();
		int choice = 0;
		Clothing aclothes = null; //Holder Value
		
		while ((choice = Integer.parseInt(keyboard.nextLine())) != 4) //Exit Code
			{
			Clothing clothes = new Clothing();
			
			switch (choice) 
			{
			case 1: //Add Clothes
				aclothes = setter(clothes, keyboard);
				dresser.add(aclothes);
				break;
				
			case 2: //Remove Clothes
				aclothes = setter(clothes, keyboard);
				dresser.remove(aclothes);
				break;
				
			case 3: //Print Contents
				dresser.print();
			}

			prompt();

			}

		}
	
	//Prompts with Option
	static void prompt()
	{
		System.out.println("Enter 1: Add");
		System.out.println("Enter 2: Remove");
		System.out.println("Enter 3: Print contents");
		System.out.println("Enter 4: Quit");
	}
	
	//Creates object Clothing
	static Clothing setter(Clothing aclothes, Scanner keyboard)
	{
		String clothingType = "none";
		String clothingColor = "none";
		
		//prompt for type 
		System.out.println("Enter the type. It may be undergarment, socks, stockings, top, bottom, or cape");
		clothingType = keyboard.nextLine();
		clothingType = clothingType.toUpperCase();
		switch (clothingType)
		{
		case "UNDERGARMET":
			aclothes.setType(Type.UNDERGARMENT);
			break;
		case "SOCKS":
			aclothes.setType(Type.SOCKS);
			break;
		case "STOCKINGS":
			aclothes.setType(Type.STOCKINGS);
			break;
		case "TOP":
			aclothes.setType(Type.TOP);
			break;
		case "BOTTOM":
			aclothes.setType(Type.BOTTOM);
			break;
		case "CAPE":
			aclothes.setType(Type.CAPE);
			break;
		default:
			System.out.println("Invalid Answer");
			System.exit(0);
			break;
		}
		
		//Set Color
		System.out.println("Enter a color. It may be brown, red, pink, orange, green, blue, purple, or grey");
		clothingColor = keyboard.nextLine();
		clothingColor = clothingColor.toUpperCase();
		switch(clothingColor)
		{
			case "BROWN":
				aclothes.setColor(Color.BROWN);
				break;
			case "RED":
				aclothes.setColor(Color.RED);
				break;
			case "PINK":
				aclothes.setColor(Color.PINK);	
				break;
			case "ORANGE":
				aclothes.setColor(Color.ORANGE);
				break;
			case "GREEN":
				aclothes.setColor(Color.GREEN);
				break;
			case "BLUE":
				aclothes.setColor(Color.BLUE);
				break;
			case "PURPLE":
				aclothes.setColor(Color.PURPLE);
				break;
			case "GREY":
				aclothes.setColor(Color.GREY);
				break;
			default:
				System.out.println("Invalid Answer");
				System.exit(0);
				break;
		}
		
		return aclothes;
	}
}
