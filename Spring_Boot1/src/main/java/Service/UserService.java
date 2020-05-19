package Service;

import Model.User;

import java.util.Optional;

public interface UserService {
//    void addUser(String name, String surname);

    void removeUser(long Id);

    String addUser(long id, String name, String surname);

    Optional<User> getUser(long Id);
}
