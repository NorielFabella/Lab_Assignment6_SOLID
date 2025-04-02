import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, LibraryResource> resources = new HashMap<>();

    public void addResource(LibraryResource resource) {
        resources.put(resource.getTitle(), resource);
    }

    public LibraryResource getResource(String title) {
        return resources.get(title);
    }

    public boolean hasResource(String title) {
        return resources.containsKey(title);
    }
}
