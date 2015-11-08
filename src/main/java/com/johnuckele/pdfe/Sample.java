package com.johnuckele.pdfe;

import processing.core.PApplet;

public class Sample extends PApplet
{

    @Override
    public void settings()
    {
        // size(200, 200);
        size(400, 400, PDF, "filename.pdf");
    }

    @Override
    public void setup()
    {
        background(128);
    }

    @Override
    public void draw()
    {
        // Draw something good here
        line(0, 0, width / 2, height);

        // Exit the program
        println("Finished.");
        exit();
    }

    public static void main(String args[])
    {
        PApplet.main(new String[] { "--present", "com.johnuckele.pdfe.Sample" });
    }
}