package problemjpaapp;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Sales_Table")
public class Sale {
    @Id
    private int saleId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_id") 
    private List<SalePerson> salespersonList;

    private float totalSales;

    public Sale() {
        super();
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public List<SalePerson> getSalespersonList() {
        return salespersonList;
    }

    public void setSalespersonList(List<SalePerson> salespersonList) {
        this.salespersonList = salespersonList;
    }

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }
}