// Concrete Observer implementation
public class AnalyticsBot implements Observer{
    // Override method for updating
    @Override
    public void update(String videoTitle) {
        System.out.println("AnalyticsBot recorded video: " + videoTitle);
    }
}
