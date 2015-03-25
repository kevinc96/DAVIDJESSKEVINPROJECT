package com.CS2114.davidjesskevin;

import sofia.graphics.RectangleShape;

// -------------------------------------------------------------------------
/**
 * The object that holds the kitten picture.
 *
 * @author David Atkinson (davidja)
 * @version 2015.03.06
 */

public class Kitten
    extends RectangleShape
{
    // ----------------------------------------------------------
    /**
     * Create a new Kitten object.
     *
     * @param left
     *            The left side
     * @param top
     *            The top side
     * @param right
     *            The right side
     * @param bottom
     *            The bottom side
     */
    public Kitten(float left, float top, float right, float bottom)
    {
        super(left, top, right, bottom);
        setImage("kitten");
    }
}
