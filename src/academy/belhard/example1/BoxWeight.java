package academy.belhard.example1;

import java.util.Objects;

public final class BoxWeight extends Box {
    protected int weight;

    public BoxWeight(int height, int width, int depth, int weight) {
        super(height, width, depth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoxWeight)) return false;
        if (!super.equals(o)) return false;
        BoxWeight boxWeight = (BoxWeight) o;
        return weight == boxWeight.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "BoxWeight{" +
                "weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
