package service.implementations;

import java.util.ArrayList;
import java.util.List;

import models.admin.Admin;
import models.admin.AdminPost;
import repo.daos.implemtion.AdminDaoImpl;
import repo.daos.interfaces.AdminDaoInt;
import repo.entities.AdminEntity;
import service.interfaces.AdminServiceInt;
import service.mappers.AdminMapper;

public class AdminServiceImpl implements AdminServiceInt {

    AdminMapper adminMapper = new AdminMapper();
    AdminDaoInt adminDao = new AdminDaoImpl();

    public List<Admin> getAdmins() {
        List<Admin> admins = new ArrayList<>();
        for (AdminEntity admin : adminDao.getAdmins()) {
            admins.add(adminMapper.AdminEntityToAdmin(admin));
        }
        return admins;
    }

    public Admin getAdminById(int id) {
        if (adminDao.getAdminById(id) == null)
            return null;
        return adminMapper.AdminEntityToAdmin(adminDao.getAdminById(id));
    }

    public boolean addAdmin(AdminPost admin) {
        return adminDao.addAdmin(adminMapper.AdminPostRequestToAdminEntity(admin));
    }

    public boolean updateAdmin(Admin admin) {
        return adminDao.updateAdmin(adminMapper.AdminToAdminEntity(admin));
    }

    public boolean deleteAdmin(int id) {
        return adminDao.deleteAdmin(id);
    }

}
