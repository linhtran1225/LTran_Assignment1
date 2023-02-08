/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: Build an application that will step through some possible problems to restore internet connectivity.
 * Due: 02/13/2023
 * Platform/compiler: Eclipse for Windows 10
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Linh Tran_
*/
import java.util.*;
public class WifiDiagnosis {

	public static void main(String[] args) {
		String answer;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work.");
		System.out.println("");
		System.out.println("Reboot the computer and try to connect");
		System.out.println("Did that fix the problem? (yes or no)");
		answer = keyboard.nextLine();
		while (!(answer.equalsIgnoreCase("yes"))) {
			if (answer.equalsIgnoreCase("no")) {
				System.out.println("Reboot the router and try to connect");
				System.out.println("Did that fix the problem? (yes or no)");
				answer = keyboard.nextLine();
				while (!(answer.equalsIgnoreCase("yes"))) {
					if (answer.equalsIgnoreCase("no")) {
						System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
						System.out.println("Did that fix the problem? (yes or no)");
						answer = keyboard.nextLine();
						while (!(answer.equalsIgnoreCase("yes"))) {
							if (answer.equalsIgnoreCase("no")) {
								System.out.println("Move the computer closer to the router and try to connect");
								System.out.println("Did that fix the problem? (yes or no)");
								answer = keyboard.nextLine();
								if (answer.equalsIgnoreCase("no")) {
									System.out.println("Contact your ISP");
									System.out.println("Linh Tran");
									break;
								} else {
									System.out.println("Invalid answer; please try again"); 
									System.out.println("Did that fix the problem? (yes or no)");
									answer = keyboard.nextLine();
									if (answer.equalsIgnoreCase("no")) {
										System.out.println("Contact your ISP");
										System.out.println("Linh Tran");
										break;
									}
								}
								break;
							} else {
								System.out.println("Invalid answer; please try again");
								System.out.println("Did that fix the problem? (yes or no)");
								answer = keyboard.nextLine();
							}
						}
						break;
					} else {
						System.out.println("Invalid answer; please try again");
						System.out.println("Did that fix the problem? (yes or no)");
						answer = keyboard.nextLine();
					}
				}
				break;
			} else {
				System.out.println("Invalid answer; please try again");
				System.out.println("Did that fix the problem? (yes or no)");
				answer = keyboard.nextLine();
			}
		}
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Done");
			System.out.println("Linh Tran");
		} 
		keyboard.close();

	}

}
