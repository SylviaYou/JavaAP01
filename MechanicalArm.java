package AP01;

public interface MechanicalArm {
    int getCurrentIndex();
    boolean isFacingRight();
    void moveForward(int numLocs);
}
