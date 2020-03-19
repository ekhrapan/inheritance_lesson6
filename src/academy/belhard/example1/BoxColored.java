package academy.belhard.example1;

import java.util.Objects;

public final class BoxColored extends Box {
    private BoxColor color;

    public BoxColored(int height, int width, int depth, BoxColor color) {
        super(height, width, depth);
        this.color = color;
    }

    public BoxColor getColor() {
        return color;
    }

    public void setColor(BoxColor color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoxColored)) return false;
        if (!super.equals(o)) return false;
        BoxColored that = (BoxColored) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "BoxColored{" +
                "color=" + color +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
