package com.company.Structural.Decorator.PizzaTask;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class JavaIODecorator {
    /**
     * JAVA IO actually is a decorator.
     */

    public JavaIODecorator() throws IOException {

        // We need to read some file
        FileInputStream fis = new FileInputStream("/");

        // Now let's suppose we need to store that file in memory
        BufferedInputStream bis = new BufferedInputStream(fis);

        // Now let's suppose file is compressed we need to uncompress it.
        GZIPInputStream gis = new GZIPInputStream(bis);

        // As we can see we just change behaviour of our object runtime
        // instead of having some possible combinations like ObjectGzippedBufferInputStream.
        // Both BufferedInputStream, GZIPInputStream eventually extend InputStream abstract class.
    }
}
