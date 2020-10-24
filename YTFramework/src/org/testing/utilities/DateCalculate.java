package org.testing.utilities;

import java.text.DateFormat;
import java.util.Date;

public class DateCalculate {


	public static String calculate_date() {

		DateFormat df = DateFormat.getDateInstance();
		Date d = new Date();
		String s = df.format(d);
		return s;

	}

}
