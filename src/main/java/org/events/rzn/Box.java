package org.events.rzn;
import java.util.Objects;
public class Box {
    private int value;
    public Box(int value) {
        this.value = value;
    }

    public int hashCode() {
        return Objects.hash(value);
    }
    public static int getNonNormalBox(Box[] boxes) {
        int indexHash = 0;
        int index = 0;
        for (int i = 0; i < boxes.length; ) {
            if (boxes[i].hashCode() == boxes[i + 2].hashCode() && boxes[i].hashCode() == boxes[i + 1].hashCode()) {
                i += 3;
                index = i;
            } else if (boxes[i].hashCode() == boxes[i + 1].hashCode()) {
                indexHash = boxes[i + 2].hashCode();
                index = i + 2;
                break;
            } else if (boxes[i].hashCode() == boxes[i + 2].hashCode()) {
                indexHash = boxes[i + 1].hashCode();
                index = i + 1;
                break;
            } else {
                indexHash = boxes[i].hashCode();
                index = i;
                break;
            }
        }
        System.out.println(indexHash);
        return index;
    }
}
