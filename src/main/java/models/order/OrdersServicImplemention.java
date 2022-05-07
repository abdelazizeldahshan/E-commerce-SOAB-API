package models.order;

import java.util.List;

import jakarta.jws.WebService;
import service.implementations.OrderServiceImpl;
import service.interfaces.OrderServiceInt;

@WebService(endpointInterface = "models.order.OrderServiceInferface")
public class OrdersServicImplemention implements OrderServiceInferface {

    OrderServiceInt orderService = new OrderServiceImpl();

    @Override
    public List<Oredr> getOrders() {
        return orderService.getAllOredrs();
    }

    @Override
    public Oredr getOrderById(int id) {
        return orderService.getOrderById(id);
    }

    @Override
    public boolean addOrder(OrderPostRequest orderPostRequest) {
        return orderService.addOrder(orderPostRequest);
    }

}
