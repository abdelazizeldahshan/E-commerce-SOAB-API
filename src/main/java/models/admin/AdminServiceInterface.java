package models.admin;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface AdminServiceInterface {

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
