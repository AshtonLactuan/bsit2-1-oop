import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagement = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagement);

        System.out.println("═══ Social Media Post Manager ═══");
        System.out.println();
        manager.displayPostStats(postTitle, engagement);
        System.out.println("Category: " + category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Advanced Java Tutorial", "Spring Boot Guide", "Basic Java"));
        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Advanced Java Tutorial", 800);
        engagements.put("Spring Boot Guide", 650);
        engagements.put("Basic Java", 300);

        LinkedList<String> trending = manager.findTrendingPosts(posts, engagements);
        System.out.println("Trending Posts: " + trending);

        HashSet<String> authors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + authors);
    }
}

