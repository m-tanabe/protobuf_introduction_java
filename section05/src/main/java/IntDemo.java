import com.section05.models.IntTest;

public class IntDemo {
    public static void main(String[] args) {
        IntTest intTest = IntTest.newBuilder()
                .setDataInt32(100)
                .setDataInt64(200)
                .setDataUint32(300)
                .setDataUint64(400)
                .setDataSint32(500)
                .setDataSint64(600)
                .setDataFixed32(700)
                .setDataFixed64(800)
                .setDataSfixed32(900)
                .setDataSfixed64(1000)
                .build();

        int  dataInt32 = intTest.getDataInt32();
        long dataUint64 = intTest.getDataUint64();

        System.out.println("dataInt32 = " + dataInt32);
        System.out.println("dataUint32 = " + dataUint64);
    }
}
