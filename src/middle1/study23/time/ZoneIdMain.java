package middle1.study23.time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for ( String availableZoneId : ZoneId.getAvailableZoneIds()){
//            System.out.println(availableZoneId);

            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules() + " | " + zoneId.getClass());
        }
        // 내 PC가 사용중인 ZoneId
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

    }

}
