package hello;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @author femachado
 * 
 */
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Min(0)
	private Integer amount;
	
	private BigDecimal price;
	
	private String name;
	
	public Product(String name, Integer amount, Double price) {
		this.amount = amount;
		this.name = name;
		this.price =  new BigDecimal(price).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	public Integer getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = new BigDecimal(price).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", amount=" + amount + ", price=" + price + "]";
	}
}
