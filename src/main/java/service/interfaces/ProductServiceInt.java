package service.interfaces;

import java.util.List;

import models.products.Product;
import models.products.ProductPostRequest;
import models.products.ProductPutRequest;

public interface ProductServiceInt {

    List<Product> getProducts();

    Product getProductByID(int id);

    boolean addProduct(ProductPostRequest productPostRequest);

    boolean deleteProduct(int id);

    boolean updateProduct(ProductPutRequest productPutRequest);
}
