package models.products;

import java.util.ArrayList;
import java.util.List;

import jakarta.jws.WebService;
import models.category.Category;
import service.implementations.ProductServiceImpl;
import service.interfaces.ProductServiceInt;

@WebService(endpointInterface = "models.products.ProductServiceInterface")
public class ProductServiceImplemention implements ProductServiceInterface {

    ProductServiceInt productService = new ProductServiceImpl();

    @Override
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @Override
    public Product getProductById(int id) {
        return productService.getProductByID(id);
    }

    @Override
    public boolean deleteProduct(int id) {
        return productService.deleteProduct(id);
    }

    @Override
    public boolean createProduct(ProductPostRequest productPostRequest) {
        return productService.addProduct(productPostRequest);
    }

    @Override
    public boolean editProduct(ProductPutRequest productPutRequest) {
        return productService.updateProduct(productPutRequest);
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> categories = new ArrayList<>();
        for (Product product : productService.getProducts()) {
            for (Category category : product.getCategories()) {
                categories.add(category);
            }
        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        for (Product product : productService.getProducts()) {
            for (Category category : product.getCategories()) {
                if (category.getId() == id) {
                    return category;
                }
            }
        }
        return null;
    }

    @Override
    public List<Product> getSomeProducts(int from, int page) {
        return productService.getProducts().subList(from, page);
    }

}
