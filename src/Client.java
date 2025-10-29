// Client Usage
public class Client {
    public static void main(String[] args) {
        YouTubeChannel youtubeChannel = new YouTubeChannel();

        Observer alina = new RegularSubscriber("Alina");
        Observer email = new EmailSubscriber("sanzhar@gmail.com");
        Observer bot = new AnalyticsBot();

        // Registering observers
        youtubeChannel.addObserver(alina);
        youtubeChannel.addObserver(email);
        youtubeChannel.addObserver(bot);

        // Simulating youTube channel changing
        youtubeChannel.uploadVideo("Top 10 respect moments in football");

        // Removing one observer
        youtubeChannel.removeObserver(alina);
        youtubeChannel.uploadVideo("How to make a pizza in 15 minutes");
    }
}