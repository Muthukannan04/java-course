import java.util.*;

class Shape {
    int len;
    int width;

    Shape(int l, int w) {
        this.len = l ;
        this.width = w;
    }

    void print() {
        System.out.println("---------------------------------");
        System.out.println("The area of the rectangle is "+(float) len*width);
        System.out.println("The perimeter of the rectangle is "+(float) (len+width)*2);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  l;
        int w;
        Shape s[] = new Shape[n];
        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            w = sc.nextInt();
            s[i] = new Shape(l, w);
            s[i].print();
        }
    }
}
