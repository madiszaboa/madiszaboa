public class UrlFixer {
    /* public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    System.out.println(url);
  }
}*/
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds"); url = url.replace("s/", "s:/");

        url = url.replaceFirst("bots", "odds"); url = url.replaceFirst("s/", "s:/");

        System.out.println(url);


    }
}
