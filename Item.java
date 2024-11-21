
package problemjpaapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item_Table")
public class Item {
	@Id
	private int itemId;
	private String itemName;
	private float price;
	private int quantity;
	private boolean isAvailableInStock;
	
	
	public Item() {
		super();
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isAvailableInStock() {
		return isAvailableInStock;
	}
	public void setAvailableInStock(boolean isAvailableInStock) {
		this.isAvailableInStock = isAvailableInStock;
	}
}
 

