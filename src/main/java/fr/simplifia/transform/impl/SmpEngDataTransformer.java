package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;

public class SmpEngDataTransformer extends AbstractSmpDataTransformer {

    private static final String MESSAGE = " : Welcome to Simplifia!";

    public SmpEngDataTransformer(SmpInputValidator validator) {
        super(validator);
    }

    @Override
    public String transform(String input) {
        return super.transform(input, MESSAGE);
    }
}