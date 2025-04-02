import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Library library;
    private List<LibraryResource> borrowedResources = new ArrayList<>();

    public Student(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public void borrowResource(String title) {
        if (library.hasResource(title)) {
            LibraryResource resource = library.getResource(title);
            borrowedResources.add(resource);
            System.out.println(name + " borrowed: " + title);
        } else {
            System.out.println(title + " is not available in the library.");
        }
    }

    public void returnResource(String title) {
        borrowedResources.removeIf(resource -> {
            boolean toRemove = resource.getTitle().equals(title);
            if (toRemove) {
                System.out.println(name + " returned: " + title);
            }
            return toRemove;
        });
    }

    public void listBorrowedResources() {
        System.out.println(name + " has borrowed:");
        for (LibraryResource resource : borrowedResources) {
            System.out.println("- " + resource.getTitle());
        }
    }
}
