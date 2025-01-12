package Polymorphism.constructor-overloading;

public class Box {
    int width;
    int height;
    int depth;

     Box() {}
     Box(int height) {
        this.height = height;
    }
     Box(int  width, int height, int depth) {
        this(height);
        this.width = width;
        this.depth = depth;
    }

    int volume() {
         if (this.width == 0 && this.height == 0 && this.depth == 0) {
             return -1;
         } else if (this.width == 0 && this.height > 0 && this.depth == 0) {
             return height * height * height;
         } else {
             return width * height * depth;
         }
    }
}
