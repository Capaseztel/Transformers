package org.iesvdm.transformer;

public class CheckIsShorter implements Checkeable<String>{

    int maxLenght;

    public CheckIsShorter(int maxLenght){
        this.maxLenght = maxLenght;
    }

    @Override
    public boolean check(String item) {
        return item.length() < maxLenght;
    }
}
