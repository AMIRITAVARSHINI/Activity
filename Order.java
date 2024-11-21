package problemjpaapp;
import javax.persistence.*;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Order_Table")
public class Order {
    @Id
    private int orderId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Item> itemList;

    @Temporal(TemporalType.DATE)
    private Date dateOfDelivery;

    private float totalAmount;
    private boolean status;

    public Order() {
        super();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
     
      