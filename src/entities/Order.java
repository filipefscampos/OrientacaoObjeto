package entities;

import java.util.Date;

public class Order {

	private Integer id;
	private Date momentoPedido;
	private OrderStatus status;
	
	public Order() {
		
	}

	public Order(Integer id, Date momentoPedido, OrderStatus status) {
		super();
		this.id = id;
		this.momentoPedido = momentoPedido;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Date momentoPedido) {
		this.momentoPedido = momentoPedido;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", momentoPedido=" + momentoPedido + ", status=" + status + "]";
	}
	
	
	
}
