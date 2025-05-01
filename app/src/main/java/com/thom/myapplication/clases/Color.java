package com.thom.myapplication.clases;

public class Color {
    public int id;
    public String name;
    public String colorHex;
    public Color(int id, String name, String colorHex) {
        this.id = id;
        this.name = name;
        this.colorHex = colorHex;
    }

    public static int parseColor(String trim) {
        return 0;
    }

    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public String getColorHex(){return this.colorHex;}
    public void setId(int id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setColorHex(String colorHex){this.colorHex=colorHex;}
}
