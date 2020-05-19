package Service;

import Model.User;

import java.util.Optional;

public interface FakeRepoInterface {
    void insertUser(long id, String name, String surname);

     Optional<User> findUserById(long id);

     void deleteUser(long id);
}
