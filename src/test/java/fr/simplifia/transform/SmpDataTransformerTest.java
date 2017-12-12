package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.impl.SmpEngDataTransformer;

import org.mockito.Mockito;

import java.lang.NullPointerException;
import static org.testng.Assert.*;
import org.junit.Test;


public class SmpDataTransformerTest {

    private SmpInputValidator validator;
	SmpDataTransformer transformer = new SmpEngDataTransformer(validator);

    String input = "test_string";
	String tail_en=" : Welcome to Simplifia!";
    public SmpDataTransformerTest(){
        validator = Mockito.mock(SmpInputValidator.class);
        //TODO : mocking strategy
        //when(validator.validateInput(input)).thenReturn();
    }

    @Test()
    public void testTransformOk() throws Exception {
    	SmpDataTransformer transformer = new SmpEngDataTransformer(validator);
        assertEquals(transformer.transform(input), input+tail_en);
    }

	@Test(expected = NullPointerException.class)
    public void testTransformNotOk() throws Exception {
    	input = "tèst_string_not_supportêd";
        transformer.transform(input);

    	    }


    @Test
    public void testTransformEmpty() throws Exception {
    	SmpDataTransformer transformer = new SmpEngDataTransformer(validator);
    	input = "";
        assertEquals(transformer.transform(input), input+tail_en);
    }

    @Test
    public void testTransformNull() throws Exception {
    	SmpDataTransformer transformer = new SmpEngDataTransformer(validator);
    	input = null;
        assertEquals(transformer.transform(input), input+tail_en);
    }


}