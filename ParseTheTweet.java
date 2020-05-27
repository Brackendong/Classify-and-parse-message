/*
* ParseTheTweet.java
* Author: JiaoAng Dong
* Submission Date: 9/5/2019
*
* Purpose: The user inputs a long set of phrases, words
* under the twitter format with hashtag. The program will 
* divide each type and only output the information.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;

public class ParseTheTweet {
 
	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter your tweet");
		String tweet = keyboard.nextLine();
		tweet = tweet.replace(",", "-") ;
		
		
		String type; 
		String detail; 
		String location;
		String latitude;
		String longitude;
		
		int start, finish;
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
	    
		type = tweet.substring(start + 5,finish);
		
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		detail = tweet.substring(start + 5,finish);
		
		tweet = tweet.substring(finish+1); 
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		location = tweet.substring(start + 5,finish);
		
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		latitude = tweet.substring(start + 5,finish);
		
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		
		longitude = tweet.substring(start + 5,finish);
		
		String type1 = type.trim();
		String type2 = type1.toUpperCase();	
		String detail1 = detail.trim();
		String location1 = location.trim();
		String latitude1 = latitude.trim();
		String longitude1 = longitude.trim();
		
		System.out.println("Type:\t\t" + type2);
		System.out.println("Detail:\t\t" + detail1);
		System.out.println("Location:\t" + location1);
		System.out.println("Latitude:\t" + latitude1);
		System.out.println("Longitude:\t" + longitude1);
		
		
		keyboard.close();
				
	}	
	
}
