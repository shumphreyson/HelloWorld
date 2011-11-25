package test;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author shumphreyson <br />
 * @version $Revision: 1.2 $<br />
 * $Source: /cvsroot/documentation/Standards/RAD/earthportCodeTemplate.xml,v $<br />
 * Copyright 2011 Earthport Plc. All rights reserved.
 */
public class Test
{
    
    public static void main(String[] args) throws Exception
    {
        File aFile = new File("LargeTestFile.txt");
        aFile.delete();
        RandomAccessFile out = new RandomAccessFile( aFile, "rw");
        System.out.println(aFile.getAbsolutePath());
        for (int i=0; i<10000000; i++)
        {
            out.writeBytes("a");
        }
        out.close();
        System.out.println("Complete");
    }

}
