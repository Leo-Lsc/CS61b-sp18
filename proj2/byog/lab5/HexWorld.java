package byog.lab5;
import org.junit.Test;
import static org.junit.Assert.*;

import byog.TileEngine.TERenderer;
import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;

import java.util.Random;

/**
 * Draws a world consisting of hexagonal regions.
 */
public class HexWorld {
    private static final int WIDTH = 60;
    private static final int HEIGHT = 30;

    // Add a hexagon of side length s to a given position in the world.
    public void addHexagon(int s) {
        int space = s - 1;
        TopHalf(s, space);
        BottomHalf(s, space);
    }
    
    private void repeatString(String item, int time) {
        for (int i = 0; i < time; i += 1) {
            System.out.print(item);
        }
    }

    // Draw the top half of the hexagon.
    private void TopHalf(int s, int space) {
        int numChars = s;
        for (int i = 0; i < s; i += 1) {
            repeatString(" ", space);
            repeatString("a", numChars);
            repeatString(" ", space);
            System.out.println("");
            numChars += 2;
            space -= 1;
        }
    }

    // Draw the bottom half of the hexagon.
    private void BottomHalf(int s, int space) {
        int numChars = s + 2 * space;
        space = 0;
        for (int i = 0; i < s; i += 1) {
            repeatString(" ", space);
            repeatString("a", numChars);
            repeatString(" ", space);
            System.out.println("");
            numChars -= 2;
            space += 1;
        }
    }

    public static void main(String[] args) {
        HexWorld test = new HexWorld();
        test.addHexagon(5);
    }
}
