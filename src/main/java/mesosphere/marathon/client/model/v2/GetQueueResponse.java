package mesosphere.marathon.client.model.v2;

import java.util.Collection;

/**
 *
 * @author Tom Ladyman
 */
public class GetQueueResponse {

    Collection<Queue> queue;

    public GetQueueResponse() {
    }

    public Collection<Queue> getQueue() {
        return queue;
    }

    public void setQueue(Collection<Queue> queue) {
        this.queue = queue;
    }

}
