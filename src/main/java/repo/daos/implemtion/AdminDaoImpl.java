package repo.daos.implemtion;

import java.util.List;

import repo.daos.interfaces.AdminDaoInt;
import repo.entities.AdminEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.TypedQuery;

public class AdminDaoImpl implements AdminDaoInt {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public List<AdminEntity> getAdmins() {
        TypedQuery<AdminEntity> admins = entityManager.createQuery("from AdminEntity", AdminEntity.class);
        return admins.getResultList();
    }

    public AdminEntity getAdminById(int id) {
        AdminEntity adminEntity = entityManager.find(AdminEntity.class, id);
        if (adminEntity == null)
            return null;
        return adminEntity;
    }

    public boolean addAdmin(AdminEntity adminEntity) {
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(adminEntity);
        } catch (PersistenceException e) {
            // throw new AddUserException("This Email exist before");
        }
        entityManager.getTransaction().commit();
        return true;
    }

    public boolean updateAdmin(AdminEntity adminEntity) {
        entityManager.getTransaction().begin();
        entityManager.merge(adminEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    public boolean deleteAdmin(int id) {
        AdminEntity adminEntity = getAdminById(id);
        // if (adminEntity == null)
        //     throw new NotFoundException("Not Found admin with this id to delete");
        entityManager.getTransaction().begin();
        entityManager.remove(adminEntity);
        entityManager.getTransaction().commit();
        return true;
    }
}
