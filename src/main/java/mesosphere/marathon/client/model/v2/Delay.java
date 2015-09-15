package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

public class Delay {

    private boolean overdue;
    private int timeLeftSeconds;

    public Delay() {
    }

    public boolean isOverdue() {
        return overdue;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }

    public int getTimeLeftSeconds() {
        return timeLeftSeconds;
    }

    public void setTimeLeftSeconds(int timeLeftSeconds) {
        this.timeLeftSeconds = timeLeftSeconds;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
