package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะ-ร" (what,  ถภม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อน-ข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * ค้นหา key แรกที่เจอ ในอาเรย์ 
     * @param arr arr ที่ใช้ค้นหา ไม่เท่ากับ Null
     * @param key ค่าที่ต้องการหา
     * @return คืนค่าตำแหน่งแรกที่ พบใน key หากไม่พบ -1
     * @throws IllgalArgumentException ถ้า arr = null
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     *  คำนวนหาพื้นที่วงกลมจากรัศมี
     * @throws IllgalArgumentException ถ้า รัศมี  <0
     * @param radius ต้อง >=0
     * @return พื้นที่วงกลมที่คำนวนได้
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
    /**
     * ตัดช่องว่างหน้าหลัง และเเปลงเป็นพิมเล็ก
     * @param s ข้อความที่ต้องการปรับรูปแบบ
     * @return ข้อความที่ปรับรูปแบบแล้ว หรือ "" ถ้า input เป็น null
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
