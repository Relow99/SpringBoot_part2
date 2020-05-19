     package Service;

   import Model.User;
   import org.springframework.beans.factory.annotation.Autowired;
   import org.springframework.cache.annotation.Cacheable;
   import org.springframework.stereotype.Service;

   import java.util.Optional;

     @Service
public class UserServiceImpl implements UserService {

    @Autowired
    FakeRepoInterface fakeRepoInterface;

     @Override
    public String addUser(long id, String name, String surname) {
        fakeRepoInterface.insertUser(id, name,surname);
         return name;
     }
    @Override
    @Cacheable("Name")
    public Optional<User> getUser(long id) {
        fakeRepoInterface.findUserById(id);
   try
       {
           System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
           Thread.sleep(1000*5);
       }
catch (InterruptedException e)
       {
           e.printStackTrace();
       }

    return fakeRepoInterface.findUserById(id);
   }
    @Override
    public void removeUser(long id) {
        fakeRepoInterface.deleteUser(id);
        System.out.println(fakeRepoInterface.findUserById(id) + " removed");
    }

}
