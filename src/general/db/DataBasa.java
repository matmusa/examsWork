package general.db;

import general.model.Flower;

import java.util.List;

public class DataBasa {
    private List<Flower>flowers;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "DataBasa{" +
                "flowers=" + flowers +
                '}';
    }
}
