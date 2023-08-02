public class Palindrome {

    // Return a Deque where the characters appear in the same order as in the String.
    public Deque<Character> wordToDeque(String word) {
        Deque<Character> x = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i += 1) {
            x.addLast(word.charAt(i));
        }
        return x;
    }

     // Return true if the given word is a palindrome, and false otherwise.
     public boolean isPalindrome(String word) {
         Deque<Character> d = wordToDeque(word);
         return isPalindrome(d);
     }

     private boolean isPalindrome(Deque<Character> d) {
         if (d.size() <= 1) {
             return true;
         }
         if (d.removeFirst() != d.removeLast()) {
             return false;
         }
         return isPalindrome(d);
     }

    /** Return true if the word is a palindrome
     * according to the character comparison test
     * provided by the CharacterComparator passed in as argument cc.
     */
    public boolean isPalindrome(String word, CharacterComparator cc) {
        Deque<Character> d = wordToDeque(word);

        int length = word.length();
        int i;

        if (length % 2 == 0) {
            i = length / 2;
        } else {
            i = (length - 1) / 2;
        }

        for (int j = 0; j < i; j += 1) {
                Character head = d.removeFirst();
                Character tail = d.removeLast();
                if (!cc.equalChars(head, tail)) {
                    return false;
            }
        }

        return true;
    }
}
