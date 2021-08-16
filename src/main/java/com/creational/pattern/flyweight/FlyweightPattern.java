package com.creational.pattern.flyweight;

import java.util.*;

public class FlyweightPattern {

    public static void main(String[] args) {
        FormattedText ft = new FormattedText("This is my new pattern implementation");
        ft.getRange(3,9).capitalize = true;
        System.out.println(ft);
        FormattedText ft2 = new FormattedText("This is my old pattern implementation");
        ft.getRange(3,9).capitalize = true;
    }

}

class FormattedText{

    private String text;

    private List<TextFormat> formats = new ArrayList<>();

    public FormattedText(String text) {
        this.text = text;
    }

    public TextFormat getRange(int start, int end){
        TextFormat tf = new TextFormat(start, end);
        formats.add(tf);
        return tf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length() ; i++) {
            char c = text.charAt(i);
            for(TextFormat tf :  formats){
                if (tf.covers(i) && tf.capitalize){
                    c = Character.toUpperCase(c);
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    class TextFormat{
        private int start, end;
        public boolean capitalize;

        public TextFormat(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean covers(int i){
            return i >= start && i <= end;
        }
    }
}
