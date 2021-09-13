package obstacles;
import members.Capabilities;
import members.Animals;

public class Track extends Obstacle {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Capabilities competitor) {
        competitor.run(distance);
    }
}
