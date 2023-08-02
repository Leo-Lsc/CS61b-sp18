public class OffByN implements CharacterComparator {
    private int off;

    // Constructor
    public OffByN(int N) {
        off = N;
    }

    // Returns true for characters that are off by N.
    @Override
    public boolean equalChars(char x, char y) {
        return Math.abs(x - y) == off;
    }
}
