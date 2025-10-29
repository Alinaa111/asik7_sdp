// Concrete Observer implementation
public class RegularSubscriber implements Observer {
    // Subscriber's attribute
    private String name;

    public RegularSubscriber(String name) {
        this.name = name;
    }

    // Override method for updating
    @Override
    public void update(String videoTitle) {
        System.out.println(name + " got notification and is watching the new video: " + videoTitle);
    }
}
