package Assignment2;

// Program to count unique substrings in a given string using a Trie
public class CountUniqueSubstrings {
    // Trie node class for lowercase letters (a-z)
    static class Node {
        Node[] children; // Array to store child nodes (26 for a-z)

        public Node() {
            children = new Node[26];
            // Initialize all children as null
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // Root node of the Trie
    static Node root = new Node();

    // Inserts a string into the Trie and returns the number of new nodes created
    public static int insert(String word) {
        Node curr = root;
        int newNodes = 0;

        // Process each character of the string
        for (char ch : word.toCharArray()) {
            int index = ch - 'a'; // Map character to index (0-25)
            if (curr.children[index] == null) {
                curr.children[index] = new Node(); // Create new node if path doesn't exist
                newNodes++;
            }
            curr = curr.children[index]; // Move to the next node
        }
        return newNodes;
    }

    // Counts unique substrings by inserting all substrings into the Trie
    public static int countUniqueSubstrings(String str) {
        int totalNodes = 0;

        // Generate all possible substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                // Extract substring from index i to j
                String substring = str.substring(i, j + 1);
                totalNodes += insert(substring); // Insert and count new nodes
            }
        }
        return totalNodes;
    }

    // Main method to test the program
    public static void main(String[] args) {
        String str = "ababa"; // Input string
        int result = countUniqueSubstrings(str);
        System.out.println("Number of unique substrings: " + result);
    }
}