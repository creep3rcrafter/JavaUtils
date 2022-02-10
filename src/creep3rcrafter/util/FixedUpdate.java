package creep3rcrafter.util;
/**
 * <b>An Easy Implementation For Your Own Fixed Update Loop
 * <font color="lime"> By Brenden Delano <font color="White">V1.0</b>
 * @version 1.0
 * @author Brenden Delano
 * On Creation Of Object Override FixedUpdate
 * And Call pullFixedUpdate() In Your Main Loop
 * **/
public class FixedUpdate {
    public int fixedCycle;
    public double deltaTime;
    public long timeStart;
    public long oldTimeStart;
    public double speed;


    /**Override FixedUpdate On Object Creation
     * @param speed (double) EXAMPLE: 1 = 1 update per second, 0.5 = 2 updates per second
     * **/
    public FixedUpdate (double speed){
        this.speed = speed;
        this.initializeFixedUpdate();
    }
    public void initializeFixedUpdate(){
        oldTimeStart = System.nanoTime();
    }

    public void pullFixedUpdate(){
        timeStart = System.nanoTime();
        deltaTime = (timeStart - oldTimeStart) / 1000000000.0;
        if (deltaTime >= speed) {
            oldTimeStart = timeStart;
            FixedUpdate();
            fixedCycle++;
        }
    }
    /**Override FixedUpdate On Object Creation* **/
    public void FixedUpdate(){
    }
}
