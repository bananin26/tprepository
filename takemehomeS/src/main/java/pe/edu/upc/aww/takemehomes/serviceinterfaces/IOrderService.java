package pe.edu.upc.aww.takemehomes.serviceinterfaces;

import pe.edu.upc.aww.takemehomes.entities.Order;

import java.util.List;

public interface IOrderService {

    public void insert(Order order);
    public List<Order> list();
    public void delete(int idOrder);
    public Order listId(int idOrder);
    List<Order> findByDestinationAddress(String destinationAddress);
    public List<String[]> totalPurchasesByPerson();

}
