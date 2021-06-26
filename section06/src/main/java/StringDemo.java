import com.section06.models.StringTest;

public class StringDemo {
    public static void main(String[] args) {
        StringTest stringTest = StringTest.newBuilder()
                .setDataString("hello")
                .build();

        String dataString = stringTest.getDataString();

        System.out.println("dataString=" + dataString);
    }
}
