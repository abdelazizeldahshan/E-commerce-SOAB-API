package repo.daos.interfaces;

import java.util.List;

import repo.entities.AdminEntity;

public interface AdminDaoInt {

    List<AdminEntity> getAdmins();

    AdminEntity getAdminById(int id);

    boolean addAdmin(AdminEntity adminEntity);

    boolean updateAdmin(AdminEntity adminEntity);

    boolean deleteAdmin(int id);
}
