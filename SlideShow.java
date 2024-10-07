package hws.hw7;

import java.util.ArrayList;

/**
 * Use the Picture hierarchy to display a wall of pictures.
 *
 * @author CS159 Faculty
 * @version 3/15/2024
 */
public class SlideShow extends Picture {

    public static final int SLIDE_SHOW_PAUSE = 2000;
    private ArrayList<String> picFiles;
    private int currentPic;

    /**
     * The constructor of a class.
     *
     * @param x x
     * @param y y
     * @param width the width
     * @param height the height
     * @param scale the scale
     * @param picFiles an array list
     */
    public SlideShow(int x, int y, int width, int height, double scale,
            ArrayList<String> picFiles) {
        super(x, y, width, height, scale, picFiles.get(0));
        this.currentPic = 0;
        this.picFiles = new ArrayList<String>(picFiles);


    }

    public int getCurrentPic() {
        return currentPic;
    }

    /**
     * Checks if something is equal to something else.
     *
     * @param other the other object.
     * @return true if equal
     *
     */
    public boolean equals(Object other) {
        if (other instanceof SlideShow) {
            SlideShow slide = (SlideShow) other;
            return slide.picFiles.equals(this.picFiles);
        }
        return false;
    }

    /**
     * draws a picture.
     */
    public void draw() {
        super.draw();
        currentPic += 1;
        if (currentPic >= picFiles.size()) {
            currentPic = 0;
        }
        this.setFilename(picFiles.get(currentPic));

    }

    /**
     * Converts something to a string.
     *
     * @return something converted to a string.
     *
     */
    public String toString() {
        String stringPic = super.toString();
        for (int i = 0; i < picFiles.size(); i++) {
            stringPic += "\n" + picFiles.get(i);
        }
        return stringPic;
    }
}
