package UserService;

public interface IUserService {
    void register(String username, String password);
    void login(String username, String password);
}

