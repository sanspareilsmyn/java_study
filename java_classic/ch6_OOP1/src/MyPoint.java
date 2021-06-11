public class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1){
        return Math.sqrt(((this.x - x1) * (this.x - x1)) + (this.y - y1) * (this.y - y1));
    }
}