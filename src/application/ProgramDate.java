package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramDate {
	
	public static void main(String[] args)  throws ParseException {
		
		//Definimos o formato da data em String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Criamos e recebemos a data atrav?s do PARSE do objeto formatado
		Date y1 = sdf1.parse("03/10/2021");
		Date y2 = sdf2.parse("03/10/2021 07:54:05");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//Conseguimos pegar a data/hora de hoje/agora
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 5);
		
		//Diversos tipos de sa?das
		System.out.println("---------------Sem Formata??o----------------");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("Data Atual: " + x1);
		System.out.println("Data Atual: " + x2);
		System.out.println("Horario UTC (-3): " + x3);
		System.out.println("Horario UTC (5 Manha): " + x4);
		System.out.println("Defini??o UTC com Z: " + y3);
		System.out.println("---------------Com Formata??o----------------");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " +sdf2.format(y2));
		System.out.println("Data Atual: " +sdf2.format(x1));
		System.out.println("Data Atual: " +sdf2.format(x2));
		System.out.println("Horario UTC (-3): " +sdf2.format(x3));
		System.out.println("Horario UTC (5 Manha): " +sdf2.format(x4));
		System.out.println("Defini??o UTC com Z: " +sdf2.format(y3));
		System.out.println("---------------GMT----------------");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " +sdf3.format(y2));
		System.out.println("Data Atual: " +sdf3.format(x1));
		System.out.println("Data Atual: " +sdf3.format(x2));
		System.out.println("Horario UTC (-3): " +sdf3.format(x3));
		System.out.println("Horario UTC (5 Manha): " +sdf3.format(x4));
		System.out.println("Defini??o UTC com Z: " +sdf3.format(y3));
		
		
		
	}
}
