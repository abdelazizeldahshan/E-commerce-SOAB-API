package service.implementations;

import java.util.ArrayList;
import java.util.List;

import models.clerks.Clerk;
import models.clerks.ClerkPost;
import repo.daos.implemtion.ClerkDaoImpl;
import repo.daos.interfaces.ClerkDaoInt;
import repo.entities.clerkEntity;
import service.interfaces.ClerkServiceInt;
import service.mappers.ClerkMappers;

public class ClerkServiceImpl implements ClerkServiceInt {

    ClerkDaoInt clerkDao = new ClerkDaoImpl();
    ClerkMappers clerkMappers = new ClerkMappers();

    public List<Clerk> getClerks() {
        List<Clerk> clerks = new ArrayList<>();
        for (clerkEntity clerk : clerkDao.getAllClerks()) {
            clerks.add(clerkMappers.ClerkEntityToClerk(clerk));
        }
        return clerks;
    }

    public Clerk getClerkById(int id) {
        return clerkMappers.ClerkEntityToClerk(clerkDao.getClerkById(id));
    }

    public Clerk getClerkByName(String name) {
        return clerkMappers.ClerkEntityToClerk(clerkDao.getClerkByName(name));
    }

    public boolean addClerk(ClerkPost clerkPost) {
        return clerkDao.addClerk(clerkMappers.ClerkPostToClerkEntity(clerkPost));
    }

    public boolean updateClerk(Clerk clerk) {
        return clerkDao.updateClerk(clerkMappers.ClerkToClerkEntity(clerk));
    }

    public boolean deleteClerk(int id) {
        return clerkDao.deleteClerk(id);
    }
}
