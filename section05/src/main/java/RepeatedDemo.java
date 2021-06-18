import com.google.protobuf.ProtocolStringList;
import com.section05.models.PhonesData;

import java.util.ArrayList;

public class RepeatedDemo {
    public static void main(String[] args) {
        // set add pattern
        PhonesData phones = PhonesData.newBuilder()
                .addPhones("090-1234-5678")
                .addPhones("090-9999-1111")
                .build();

        // set add all pattern
        ArrayList<String> phoneList = new ArrayList<String>();
        phoneList.add("080-1111-2222");
        phoneList.add("080-3333-4444");

        PhonesData phones2 = PhonesData.newBuilder()
                .addAllPhones(phoneList)
                .build();

        // get select index pattern
        String phone1 = phones.getPhones(0);
        String phone2 = phones.getPhones(1);

        // get loop pattern
        ProtocolStringList stringList = phones.getPhonesList();
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
