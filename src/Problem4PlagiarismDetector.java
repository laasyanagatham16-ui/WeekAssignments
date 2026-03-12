import java.util.*;

public class Problem4PlagiarismDetector {

    public static boolean isPlagiarism(String text1, String text2) {

        HashSet<String> words1 = new HashSet<>(Arrays.asList(text1.split(" ")));
        HashSet<String> words2 = new HashSet<>(Arrays.asList(text2.split(" ")));

        words1.retainAll(words2);

        return words1.size() > 3;
    }

    public static void main(String[] args) {

        String doc1 = "java is a programming language used for development";
        String doc2 = "java is used for programming and development";

        System.out.println("Plagiarism Detected: " + isPlagiarism(doc1, doc2));
    }
}
