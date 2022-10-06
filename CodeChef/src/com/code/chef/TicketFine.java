package com.code.chef;

import java.util.Scanner;

public class TicketFine {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i= 0; i < size ; i++){
		    int fine = sc.nextInt();
		    int passengers = sc.nextInt();
		    int ticketsCollected = sc.nextInt();
		    
		    System.out.println(fine*(passengers - ticketsCollected));
		}
	}

}
