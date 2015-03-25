package com.CS2114.davidjesskevin;

import com.CS2114.davidjesskevin.Kitten;
import sofia.app.ShapeScreen;

//-------------------------------------------------------------------------
/**
* The visual representation of the maze.
*
* @author David Atkinson (davidja)
* @version 2015.03.08
*/
public class ProjectScreen
 extends ShapeScreen
{

    // ----------------------------------------------------------
    /**
     * initialize method for the screen.
     */
    public void initialize()
    {
        Kitten kitten = new Kitten(0, 0, getWidth(), getHeight());
        add(kitten);
    }

}
