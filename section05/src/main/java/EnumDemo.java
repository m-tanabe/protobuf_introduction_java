import com.section05.models.BloodType;
import com.section05.models.Person;

public class EnumDemo {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .setBloodType(BloodType.BLOOD_TYPE_A)
                .build();

        BloodType bloodType = person.getBloodType();

        System.out.println("bloodType=" + bloodType);
    }
}
