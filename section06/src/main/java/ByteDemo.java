import com.google.protobuf.ByteString;
import com.section06.models.BytesTest;

public class ByteDemo {
    public static void main(String[] args) {
        byte[] ary = { 0x31, 0x32, 0x33, 0x34, 0x35 };
        ByteString byteString = ByteString.copyFrom(ary);

        BytesTest bytesTest = BytesTest.newBuilder()
                .setDataBytes(byteString)
                .build();

        byte[] bytes = byteString.toByteArray();

        System.out.print("bytes=" + bytes);
    }
}
