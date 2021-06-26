import com.section05.models.Address;
import com.section05.models.BloodType;
import com.section05.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
        Address address = Address.newBuilder()
                .setPostalCode("8120000")
                .setPref("Fukuoka")
                .setCity("Hakata")
                .build();

        Person person = Person.newBuilder()
                .setName("pole")
                .setAge(39)
                .setBloodType(BloodType.BLOOD_TYPE_AB)
                .setAddress(address)
                .addPhones("09011112222")
                .addPhones("09033334444")
                .setCompanyCode("999")
                .putCars(2018,"CX-5")
                .putCars(2020, "Harrier")
                .build();

        System.out.println(person.toString());

        //serialization
        Path path = Paths.get("person.ser");
        Files.write(path, person.toByteArray());

        //deserialization
        byte[] bytes = Files.readAllBytes(path);
        Person newPerson = Person.parseFrom(bytes);

        System.out.println("newPerson =");
        System.out.println(newPerson.toString());
    }
}
