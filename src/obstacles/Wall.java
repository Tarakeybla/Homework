package obstacles;
import members.Capabilities;
import members.Animals;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Capabilities competitor) {
        competitor.jump(height);
    }
    
}
