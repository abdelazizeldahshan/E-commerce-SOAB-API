package service.interfaces;

import java.util.List;

import models.admin.Admin;
import models.admin.AdminPost;

public interface AdminServiceInt {

    List<Admin> getAdmins();

    Admin getAdminById(int id);

    boolean addAdmin(AdminPost admin);

    boolean updateAdmin(Admin admin);

    boolean deleteAdmin(int id);
}
