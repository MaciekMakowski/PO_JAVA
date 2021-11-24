package pl.imiajd.makowski;

import java.awt.Rectangle;

public class BetterRectangle {
    Rectangle item;

    public BetterRectangle(int x,int y, int width,int height){
    this.item = new Rectangle();
    item.setLocation(x,y);
    item.setSize(width,height);
    }

    public int getPerimeter(){
        return this.item.height*2+this.item.width*2;
    }

    public int GetArea(){
        return this.item.height*this.item.width;
    }

    public static void main(String[] args){
        BetterRectangle a = new BetterRectangle(5,5,4,10);
        System.out.println(a.GetArea());

    }
}
