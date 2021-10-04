package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {

	public static void main(String[] args)  throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf1.format(d));
		
		//Calendar é um formato antigo de tratar data também com Java
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//Podemos adicionar uma quantidade de hora a hora original
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf1.format(d));
		
		//Podemos obeter o valor de minutos (unidade de tempo)
		int minutos = cal.get(Calendar.MINUTE);	
		System.out.println("Minutos: " + minutos);
		int mes = 1 + cal.get(Calendar.MONTH);
		System.out.println("Mes: " + mes);
		
	}
	
}
