import java.util.*;

public class Problem10MultiLevelCache {

    static LinkedHashMap<String,String> L1 = new LinkedHashMap<>();
    static HashMap<String,String> L2 = new HashMap<>();
    static HashMap<String,String> L3 = new HashMap<>();

    public static String getVideo(String id){

        if(L1.containsKey(id)){
            System.out.println("L1 Cache HIT");
            return L1.get(id);
        }

        if(L2.containsKey(id)){
            System.out.println("L2 Cache HIT → Promoted to L1");
            L1.put(id,L2.get(id));
            return L2.get(id);
        }

        if(L3.containsKey(id)){
            System.out.println("L3 Database HIT → Added to L2");
            L2.put(id,L3.get(id));
            return L3.get(id);
        }

        return "Video Not Found";
    }

    public static void main(String[] args){

        L3.put("video1","Movie Data");

        getVideo("video1");
        getVideo("video1");
    }
}