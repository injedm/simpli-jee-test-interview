package fr.simplifia.output.impl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpOutputWriterImplTest {

    private PrintStream stream;
    private SmpOutputWriterImpl smpOutputWriterImpl;
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public SmpOutputWriterImplTest(){
        stream = Mockito.mock(PrintStream.class);
        smpOutputWriterImpl = new SmpOutputWriterImpl(stream);
    }

    @Test
    public void testPrint() throws Exception {
    	String input=anyString();
        smpOutputWriterImpl.print(input);
    	 String content = new String(outContent.toByteArray(), StandardCharsets.UTF_8);
         stream.close();
        Assert.assertEquals(input, content.toString());
    }

    @Test
    public void testPrintEmpty() throws Exception {
    	String input="";
        smpOutputWriterImpl.print(input);
    	 String content = new String(outContent.toByteArray(), StandardCharsets.UTF_8);
         stream.close();
        Assert.assertEquals(input, content.toString());
    }

    @Test
    public void testPrintNull() throws Exception {
    	String input=null;
        smpOutputWriterImpl.print(input);
    	 String content = new String(outContent.toByteArray(), StandardCharsets.UTF_8);
         stream.close();
        assertEquals("", content.toString());
        // System.out.println(content.toString());
    }

}