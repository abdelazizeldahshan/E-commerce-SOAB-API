package service.implementations;

import java.util.ArrayList;
import java.util.List;
import models.category.Category;
import repo.daos.implemtion.CategoryDaoImpl;
import repo.daos.interfaces.CategoryDaoInt;
import repo.entities.CategoryEntity;
import service.interfaces.CategoryServiceInt;
import service.mappers.CategoryMapper;

public class CategoryServiceImpl implements CategoryServiceInt {

    CategoryDaoInt CategoryDao = new CategoryDaoImpl();
    CategoryMapper categoryMapper = new CategoryMapper();

    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        for (CategoryEntity categoryEntity : CategoryDao.getAllCategories()) {
            categories.add(categoryMapper.categoryEntityTCategory(categoryEntity));
        }
        return categories;
    }

    public Category getCategpryById(int id) {
        if (CategoryDao.getCategoryById(id) == null)
            return null;
        return categoryMapper.categoryEntityTCategory(CategoryDao.getCategoryById(id));
    }

    public Category getCategoryByName(String name) {
        return categoryMapper.categoryEntityTCategory(CategoryDao.getCateoryByName(name));
    }

    public boolean addCategory(Category category) {
        return CategoryDao.addCategory(categoryMapper.CategoryToCategoryEntity(category));
    }

    public boolean updateCategory(Category category) {
        return CategoryDao.updateCategory(categoryMapper.CategoryToCategoryEntity(category));
    }

    public boolean deleteCategory(int id) {
        return CategoryDao.deleteCategory(id);
    }
}
