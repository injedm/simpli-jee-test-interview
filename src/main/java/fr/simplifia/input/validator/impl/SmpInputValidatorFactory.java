package fr.simplifia.input.validator.impl;

import fr.simplifia.input.validator.SmpInputValidator;

import java.util.Locale;


public class SmpInputValidatorFactory {

    public static SmpInputValidator fromLocale(final Locale locale){
         SmpInputValidator result;
     
         
         if(locale.getLanguage().equals(new Locale("en").getLanguage()))
         {
        	 result = new SmpEngInputValidator(locale);
         }
         else
         {
             result = new SmpDefaultInputValidator(locale);

         }
        return result;
    }
}
