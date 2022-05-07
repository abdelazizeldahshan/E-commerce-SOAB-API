package services;

import java.util.List;

import jakarta.jws.WebService;
import models.admin.Admin;
import models.admin.AdminPost;
import service.implementations.AdminServiceImpl;
import service.interfaces.AdminServiceInt;

@WebService(endpointInterface = "services.AdminInt")
public class AdminImpl implements AdminInt {

    AdminServiceInt adminServiceInt = new AdminServiceImpl();

    @Override
    public List<Admin> getAdmins() {
        return null;
    }

    @Override
    public Admin getAdminById(int id) {
        return null;
    }

    @Override
    public boolean addAdmin(AdminPost admin) {
        return false;
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return false;
    }

    @Override
    public boolean deleteAdmin(int id) {
        return false;
    }
}
