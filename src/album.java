import javax.swing.*;

/* By: Faun Schutz
 * Song.java
 * Start:
 *
 */
public class album{
    private String name;
    private Song[] tracks;
    private String Producer;
    private int releaseYear;

    album(String name, Song[] tracks, String producer, int releaseYear){
        setName(name);
        setSong(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String toString(){
        return "Name: " + getName() + "   Tracks: " + getTracks() +
               "   Producer: " + getProducer() + "   Release Year: " + getReleaseYear();
    }
    public void setName(String name) {
        if(name.equals(""))
            name = "No name specified";
        else
            this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }
    public Song[] getTracks() {
        return tracks;
    }
    public void setProducer(String producer) {
        Producer = producer;
    }
    public String getProducer() {
        return Producer;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getNumberOfTracks(){
        return tracks.length;
    }
    public int getPlayingTime(){
        int PlayingTime = 0;
        for(int i = 0; i < tracks.length; i++){
            PlayingTime += tracks[i].getDuration();
        }
        return PlayingTime;
    }
    public void playTrack(){
        int requestedTrack = Integer.parseInt(JOptionPane.showInputDialog("Which track would you like to play"));

        if(requestedTrack > tracks.length && requestedTrack < )
    }
}
