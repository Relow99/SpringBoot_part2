package Service;

import Model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceImplTest {
    @LocalServerPort
    private int port;

    @Autowired
    public TestRestTemplate template;
    private URL baseURL;
    @Test
    public void shouldAuthenticate()throws Exception {
        ResponseEntity<String> response = template.withBasicAuth("Relow", "Relow9096").getForEntity(baseURL.toString(), String.class);
    }
    @BeforeEach
        public void urlLink ()  {
        try {
            this.baseURL = new URL("http:" + port);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    @Autowired
    public UserService userService;

    UserServiceImplTest(int port) {
        this.port = port;
    }
    @Test
    String addUser() {
        String name = userService.addUser(20,"Relow","Malepa");
        assertEquals("Relow", name);
        return name;
    }
    @Test
    void getUser() {
        Optional<User> name1 = userService.getUser(1);
        Optional<User> name2 = userService.getUser(2);
        Optional<User> name3 = userService.getUser(3);
        Optional<User> name4 = userService.getUser(4);
        System.out.println(name1 + " " + name2 + " " + name3 + " " + name4);
    }

    @Test
    void removeUser() {

    }
}