package skier;

/**
 * @author Rebecca Zhang
 * Created on 2024-06-01
 */

public class SkierInDto {

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setLiftID(Integer liftID) {
        this.liftID = liftID;
    }

    private Integer time;

    private Integer liftID;

    public Integer getTime() {
        return time;
    }

    public Integer getLiftID() {
        return liftID;
    }

}
