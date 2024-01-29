package chapter03;

public class BitMaskingExample {
    public static void main(String[] args) {
        int CAMERA = 1;             // 0 0 0 1   CAMERA: 1
        int WIFI = 1 << 1;          // 0 0 1 0   WIFI: 2
        int FLASH_RIGHT = 1 << 2;   // 0 1 0 0   FLASH RIGHT: 4
        int SD_CARD = 1 << 3;       // 1 0 0 0   SD CARD: 8

        System.out.println(CAMERA);
        System.out.println(WIFI);
        System.out.println(FLASH_RIGHT);
        System.out.println(SD_CARD);

        int phone1 = CAMERA;                                // 0 0 0 1
        int phone2 = CAMERA | WIFI;                         // 0 0 1 1
        int phone3 = CAMERA | WIFI | FLASH_RIGHT | SD_CARD; // 1 1 1 1

        // 0이면 지원하지 않는 것
        boolean p1HasCamera = (phone1 & CAMERA) > 0;        // true

        boolean p2HasCamera = (phone2 & CAMERA) > 0;        // true
        boolean p2HasWifi = (phone2 & WIFI) > 0;

        boolean p3HasCamera = (phone3 & CAMERA) > 0;
    }
}
