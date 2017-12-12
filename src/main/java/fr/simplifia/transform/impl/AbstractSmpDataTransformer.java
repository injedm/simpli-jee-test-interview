package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.SmpDataTransformer;

import java.util.Locale;

public abstract class AbstractSmpDataTransformer implements SmpDataTransformer {
    protected Locale locale;
    protected SmpInputValidator validator;

    public AbstractSmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;
    }

    public String transform(String input, String MESSAGE) {
        validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        buffer.append(MESSAGE);
        return buffer.toString();
    }

    public Locale getLocale() {
        return locale;
    }
}