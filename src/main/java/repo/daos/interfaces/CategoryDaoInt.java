package repo.daos.interfaces;

import java.util.List;

import repo.entities.CategoryEntity;

public interface CategoryDaoInt {

    List<CategoryEntity> getAllCategories();

    CategoryEntity getCategoryById(int id);

    CategoryEntity getCateoryByName(String name);

    boolean addCategory(CategoryEntity categoryEntity);

    boolean updateCategory(CategoryEntity categoryEntity);

    boolean deleteCategory(int id);
}
