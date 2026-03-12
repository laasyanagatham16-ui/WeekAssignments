import java.util.*;

public class Problem5AnalyticsDashboard {

    static HashMap<String, Integer> pageViews = new HashMap<>();

    public static void recordView(String page) {
        pageViews.put(page, pageViews.getOrDefault(page, 0) + 1);
    }

    public static void showStats() {
        for (String page : pageViews.keySet()) {
            System.out.println(page + " -> " + pageViews.get(page));
        }
    }

    public static void main(String[] args) {

        recordView("Home");
        recordView("Home");
        recordView("About");
        recordView("Contact");

        showStats();
    }
}