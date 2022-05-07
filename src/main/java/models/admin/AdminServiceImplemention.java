package models.admin;

import java.util.List;

import jakarta.jws.WebService;
import service.implementations.AdminServiceImpl;
import service.interfaces.AdminServiceInt;

@WebService(endpointInterface = "models.admin.AdminServiceInterface")
public class AdminServiceImplemention implements AdminServiceInterface {

    AdminServiceInt adminService = new AdminServiceImpl();

    @Override
    public List<Admin> getAdmins() {
        return adminService.getAdmins();
    }

    @Override
    public Admin getAdminById(int id) {
        return adminService.getAdminById(id);
    }

    @Override
    public boolean addAdmin(AdminPost admin) {
        return adminService.addAdmin(admin);
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return adminService.updateAdmin(admin);
    }

    @Override
    public boolean deleteAdmin(int id) {
        return adminService.deleteAdmin(id);
    }
}
