package hws.hw7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Use the Picture hierarchy to display a wall of pictures.
 *
 * @author Patrick Carroll
 * @version 3/21/2024
 */
public class TitledPicture extends Picture {

    public static final int TEXT_HEIGHT = 12;
    public static final int CHAR_WIDTH = 4;
    public static final int PIC_NUM_CHARS = 4;
    private String title;

    /**
     * The constructor of the class.
     *
     * @param x x
     * @param y y
     * @param width the width
     * @param height the height
     * @param scale the scale
     * @param filename filename
     * @param title the title
     */
    public TitledPicture(int x, int y, int width, int height, double scale,
            String filename, String title) {
        super(x, y, width, height, scale, filename);
        this.title = title;
    }

    /**
     * The draw method.
     */
    @Override
    public void draw() {
        super.draw();
        StdDraw.setPenColor(Color.WHITE);

        StdDraw.filledRectangle(super.getX(),
                super.getY() - (super.getHeight() / 2) + 15,
                title.length() + PIC_NUM_CHARS * CHAR_WIDTH * 2,
                TEXT_HEIGHT);

        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(super.getX(), super.getY() - super.getHeight() / 2 + 15,
                super.getPicNum() + ": " + title);

        StdDraw.show();

    }

    /**
     * Converts something to a string.
     *
     * @return something in the form of a string.
     */
    public String toString() {

        return super.toString() + String.format("\nTitle: %s", title);
    }

}
