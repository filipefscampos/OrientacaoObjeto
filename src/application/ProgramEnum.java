package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Instanciando o objeto tipo Order já com os construtores 
		//E passando um Enum
		Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(order);
		
		//Podemos converter uma String em Enum (A exemplo de entrada de usuario);
		//Usando o valueOF do Enum;
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
		
		sc.close();		
	}

}
