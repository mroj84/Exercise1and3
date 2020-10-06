package util;

import java.util.UUID;

public class StringUtil {
    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }
}
