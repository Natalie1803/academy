package by.academy.classwork11;

	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;

	public class DateExample {

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {

	Date currentDate = new Date();
	System.out.println(dateFormat.format(currentDate));

	// преобразовать дату в календарь
	Calendar c = Calendar.getInstance();
	c.setTime(currentDate);

	// манипулировать датой
	c.add(Calendar.YEAR, 1);
	c.add(Calendar.MONTH, 1);
	c.add(Calendar.DATE, 1); // то же самое с c.add (Calendar.DAY_OF_MONTH, 1);
	c.add(Calendar.HOUR, 1);
	c.add(Calendar.MINUTE, 1);
	c.add(Calendar.SECOND, 1);

	// конвертируем календарь в дату
	Date currentDatePlusOne = c.getTime();

	System.out.println(dateFormat.format(currentDatePlusOne));

	}

	}

