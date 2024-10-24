package org.iesvdm;

import org.iesvdm.transformer.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exercise 4
        System.out.println("Exercise 4");
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        System.out.println(Joiners.ZipArrayLists((y, x) -> y*10 + x, a, b));

        // Exercise 5
        System.out.println("\nExercise 5");
        LispList<Integer> l = LispList.empty();
        l = UtilLispList.add(l, 0, 1);
        l = UtilLispList.add(l, 1, 2);
        l = UtilLispList.add(l, 2, 3);
        System.out.println(Transformers.transformList(new TenTimes(), l));

        // Exercise 6
        System.out.println("\nExercise 6");
        ArrayList<String> c = new ArrayList<>();
        c.add("Hola");
        c.add("Adios");
        System.out.println(Transformers.applyConst(new TextAdder("Texto: "), c));

        // Exercise 7
        System.out.println("\nExercise 7");
        System.out.println("Is 3 odd? : " + new CheckIsOdd().check(3));
        System.out.println("Is 'Hello' shorter than 5 characters? : " + new CheckIsShorter(5).check("Hello"));
        ArrayList<String> d = new ArrayList<>();
        d.add("Hi");
        d.add("Hello");
        d.add("Goodbye");
        d.add("Sun");
        System.out.println(CheckLists.FilterList(new CheckIsShorter(5), d));

        // Exercise 8
        System.out.println("\nExercise 8");
        Excercise8 e = new Excercise8();
        System.out.println(e.join("Hello", "World"));
        ArrayList<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println(Excercise8.fold((x, y) -> x + y, v));
        System.out.println(Excercise8.fold((x, y) -> x + y, d));
    }
}