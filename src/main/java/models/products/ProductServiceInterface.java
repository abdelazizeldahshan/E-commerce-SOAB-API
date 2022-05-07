package models.products;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import models.category.Category;

@WebService
public interface ProductServiceInterface {

    @WebMethod
    List<Product> getAllProducts();

    @WebMethod
    Product getProductById(int id);

    @WebMethod
    boolean deleteProduct(int id);

    @WebMethod
    boolean createProduct(ProductPostRequest productPostRequest);

    @WebMethod
    boolean editProduct(ProductPutRequest productPutRequest);

    @WebMethod
    List<Category> getAllCategory();

    @WebMethod
    Category getCategory(int id);

    @WebMethod
    List<Product> getSomeProducts(int from, int page);
}
