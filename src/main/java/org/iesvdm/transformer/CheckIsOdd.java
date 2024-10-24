package org.iesvdm.transformer;

public class CheckIsOdd implements Checkeable<Integer>
{
    public boolean check(Integer n)
    {
        return n%2 != 0;
    }
}
