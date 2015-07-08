package vanilla.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConnectionManagerTest {

    @Test
    public void testGetIpAddress() {

        ConnectionManager cm = new ConnectionManager();
        Id<User> userId = new Id<User>("1234");

        cm.connect(userId, "127.0.0.1");

        String returnedIp = cm.getIp(userId);

        assertEquals("IPs didn't match", "127.0.0.1", returnedIp);
    }


}
