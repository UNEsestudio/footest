package vanilla.model;

import java.util.concurrent.ConcurrentHashMap;

public class ConnectionManager {

    ConcurrentHashMap<Id<User>, String> forwardMap = new ConcurrentHashMap<Id<User>, String>();



    public void connect(Id<User> userId, String ipAddress) {
        forwardMap.put(userId, ipAddress);
    }

    public String getIp(Id<User> userId) {
        return forwardMap.get(userId);
    }


}
