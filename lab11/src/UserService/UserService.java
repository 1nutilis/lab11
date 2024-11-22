package UserService;

public class UserService implements IUserService {
    @Override
    public void register(String username, String password) {
        System.out.println("User registered: " + username);
    }

    @Override
    public void login(String username, String password) {
        System.out.println("User logged in: " + username);
    }
}