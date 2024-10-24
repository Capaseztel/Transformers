package org.iesvdm.transformer;

public class TextAdder implements Transformer<String>
{
    String text;
    public TextAdder(String text)
    {
        this.text = text;
    }
    public String transform(String str)
    {
        return text+str;
    }
}
