package tp.edu.musicstream;

public class Song {
    private String id;
    private String title;
    private String artiste;
    private String filelink;
    private double songLength;
    private int drawable;


    //create a constructor for Song Class
    public Song (String id, String title, String artiste, String filelink, double songLength, int drawable){
        this.id = id;
        this.title = title;
        this.artiste = artiste;
        this.filelink = filelink;
        this.songLength = songLength;
        this.drawable = drawable;
    }

        public String getId () { return id; }

        public void setId (String id) {this.id = id;}

        public String getTitle () { return title; }

        public void setTitle (String title) {this.title = title;}

        public String getArtiste () { return artiste; }

        public void setArtiste(String artiste) {this.artiste = artiste;}

        public String getFilelink () { return filelink; }

        public void setFilelink (String filelink) {this.filelink = filelink;}

        public double getSongLength () { return songLength;}

        public void setSongLength (double songLength) {}

        public int getDrawable () { return drawable; }

public void  setDrawable (int drawable) {this.drawable = drawable;}
}

