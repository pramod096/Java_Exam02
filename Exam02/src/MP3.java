
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class MP3 implements MediaPlayer {

    
    @Override
    public void play() {
        System.out.println("MP3 starts playing song");
    }

    @Override
    public void pause() {
        System.out.println("Player Paused");
    }

    @Override
    public void shuffle() {
        System.out.println("Songs Shuffled");
    }

    @Override
    public void delete() {
        System.out.println("Current Song Deleted");
    }

}
