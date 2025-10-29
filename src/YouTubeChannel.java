// Concrete Subject implementation
import java.util.ArrayList;

public class YouTubeChannel implements Subject{
    // Creating list of subscribers
    private ArrayList<Observer> observers = new ArrayList<>();
    private String lastUploadedVideo;

    // Override methods for managing subscribers with specific context
    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
        System.out.println("New observer added");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(lastUploadedVideo);
        }
    }

    // Method for uploading video and notifying subscribers
    public void uploadVideo(String videoTitle){
        this.lastUploadedVideo = videoTitle;
        System.out.println("Uploading video: " + videoTitle);
        notifyObservers();
    }
}
