package com.hackerearth.october;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelpingPeople {

	public static void main(String[] args) {

		System.out.println("input");

		Scanner s = new Scanner(System.in);
		String tag = s.nextLine();

		Pattern p = Pattern.compile("([1-9]{2})[^A|E|I|O|U|Y]([1-9]{3})-([1-9]{2})");
		Matcher m = p.matcher(tag);

		boolean check_tag = true;
		while (m.find()) {

			for (int i = 1; i <= m.groupCount(); i++) {
				if (checkHundred(m.group(i))) {
					if (!checkEvenpair(m.group(i))) {
						check_tag = false;
						break;
					}
				} else {
					if (!checkEvenforTens(m.group(i))) {
						check_tag = false;
						break;
					}
				}

			}
		}
		if (!m.matches())
			check_tag = false;
		if (check_tag) {
			System.out.println("valid");
		} else
			System.out.println("invalid");

	}

	private static boolean checkHundred(String number) {
		int num = Integer.parseInt(number);
		int hundred = num / 100;
		if (hundred > 0)
			return true;
		else
			return false;
	}

	private static boolean checkEvenforTens(String number) {
		int num = Integer.parseInt(number);
		int tens = num / 10;
		int units = num - (tens * 10);
		int sum = tens + units;
		if (sum % 2 == 0)
			return true;
		else
			return false;
	}

	private static boolean checkEvenpair(String number) {
		int num = Integer.parseInt(number);
		int hundred = num / 100;
		int remainder = num - (hundred * 100);
		int tens = remainder / 10;
		int units = remainder - (tens * 10);
		int firstsum = hundred + tens;
		int secondsum = tens + units;
		if (firstsum % 2 == 0 && secondsum % 2 == 0)
			return true;
		else
			return false;

	}
}
