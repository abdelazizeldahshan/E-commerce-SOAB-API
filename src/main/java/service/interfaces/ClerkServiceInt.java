package service.interfaces;

import java.util.List;

import models.clerks.Clerk;
import models.clerks.ClerkPost;

public interface ClerkServiceInt {

    List<Clerk> getClerks();

    Clerk getClerkById(int id);

    Clerk getClerkByName(String name);

    boolean addClerk(ClerkPost clerkPost);

    boolean updateClerk(Clerk clerk);

    boolean deleteClerk(int id);

}
