package com.perigon.practuce1;
import java.io.*;

public class Practice_E5 {
		public static void practice() {
			try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = -1;
			int b = -1;
			
			
//			infinite loop to prompt message till user enterd number
			while(true) {
				try {
					System.out.println("Enter First Nimber");
					 a = Integer.parseInt(br.readLine());
					 break;
					}
				catch(NumberFormatException nfe) {
					System.out.println("Wrong input Entered");
				}
			}
				
//				infinite loop to prompt message till user entered number
				while(true) {
					try {
						System.out.println("Enter Second Number");
						b = Integer.parseInt(br.readLine());
						
						
						try {
							int c =a/b;
							System.out.println("Result:" +c);
							}
						catch(ArithmeticException ae) {
							System.out.println("Wrong input: Dont pass Zero's");
						}
						break;
						}
					catch(NumberFormatException nfe) {
						System.out.println("Wrong input Enter only Numbers");
						}
				}
			}
				
			
				catch(IOException ioe) {
					ioe.printStackTrace();
						
					}
					
				
				}
				
			}
		
		
		





