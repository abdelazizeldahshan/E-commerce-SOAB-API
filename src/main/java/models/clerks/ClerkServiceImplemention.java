package models.clerks;

import java.util.List;

import jakarta.jws.WebService;
import service.implementations.ClerkServiceImpl;
import service.interfaces.ClerkServiceInt;

@WebService(endpointInterface = "models.clerks.ClerkServiceInterface")
public class ClerkServiceImplemention implements ClerkServiceInterface {

    ClerkServiceInt clerkService = new ClerkServiceImpl();

    @Override
    public List<Clerk> getClerks() {
        return clerkService.getClerks();
    }

    @Override
    public Clerk getClerkById(int id) {
        return clerkService.getClerkById(id);
    }

    @Override
    public Clerk getClerkByName(String name) {
        return clerkService.getClerkByName(name);
    }

    @Override
    public boolean addClerk(ClerkPost clerkPost) {
        return clerkService.addClerk(clerkPost);
    }

    @Override
    public boolean updateClerk(Clerk clerk) {
        return clerkService.updateClerk(clerk);
    }

    @Override
    public boolean deleteClerk(int id) {
        return clerkService.deleteClerk(id);
    }

}
