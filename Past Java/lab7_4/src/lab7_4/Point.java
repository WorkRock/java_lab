package lab7_4;
/*
 * Point.java
 * 작성일: 2017.5.11
 * 작성자: 홍길동
* 내용: x, y 좌표 속성을 갖는 점을 표현하는 클래스 **** lab7_3과 동일
*/
public class Point {
    private int x, y;
    
    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

   public int getX() {
        return x;
    }

   public void setX(int x) {
        this.x = x;
    }

   public int getY() {
        return y;
    }

   public void setY(int y) {
        this.y = y;
    }

   @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

   @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

   @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
