package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers
{
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    // Exercise 2
    public static <T> ArrayList<T> applyDest(Transformer<T> tran, ArrayList<T> a)
    {
        // instead of creating a new ArrayList, will modify the original one, so it's destructive
        for(T t : a)
            a.set(a.indexOf(t), tran.transform(t));
        return a;
    }

    // Exercise 5
    public static <T> LispList<T> transformList(Transformer<T> tran, LispList<T> l)
    {
        if(l.isEmpty())
            return LispList.empty();
        else
        {
            T h = tran.transform(l.head());
            LispList<T> t = transformList(tran, l.tail());
            return t.cons(h);
        }
    }
}

