package obstacles;
import members.Capabilities;
import members.Animals;

    public class Pool extends Obstacle {
        private int length;

        public Pool(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Capabilities Capabilities) {
            Capabilities.swim(length);
        }
        
}
