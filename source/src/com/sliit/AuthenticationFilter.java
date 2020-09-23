package com.sliit;

public class AuthenticationFilter extends AbstractFilter {

    public AuthenticationFilter(Filter filter) {
        super(filter);
    }

    @Override
    public void execute() {
        System.out.println("Authentication Filter");
        super.execute();
    }
}
