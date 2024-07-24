public class Song {
    private String artist;
    private String title;
    private int year;

    public Song(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Not the same class
        }
        Song otherSong = (Song) obj; // Cast to Song
        return this.year == otherSong.year &&
               this.artist.equals(otherSong.artist) &&
               this.title.equals(otherSong.title);
    }

    @Override
    public int hashCode() {
        // Optional but recommended for consistency with equals method
        int result = artist.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + year;
        return result;
    }
}
