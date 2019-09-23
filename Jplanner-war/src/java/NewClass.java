
import entity.Station;
import java.awt.Point;


public class NewClass {
    
public class Line {

    private int stid;
    private int start;
    private int end;
    private Station sn= new Station();
    private int num;

    public Line(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getDistance(Point other) {
      //  return Math.min(Math.abs(other.getStart()- start), Math.abs(other.getStart() - end));
    }

    public int getDistance(Line other) {
        int s = other.getStart();
        int e = other.getEnd();

        int delta1 = Math.min(Math.abs(this.start - s), Math.abs(this.start - e));
        int delta2 = Math.min(Math.abs(this.end - s), Math.abs(this.end - e));

        return Math.min(delta1, delta2);
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

}    
    
    
}

