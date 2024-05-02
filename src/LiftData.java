import java.util.ArrayList;

public class LiftData {

    private int  LiftNumber;
    private int liftFloorAt;
    private int liftWeigthtCapacity;
    private int liftPersonCapacity;
    private int restrictLiftFloorFrom;
    private int restrictLiftFloorUpto;
    private int liftUnderMaintanence;

    public int getLiftNumber() {
        return LiftNumber;
    }

    public void setLiftNumber(int liftNumber) {
        LiftNumber = liftNumber;
    }


    public int getLiftFloorAt() {
        return liftFloorAt;
    }

    public void setLiftFloorAt(int liftFloorAt) {
        this.liftFloorAt = liftFloorAt;
    }

    public int getLiftWeigthtCapacity() {
        return liftWeigthtCapacity;
    }

    public void setLiftWeigthtCapacity(int liftWeigthtCapacity) {
        this.liftWeigthtCapacity = liftWeigthtCapacity;
    }

    public int getLiftPersonCapacity() {
        return liftPersonCapacity;
    }

    public void setLiftPersonCapacity(int liftPersonCapacity) {
        this.liftPersonCapacity = liftPersonCapacity;
    }

    public int getRestrictLiftFloorFrom() {
        return restrictLiftFloorFrom;
    }

    public void setRestrictLiftFloorFrom(int restrictLiftFloorFrom) {
        this.restrictLiftFloorFrom = restrictLiftFloorFrom;
    }

    public int getRestrictLiftFloorUpto() {
        return restrictLiftFloorUpto;
    }

    public void setRestrictLiftFloorUpto(int restrictLiftFloorUpto) {
        this.restrictLiftFloorUpto = restrictLiftFloorUpto;
    }

    public int getLiftUnderMaintanence() {
        return liftUnderMaintanence;
    }

    public void setLiftUnderMaintanence(int liftUnderMaintanence) {
        this.liftUnderMaintanence = liftUnderMaintanence;
    }

    @Override
    public String toString() {
        return "LiftData{" +
                "restrictLiftFloorFrom=" + restrictLiftFloorFrom +
                ", restrictLiftFloorUpto=" + restrictLiftFloorUpto +
                '}';
    }
}

