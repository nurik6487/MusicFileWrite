public class Song {
    private String title;
    private String autlor;
    private String text;


    public Song(String title, String autlor, String text) {
        this.title = title;
        this.autlor = autlor;
        this.text = text;
    }

    public Song() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutlor() {
        return autlor;
    }

    public void setAutlor(String autlor) {
        this.autlor = this.autlor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song: " + "\n" + text;
    }
}
