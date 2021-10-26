public class Line {
    private final Point Start;
    private final Point End;

    public Line(Point start, Point end) {
        Start = start;
        End = end;
    }

    public double getLength() {
        return Start.getDistance(End);
    }

    public boolean hasPoint(Point p) {
        return getLength() == p.getDistance(Start) + p.getDistance(End);
    }

    public Point getStartPoint() {
        return Start;
    }

    public Point getEndPoint() {
        return End;
    }

    public String toString() {
        return Start.toString() + ", " + End.toString();
    }
}

public class Point {
    private final int X;
    private final int Y;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public double getDistance(Point p2) {
        int xDistance = Math.abs(X - p2.getX());
        int yDistance = Math.abs(Y - p2.getY());

        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public String toString() {
            return "[" + X + ", " + Y + "]";
    }
}

public class PolygonalLine {
    private ArrayList<Line> lines = new ArrayList<>();

    public double getLength() {
        int totalLength = 0;
        for(Line line : lines)
            totalLength += line.getLength();
        return totalLength;
    }

    public void addPoint(Point p) {
        Point lastPoint = lines.get(lines.size() - 1).getEndPoint();
        Line newLine = new Line(lastPoint, p);
        lines.add(newLine);
    }

    public void setPoints(ArrayList<Line> lines) {
        this.lines = lines;
    }
}
