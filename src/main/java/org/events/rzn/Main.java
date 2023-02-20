package org.events.rzn;

public class Main {
    public static void main(String[] args) {
        Box[] boxes = new Box[]{new Box(2), new Box(1), new Box(1), new Box(1), new Box(1),
                new Box(1), new Box(1), new Box(1), new Box(1), new Box(1),
                new Box(1), new Box(1)};
        System.out.println(Box.getNonNormalBox(boxes));
    }
}