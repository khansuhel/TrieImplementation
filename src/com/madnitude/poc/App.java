package com.madnitude.poc;

import java.util.Scanner;

public class App {
	public static void main(String...args){
		boolean enterMore = true;
		while(enterMore){
			TrieImplementation t = new TrieImplementation();
			Scanner sc = new Scanner(System.in);
			System.out.println("Plese enter the Word : ");
			t.insert(sc.next());
			System.out.println("Do you want to enter some more Strings ?(y/n) [Y] : ");
			String input  = sc.next();
			if(input.equalsIgnoreCase("n")){
				enterMore=false;
			}
		}
		
	}
}
