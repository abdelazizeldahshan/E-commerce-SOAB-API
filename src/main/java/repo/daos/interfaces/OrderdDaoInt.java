package repo.daos.interfaces;

import java.util.List;

import repo.entities.OrderEntity;

public interface OrderdDaoInt {

    List<OrderEntity> getOrders();

    OrderEntity getOrderById(int id);

    OrderEntity addOrder(OrderEntity orderEntity, int CustomerId, double totalPrice);

    boolean updateOrder(OrderEntity orderEntity);

    boolean deleteOrder(int id);

    boolean addProductToOrder(OrderEntity orderEntity, int quantity, int productId);
}
