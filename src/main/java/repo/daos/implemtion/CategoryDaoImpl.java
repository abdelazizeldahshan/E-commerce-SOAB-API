package repo.daos.implemtion;

import java.util.List;

import repo.daos.interfaces.CategoryDaoInt;
import repo.entities.CategoryEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class CategoryDaoImpl implements CategoryDaoInt {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public List<CategoryEntity> getAllCategories() {
        TypedQuery<CategoryEntity> categories = entityManager.createQuery("from CategoryEntity", CategoryEntity.class);
        return categories.getResultList();
    }

    public CategoryEntity getCategoryById(int id) {
        CategoryEntity categoryEntity = entityManager.find(CategoryEntity.class, id);
        if (categoryEntity == null)
            return null;
        return categoryEntity;
    }

    public CategoryEntity getCateoryByName(String name) {
        TypedQuery<CategoryEntity> category = entityManager
                .createQuery("from CategoryEntity category where category.value like:value", CategoryEntity.class)
                .setParameter("value", name);
        return category.getResultList().get(0);
    }

    public boolean addCategory(CategoryEntity categoryEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(categoryEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    public boolean updateCategory(CategoryEntity categoryEntity) {
        entityManager.getTransaction().begin();
        entityManager.merge(categoryEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    public boolean deleteCategory(int id) {
        CategoryEntity categoryEntity = getCategoryById(id);
        entityManager.getTransaction().begin();
        entityManager.remove(categoryEntity);
        entityManager.getTransaction().commit();
        return true;
    }
}
