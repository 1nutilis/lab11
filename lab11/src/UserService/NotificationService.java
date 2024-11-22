package UserService;

public class NotificationService implements INotificationService {
    @Override
    public void sendNotification(int userId, String message) {
        System.out.println("Notification to user " + userId + ": " + message);
    }
}
