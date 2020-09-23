package com.sliit;

public class AbstractFilter implements Filter {
    Filter filter;

    public AbstractFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public void execute() {
        if (filter != null) {
            filter.execute();
        }
    }
}
