package Assignment2;

public class LongestPrefixTrie {



        static class Node {
            Node[] children;
            boolean eow; // End of word flag
            public Node() {
                children = new Node[26]; // For lowercase letters
                for (int i = 0; i < 26; i++) {
                    children[i] = null;
                }
                eow = false;
            }
        }

        static Node root = new Node();

        // Insert a word into the Trie
        public static void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new Node();
                }
                curr = curr.children[index];
            }
            curr.eow = true; // Mark end of word
        }

        // Check if a word exists in the Trie with eow = true
        public static boolean searchWord(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    return false;
                }
                curr = curr.children[index];
            }
            return curr.eow; // Return true only if it's a complete word
        }

        // Check if all prefixes of a word are in the Trie
        public static boolean allPrefixesExist(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    return false;
                }
                curr = curr.children[index];
                if (!curr.eow) { // Every prefix must be a valid word
                    return false;
                }
            }
            return true;
        }

        // Find the longest word with all prefixes in the Trie
        public static String longestWord(String[] words) {
            // Insert all words into the Trie
            for (String word : words) {
                insert(word);
            }

            String longest = "";
            for (String word : words) {
                if (allPrefixesExist(word)) {
                    // Update if longer or same length but lexicographically smaller
                    if (word.length() > longest.length() ||
                            (word.length() == longest.length() && word.compareTo(longest) < 0)) {
                        longest = word;
                    }
                }
            }
            return longest;
        }

        public static void main(String[] args) {
            String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
            String result = longestWord(words);
            System.out.println("Longest word with all prefixes: " + result);
        }
    }

