package members;

public abstract class Animals implements Capabilities{
    private String name;
    private String type;
    int maxRunDistance;
    int maxSwimLength;
    int maxJumpHeight;
    boolean onDistance;


    public boolean isOnDistance(){
        return onDistance;
    }

    public Animals(String name, int maxRunDistance, int maxSwimLength, int maxJumpHeight) {
        this.name = name;
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(type + " " + name + " " + " успешно справился с забегом");
        } else {
            System.out.println(type + " " + name + " " + " не смог преодолеть забегом");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(type + " " + name + " " + " успешно справился с препятствием");
        } else {
            System.out.println(type + " " + name + " " + " не смог преодолеть препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (maxSwimLength == 0){
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <=maxSwimLength){
            System.out.println(type + " " + name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(type + " " + name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(type + " " + name + ": " + onDistance);
    }
}
