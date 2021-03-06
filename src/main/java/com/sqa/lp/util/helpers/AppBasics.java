/**
 *   File Name: AppBasics.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.sqa.lp.util.helpers;

import java.util.Scanner;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AppBasics {

	public static void farewellUser(String userName, String appName) {
		System.out.println("Thank you " + userName + ", for using the " + appName + " Application. Have a great day!");
	}

	public static String welcomeUserAndGetUserName(String appName) {
		String userName;
		System.out.println("Welcome to the " + appName + " Application");
		userName = RequestInput.getString("Could I get your name please?");
		return userName;
	}

	Scanner scanner = new Scanner(System.in);

}
