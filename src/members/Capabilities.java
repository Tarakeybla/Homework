package members;

public interface Capabilities {
    void run(int distance);
    void jump(int height);
    void swim(int length);
    boolean isOnDistance();
    void showResult();
}
