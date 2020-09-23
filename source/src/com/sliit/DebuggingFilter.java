package com.sliit;

public class DebuggingFilter extends AbstractFilter {

    public DebuggingFilter(Filter filter) {
        super(filter);
    }

    @Override
    public void execute() {
        System.out.println("Debugging Filter");
        super.execute();
    }
}
