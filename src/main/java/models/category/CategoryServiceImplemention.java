package models.category;

import java.util.List;

import jakarta.jws.WebService;
import service.implementations.CategoryServiceImpl;
import service.interfaces.CategoryServiceInt;

@WebService(endpointInterface = "models.category.CategoryServiceInterface")
public class CategoryServiceImplemention implements CategoryServiceInterface {

    CategoryServiceInt categoryService = new CategoryServiceImpl();

    @Override
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryService.getCategpryById(id);
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryService.getCategoryByName(name);
    }

    @Override
    public boolean addCategory(Category category) {
        return categoryService.addCategory(category);
    }

    @Override
    public boolean updateCategory(Category category) {
        return categoryService.updateCategory(category);
    }

    @Override
    public boolean deleteCategory(int id) {
        return categoryService.deleteCategory(id);
    }

}
