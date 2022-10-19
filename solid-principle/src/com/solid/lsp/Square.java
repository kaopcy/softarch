package com.solid.lsp;

public class Square implements IShape {
    private int side = 0;

    Square(int side) {
        this.side = side;
    }

    public void setWidth(int width) {
        this.side = width;
    }
    
    public void setHeight(int height) {
        this.side = height;
    }
    
    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }
}
