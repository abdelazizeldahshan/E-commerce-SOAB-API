package models.category;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CategoryServiceInterface {

    @WebMethod
    List<Category> getCategories();

    @WebMethod
    Category getCategoryById(int id);

    @WebMethod
    Category getCategoryByName(String name);

    @WebMethod
    boolean addCategory(Category category);

    @WebMethod
    boolean updateCategory(Category category);

    @WebMethod
    boolean deleteCategory(int id);
}
