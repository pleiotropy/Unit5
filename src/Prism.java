public class Prism {
    // instance variables
    private int length, width, height;

    // constructors
    public Prism(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    // getter/setter methods
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    // other public methods
    public String toString() {
        return "length = " + length + ", width = " + width + ", height = " + height;
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return (2 * ((length * width) + (length * height) + (width * height)));
    }
}