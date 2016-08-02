package br.edu.ufal.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.edu.ufal.view.Screen;

public class ValidationDate {

	static public boolean validateDateOfBirth(String birth) {
		boolean bool = false;

		Calendar currentDate = new GregorianCalendar();
		Calendar dtBirth = Calendar.getInstance();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		dtBirth.setLenient(false);

		try {
			dtBirth.setTime(dateFormat.parse(birth));

			if (validateValuesDate(birth)) {

				if (dtBirth.after(currentDate))
					bool = false;
				else
					bool = true;
			} else {
				bool = false;
			}

		} catch (ParseException ex) {

			Screen.invalidDateError();
			bool = false;
		}

		return bool;
	}

	static public boolean validateSimpleDate(String date) {
		boolean bool = false;

		Calendar dt = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		dt.setLenient(false);

		try {

			dt.setTime(dateFormat.parse(date));

			if (validateValuesDate(date))
				bool = true;
			else
				bool = false;

		} catch (ParseException ex) {

			Screen.invalidDateError();
			bool = false;
		}

		return bool;
	}

	static public boolean validateBeginEnd(String begin, String end) {
		boolean bool = false;

		Calendar b = Calendar.getInstance();
		Calendar e = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		b.setLenient(false);
		e.setLenient(false);

		try {

			b.setTime(dateFormat.parse(begin));
			e.setTime(dateFormat.parse(end));

			if (validateValuesDate(begin)) {

				if (b.after(e))
					bool = false;
				else
					bool = true;
			} else
				bool = false;

		} catch (ParseException ex) {
			
			Screen.invalidDateError();
			bool = false;
		}

		return bool;
	}

	static private boolean validateValuesDate(String date) {

		GregorianCalendar calendar = new GregorianCalendar();
		int dia = 0, mes = 0, ano = 0;
		String diaStr = date.substring(0, 2);
		String mesStr = date.substring(3, 5);
		String anoStr = date.substring(6, 10);

		try {
			dia = Integer.parseInt(diaStr);
			mes = Integer.parseInt(mesStr);
			ano = Integer.parseInt(anoStr);
		} catch (Exception e) {
			return false;
		}

		if (dia < 1 || mes < 1 || ano < 1) {
			return false;

		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

			if (dia > 31)
				return false;

		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

			if (dia > 30)
				return false;

		} else if (mes == 2) {

			if (calendar.isLeapYear(ano)) {

				if (dia <= 29)
					return false;

			} else if (dia > 28)
				return false;

		} else
			return false;

		return true;
	}
}
