package com.creational.pattern.prototype;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point other)
    {
        this.x = other.x;
        this.y = other.y;
    }
}

@Setter
@ToString
class Line
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line(Line other)
    {
        this.start = new Point(other.start);
        this.end = new Point(other.end);
    }

    public Line deepCopy()
    {
        return new Line(this);
    }
}

class Demo{
    public static void main(String[] args) {
        Line line = new Line(new Point(12, 23), new Point(23, 45));

        Line l2 = line.deepCopy();
        l2.setEnd(new Point(34,23));

        System.out.printf("Line 1 "+ line);
        System.out.printf("Line 2 "+ l2);

    }
}
