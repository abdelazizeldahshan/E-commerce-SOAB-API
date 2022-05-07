package service.interfaces;

import java.util.List;

import models.order.OrderPostRequest;
import models.order.Oredr;

public interface OrderServiceInt {

    List<Oredr> getAllOredrs();

    Oredr getOrderById(int id);

    boolean addOrder(OrderPostRequest orderPostRequest);
}
