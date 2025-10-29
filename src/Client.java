// Client Usage
public class Client {
    public static void main(String[] args) {
        YouTubeChannel youtubeChannel = new YouTubeChannel();

        Observer alina = new YouTubeSubscriber("Alina");
        Observer sanzhar = new YouTubeSubscriber("Sanzhar");

        // Registering observers
        youtubeChannel.addObserver(alina);
        youtubeChannel.addObserver(sanzhar);

        // Simulating youTube channel changing
        youtubeChannel.uploadVideo("Top 10 respect moments in football");

        // Removing one observer
        youtubeChannel.removeObserver(alina);
        youtubeChannel.uploadVideo("How to make a pizza in 15 minutes");
    }
}