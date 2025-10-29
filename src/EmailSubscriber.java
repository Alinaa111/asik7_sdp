// Concrete Observer implementation
public class EmailSubscriber implements Observer {
    // Subscriber's attribute
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    // Override method for updating
    @Override
    public void update(String videoTitle) {
        System.out.println("Email subscribed to " + email + ". New video: " + videoTitle);
    }
}
