package problemjpaapp;
import javax.persistence.*;
import java.util.List; 
@Entity
@Table(name = "TurnOver_Table")
public class TurnOver {
    @Id
    private int year;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Sale> salesList;
 
    public TurnOver() {
        super();
    }
 
    public int getYear() {
        return year;
    }
 
    public void setYear(int year) {
        this.year = year;
    }
 
    public List<Sale> getSalesList() {
        return salesList;
    }
 
    public void setSalesList(List<Sale> salesList) {
        this.salesList = salesList;
    }
}
