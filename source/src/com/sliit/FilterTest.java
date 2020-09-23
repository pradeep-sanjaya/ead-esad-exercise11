package com.sliit;

public class FilterTest {
    public static void main(String[] args) {
        Filter filter = new AuthenticationFilter(new DebuggingFilter(new InputValidationFilter(null)));
        filter.execute();

        System.out.println();
        new AuthenticationFilter(new DebuggingFilter(null)).execute();

        System.out.println();
        new AuthenticationFilter(null).execute();

        System.out.println();
        new InputValidationFilter(new DebuggingFilter(new AuthenticationFilter(null))).execute();
    }
}
