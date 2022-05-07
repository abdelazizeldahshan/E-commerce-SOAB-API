// import Entities.UserEntity;
// import jakarta.persistence.EntityManager;
// import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.Persistence;

// public class App {
//     public static void main(String[] args) {
//         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bank");
//         EntityManager entityManager = entityManagerFactory.createEntityManager();
//         UserEntity userEntity1;
//         UserEntity userEntity = new UserEntity();
//         userEntity.setUsername("abdelaziz");
//         userEntity.setPassword("1234");
//         userEntity.setExpireDate("2022-1-4");
//         userEntity.setEmail("zizo@gmail.com");
//         userEntity.setCardNumber("187467654378568374");
//         userEntity.setCardName("visa");
//         userEntity.setBalance(10034.8757);

//         entityManager.getTransaction().begin();
//         // entityManager.persist(userEntity);

//         userEntity1=entityManager.find(UserEntity.class,4);
//         entityManager.getTransaction().commit();
//         entityManager.close();

//         System.out.println(userEntity1.toString());

//     }
// }
