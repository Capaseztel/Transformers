package org.iesvdm.transformer;

import java.util.ArrayList;

public class Joiners
{
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    public static <T> ArrayList<T> ZipArrayLists(Joiner<T> joiner, ArrayList<T> Array1, ArrayList<T> Array2){
        ArrayList<T> result = new ArrayList<>();

        if (Array1.isEmpty() || Array2.isEmpty()){
            return result;
        }
        else{
            T h = joiner.join(Array1.get(0), Array2.get(0));
            result.add(h);
            ArrayList<T> t = ZipArrayLists(joiner, new ArrayList<>(Array1.subList(1, Array1.size())), new ArrayList<>(Array2.subList(1, Array2.size())));
            result.addAll(t);
        }

        return result;
    }
}