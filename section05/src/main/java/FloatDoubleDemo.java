import com.section05.models.FloatDoubleTest;

public class FloatDoubleDemo {
    public static void main(String[] args) {
        FloatDoubleTest floatDoubleTest = FloatDoubleTest.newBuilder()
                .setDataFloat(1.0f)
                .setDataDouble(2.0)
                .build();

        float dataFloat = floatDoubleTest.getDataFloat();
        double dataDouble = floatDoubleTest.getDataDouble();

        System.out.println("dataFloat=" + dataFloat);
        System.out.println("dataDouble=" + dataDouble);

    }
}
