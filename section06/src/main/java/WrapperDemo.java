import com.google.protobuf.Int32Value;
import com.section06.models.IntTest;
import com.section06.models.WrapperIntTest;

public class WrapperDemo {
    public static void main(String[] args) {
        IntTest intTest = IntTest.newBuilder()
                //.setDataInt32(100)  ← デフォルト値の0がセットされる
                .build();
        // getDataInt32()は0が返るが、未セットなのか？ 意図して"0"がセットされているのか？　わからない
        long dataInt32 = intTest.getDataInt32();

        System.out.println("dataInt32="+ dataInt32);

        WrapperIntTest wrapperIntTest = WrapperIntTest.newBuilder()
                //.setDataInt32(100)
                .setDataCint32(Int32Value.newBuilder().setValue(100).build())
                .build();

        if (wrapperIntTest.hasDataCint32() == false) {
            System.out.println("not set");
        }else{
            System.out.println("set");
        }
    }
}
