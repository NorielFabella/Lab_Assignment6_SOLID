public class Thesis implements LibraryResource {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
