package models.products;

import java.util.Set;

import models.category.Category;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    private int id;
    private String productName;
    private String productDesc;
    private int quntity;
    private double price;
    private Set<Category> Categories;
    private String clerkName;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    public Set<Category> getCategories() {
        return Categories;
    }

    public void setCategories(Set<Category> categories) {
        Categories = categories;
    }

    @Override
    public String toString() {
        return "Product [Categories=" + Categories + ", clerkName=" + clerkName + ", id=" + id + ", price=" + price
                + ", productDesc=" + productDesc + ", productName=" + productName + ", quntity=" + quntity + "]";
    }

}
