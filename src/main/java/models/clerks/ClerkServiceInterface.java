package models.clerks;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ClerkServiceInterface {

    @WebMethod
    List<Clerk> getClerks();

    @WebMethod
    Clerk getClerkById(int id);

    @WebMethod
    Clerk getClerkByName(String name);

    @WebMethod
    boolean addClerk(ClerkPost clerkPost);

    @WebMethod
    boolean updateClerk(Clerk clerk);

    @WebMethod
    boolean deleteClerk(int id);
}
