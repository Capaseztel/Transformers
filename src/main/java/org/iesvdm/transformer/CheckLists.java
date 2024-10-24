package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckLists {
    public static <T> ArrayList<T> FilterList(Checkeable<T> c, ArrayList<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!c.check(it.next())) {
                it.remove();
            }
        }
        return list;
    }
}
