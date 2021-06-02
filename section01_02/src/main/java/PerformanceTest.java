import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sectoin01_02.models.Person;

public class PerformanceTest {
    public static void main(String[] args) {
        //json serialize, desirialize
        JPerson person = new JPerson();
        person.setName("pole");
        person.setAge(39);
        ObjectMapper mapper = new ObjectMapper();

        Runnable json = () -> {
            try{
                byte[] bytes = mapper.writeValueAsBytes(person);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch(Exception e){
                e.printStackTrace();
            }
        };

        //protobuf serialize, desirialize
        Person pole = Person.newBuilder()
                .setName("pole")
                .setAge(39)
                .build();

        Runnable proto = () ->{
            try {
                byte[] bytes = pole.toByteArray();
                Person pole1 = Person.parseFrom(bytes);
            }catch(InvalidProtocolBufferException e){
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + "th:----------");
            runPerformanceTest(json, "JSON");
            runPerformanceTest(proto, "PROTO");
        }
    }

    private static void runPerformanceTest(Runnable runnable, String method){
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();

        System.out.println(method + ":" + (time2 - time1) + "ms");
    }
}
