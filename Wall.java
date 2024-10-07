package hws.hw7;

import java.util.ArrayList;

/**
 * Use the Picture hierarchy to display a wall of pictures.
 *
 * @author Patrick Carroll
 * @version 3/21/2024
 */
public class Wall {
    public static final int WALL_WIDTH = 1024;
    public static final int WALL_HEIGHT = 512;
    private ArrayList<Picture> pics;

    /**
     * The constructor of the class.
     *
     * @param pics an array list.
     *
     */
    public Wall(ArrayList<Picture> pics) {
        this.pics = new ArrayList<>(pics);
    }

    public ArrayList<Picture> getPics() {
        return pics;
    }

    /**
     * Produces the display.
     */
    public void display() {
        for (Picture pic : pics) {
            pic.draw();
        }
    }
}
