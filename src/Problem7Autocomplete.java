import java.util.*;

public class Problem7Autocomplete {

    static HashMap<String,Integer> queries = new HashMap<>();

    public static void addQuery(String q){
        queries.put(q, queries.getOrDefault(q,0)+1);
    }

    public static void search(String prefix){

        queries.entrySet()
                .stream()
                .filter(e -> e.getKey().startsWith(prefix))
                .sorted((a,b)->b.getValue()-a.getValue())
                .limit(5)
                .forEach(e->System.out.println(e.getKey()+" ("+e.getValue()+")"));
    }

    public static void main(String[] args){

        addQuery("java tutorial");
        addQuery("javascript");
        addQuery("java download");
        addQuery("java tutorial");

        search("jav");
    }
}