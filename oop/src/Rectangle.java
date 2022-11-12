public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w){
        width=w;
    }

    public void setHeight(int h){
        height=h;
    }


    public int GetArea() {
        return this.width * this.height;
    }
    public int GetPerimetr() {
        return (this.width * this.height) * 2;
    }

}
