package com.sahil.NestedInterface;

public class HaveInterfaceInside {
    public interface NestedInterface{
        Boolean isOdd(int n);
    }
}


class Something implements HaveInterfaceInside.NestedInterface{

    @Override
    public Boolean isOdd(int n) {
        return (n&1) == 1;
    }
}