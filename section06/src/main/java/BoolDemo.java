import com.section06.models.BoolTest;

public class BoolDemo {
    public static void main(String[] args) {
        BoolTest boolTest = BoolTest.newBuilder()
                .setDataBool(true)
                .build();

        boolean dataBool = boolTest.getDataBool();

        System.out.println("dataBool=" + dataBool);
    }
}
