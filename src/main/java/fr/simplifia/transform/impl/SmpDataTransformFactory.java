package fr.simplifia.transform.impl;

import java.util.Locale;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.SmpDataTransformer;

public class SmpDataTransformFactory {
	public static SmpDataTransformer fromLocale(final SmpInputValidator validator) {
		final SmpDataTransformer result;

		if(validator.getLocale().getLanguage().equals(new Locale("en").getLanguage()))
		{
			result = new SmpEngDataTransformer(validator);
		}
		else
		{
			result = new SmpDefaultDataTransformer(validator);

		}
return result;
	}
}