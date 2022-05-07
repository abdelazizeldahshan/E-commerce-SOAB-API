package service.implementations;

import java.util.ArrayList;
import java.util.List;

import models.products.Product;
import models.products.ProductPostRequest;
import models.products.ProductPutRequest;
import repo.daos.implemtion.ProductDaoImpl;
import repo.daos.interfaces.ProductDaoInt;
import repo.entities.ProductEntity;
import service.interfaces.ProductServiceInt;
import service.mappers.ProductMapper;

public class ProductServiceImpl implements ProductServiceInt {

    ProductDaoInt productDao = new ProductDaoImpl();
    ProductMapper productMapper = new ProductMapper();

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (ProductEntity entity : productDao.getProducts()) {
            products.add(productMapper.ProductEntityToProduct(entity));
        }
        return products;
    }

    public Product getProductByID(int id) {
        return productMapper.ProductEntityToProduct(productDao.getProductById(id));
    }

    public boolean addProduct(ProductPostRequest productPostRequest) {
        productDao.addProduct(productMapper.productPostRequestToProductEntity(productPostRequest),
                productPostRequest.getClerkName(), productPostRequest.getCategoryname());
        return true;
    }

    public boolean deleteProduct(int id) {
        productDao.deleteProduct(id);
        return true;
    }

    public boolean updateProduct(ProductPutRequest productPutRequest) {
        productDao.updateProduct(productMapper.productPutRequestToProductEntity(productPutRequest));
        return true;
    }
}
