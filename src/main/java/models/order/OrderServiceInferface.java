package models.order;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface OrderServiceInferface {

    @WebMethod
    List<Oredr> getOrders();

    @WebMethod
    Oredr getOrderById(int id);

    @WebMethod
    boolean addOrder(OrderPostRequest orderPostRequest);
}
