package JPAApp.problemjpaapp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import problemjpaapp.Item;
import problemjpaapp.Order;
import problemjpaapp.Sale;
import problemjpaapp.SalePerson;
import problemjpaapp.TurnOver;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	System.out.println("Hello World!");
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ItemPU");
        EntityManager manager = managerFactory.createEntityManager();
        Item item1 = new Item();
        item1.setItemId(1);
        item1.setItemName("Item 1");
        item1.setPrice(10.0f);
        item1.setQuantity(5);
        item1.setAvailableInStock(true);
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(item1);
        transaction.commit();
        Order order = new Order();
        List<Item> items = new ArrayList<>();
        items.add(item1);
        order.setItemList(items);
        order.setDateOfDelivery(new Date());
        order.setTotalAmount(item1.getPrice() * item1.getQuantity());
        order.setStatus(true);
        transaction.begin();
        manager.persist(order);
        transaction.commit();
        SalePerson salesperson = new SalePerson();
        salesperson.setPersonId(1);
        salesperson.setPersonName("zivara");
        List<Order> ordersForSalesperson = new ArrayList<>();
        ordersForSalesperson.add(order); 
        salesperson.setOrderList(ordersForSalesperson);
        transaction.begin();
        manager.persist(salesperson);
        transaction.commit();
        Sale sale = new Sale();
        List<SalePerson> salespersons = new ArrayList<>();
        salespersons.add(salesperson); 
        sale.setSalespersonList(salespersons);
        sale.setTotalSales(order.getTotalAmount());
        transaction.begin();
        manager.persist(sale);
        transaction.commit();
        TurnOver turnover = new TurnOver();
        turnover.setYear(2024); 
        List<Sale> salesList = new ArrayList<>();
        salesList.add(sale);
        turnover.setSalesList(salesList);
        transaction.begin();
        manager.persist(turnover);
        transaction.commit();
       manager.close();
       managerFactory.close();
       System.out.println(item1.getItemName());
       System.out.println(order.getOrderId());
       System.out.println(salesperson.getPersonName());
       System.out.println(sale.getSaleId());
       System.out.println(turnover.getYear());
    }
}