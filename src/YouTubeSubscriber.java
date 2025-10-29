// Concrete Observer implementation
public class YouTubeSubscriber implements Observer {
    // Subscriber's attribute
    private String name;

    public YouTubeSubscriber(String name) {
        this.name = name;
    }

    // Override method for updating
    @Override
    public void update(String videoTitle) {
        System.out.println(name + " is watching the new video: " + videoTitle);
    }
}
