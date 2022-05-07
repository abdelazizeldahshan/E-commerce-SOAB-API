package services;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import models.admin.Admin;
import models.admin.AdminPost;

@WebService
public interface AdminInt {

    @WebMethod
    List<Admin> getAdmins();

    @WebMethod
    Admin getAdminById(int id);

    @WebMethod
    boolean addAdmin(AdminPost admin);

    @WebMethod
    boolean updateAdmin(Admin admin);

    @WebMethod
    boolean deleteAdmin(int id);
}
