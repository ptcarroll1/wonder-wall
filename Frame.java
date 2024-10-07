package hws.hw7;

import java.awt.Color;

/**
 * Use the Picture hierarchy to display a wall of pictures.
 *
 * @author Patrick Carroll
 * @version 3/20/2024
 */

public class Frame {
    public static final Color JMU_PURPLE = new Color(69, 0, 132);
    public static final Color JMU_GOLD = new Color(203, 182, 119);
    public static final double INNER_RADIUS = 0.01;
    public static final double OUTER_RADIUS = 0.02;
    private Color outerColor;
    private Color innerColor;

    /**
     * The constructor for this class.
     */
    public Frame() {
        this.innerColor = JMU_GOLD;
        this.outerColor = JMU_PURPLE;
    }

    /**
     * The second constructor for this class.
     *
     * @param innerColor the inner color
     * @param outerColor the outer color
     */
    public Frame(Color innerColor, Color outerColor) {
        this.innerColor = innerColor;
        this.outerColor = outerColor;
    }

    public Color getOuterColor() {
        return outerColor;
    }

    /**
     * The setter function.
     *
     * @param outerColor the outer color.
     */
    public void setOuterColor(Color outerColor) {
        this.outerColor = outerColor;
    }

    public Color getInnerColor() {
        return innerColor;
    }

    /**
     * The setter function.
     *
     * @param innerColor the inner color
     */
    public void setInnerColor(Color innerColor) {
        this.innerColor = innerColor;
    }

    /**
     * The equals method.
     *
     * @param other the other object.
     * @return a boolean value.
     */
    public boolean equals(Object other) {
        if (other instanceof Frame) {
            Frame frame = (Frame) other;
            return this.innerColor.equals(frame.getInnerColor())
                    && this.outerColor.equals(frame.getOuterColor());
        }
        return false;
    }

    /**
     * The to string method.
     *
     * @return a string value.
     */
    public String toString() {

        return String.format("Frame [outerColor=%s, innerColor=%s]",
                outerColor.toString(), innerColor.toString());
    }

}
