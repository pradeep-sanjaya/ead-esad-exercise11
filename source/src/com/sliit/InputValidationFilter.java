package com.sliit;

public class InputValidationFilter extends AbstractFilter {

    public InputValidationFilter(Filter filter) {
        super(filter);
    }

    @Override
    public void execute() {
        System.out.println("Input Validation Filter");
        super.execute();
    }
}
