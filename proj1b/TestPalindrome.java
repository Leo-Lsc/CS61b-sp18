import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    /* You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset. */
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testisPalindrome() {
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("a"));
        assertFalse(palindrome.isPalindrome("cat"));
        assertTrue(palindrome.isPalindrome("aka"));
        assertFalse(palindrome.isPalindrome("four"));
        assertTrue(palindrome.isPalindrome("boob"));
    }

    @Test
    public void testIsOffByOnePalindrome() {
        CharacterComparator cc = new OffByOne();
        assertTrue(palindrome.isPalindrome("ab", cc));
        assertTrue(palindrome.isPalindrome("%&", cc));
        assertTrue(palindrome.isPalindrome("a%&b", cc));
        assertTrue(palindrome.isPalindrome("flake", cc));

        assertFalse(palindrome.isPalindrome("aA", cc));
        assertFalse(palindrome.isPalindrome("aka", cc));
        assertFalse(palindrome.isPalindrome("abba", cc));
    }
}
