package fr.simplifia.input.validator;

import java.util.Locale;

import fr.simplifia.input.exception.InputException;

public interface SmpInputValidator {
   void  validateInput(final String input) throws InputException;
   Locale getLocale();

}
