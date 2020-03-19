package academy.belhard.example1;

import java.util.Objects;

public class Box {
    public static final String COMPANY_LABEL = "Best company in the world";

    protected int height;
    protected int width;
    protected int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return height == box.height &&
                width == box.width &&
                depth == box.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, depth);
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
