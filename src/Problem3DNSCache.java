import java.util.*;

public class Problem3DNSCache {

    static HashMap<String, String> dns = new HashMap<>();

    public static void addDNS(String domain, String ip) {
        dns.put(domain, ip);
    }

    public static String resolve(String domain) {
        return dns.getOrDefault(domain, "Not Found");
    }

    public static void main(String[] args) {

        addDNS("google.com", "142.250.190.78");
        addDNS("github.com", "140.82.121.4");

        System.out.println(resolve("google.com"));
        System.out.println(resolve("github.com"));
        System.out.println(resolve("facebook.com"));
    }
}
