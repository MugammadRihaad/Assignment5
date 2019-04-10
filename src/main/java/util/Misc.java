package util;
import java.util.UUID;
public class Misc {
    public static double generatedId(){
        return Double.parseDouble(UUID.randomUUID().toString());
    }
}
