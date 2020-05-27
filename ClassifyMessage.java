/*
* ClassifyMessage.java
* Author: JiaoAng Dong
* Submission Date: 9/12/2019
*
* Purpose: The user inputs a long set of phrases, we use the
* enumeration class and if else statements to organize the 
* categories and print out the needed information. 
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

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}; // creates the enumeration 

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		String catString, payload ;  // initiates the two string variables
		double latitude, longitude ; // initiates the two double variables
		boolean isInRange ;  // initiates the boolean variable
		MessageCategory category ; // initiates the category variable
		
		double south = 39.882343; // creates the south most latitude 
		double north = 40.231315; // creates the north most latitude
		double west = -105.743511; // creates the west most longitude
		double east = -104.907864; // creates the east most longitude
		
		System.out.print("Please enter a formatted message:");
		catString = keyboard.next();   // takes in the input
		catString = catString.trim();  // trims and makes the "raw category" 
		latitude = keyboard.nextDouble(); // finds the latitude
		longitude = keyboard.nextDouble(); // finds the longitude
		payload = keyboard.nextLine(); // takes in the input
		payload = payload.trim(); // finds the "message" 
		
		if (catString.equalsIgnoreCase("fire" ) || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT; }  

		// fire or smoke is cat.ALERT

        else if (catString.equalsIgnoreCase("need")) {
        	category = MessageCategory.NEED; }
		
		// need is cat.NEED
		
        else if (catString.equalsIgnoreCase("offer")) {
        	category = MessageCategory.OFFER; }
		
		// offer is cat.offer
		
        else if (catString.equalsIgnoreCase("structure") || 
        		catString.equalsIgnoreCase("road") ||
        		catString.equalsIgnoreCase("photo") ||
        		catString.equalsIgnoreCase("evac")){
        	category = MessageCategory.INFO; }

        // structure, road, photo, evac is cat.INFO	
		
        else {
        	category = MessageCategory.UNKNOWN ;}
        
		//everything else is cat.UNKNOWN
		
        if (latitude >= south && latitude <= north &&
        	longitude >= west && longitude <= east) {
        	isInRange = true;
        }
        else {
        	isInRange = false;
    	}
        
        // determinds if the latitude and longitude given is in range of the constant lat and long
        
        System.out.println("Category:\t" + category);
        System.out.println("Raw Cat:\t" + catString);
        System.out.println("Message:\t" + payload);
        System.out.println("Latitude:\t" + latitude);
        System.out.println("Longitude:\t" + longitude);
        System.out.println("In Range:\t" + isInRange);
		
        // prints out the variables
        
        keyboard.close();
		
	}
	
}
