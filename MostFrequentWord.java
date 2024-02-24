import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();
        System.out.println("Enter the banned words (comma-separated):");
        String bannedString = scanner.nextLine();
        String[] banned = bannedString.split(",");
        scanner.close();

        String result = findMostFrequentWord(paragraph, banned);
        System.out.println("The most frequent word not banned is: " + result);
    }

    public static String findMostFrequentWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordFreq = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        return mostFrequentWord;
    }
}