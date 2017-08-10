import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by adavi on 10.08.2017.
 */
public class WriteObject {

    public static void main(String[] args) {

        Person [] people = {new Person(1,"Mark"),new Person(2,"Oleg"),
                             new Person(3,"Taras"),new Person(1,"Olia")};

        try {
             FileOutputStream fileOutputStream = new FileOutputStream("people.bin");

            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            /**--------------- Запис масиву people як об'єкт ---------------------**/

           /** outputStream.writeObject(people); **/

            /**--------------- Запис масиву people як об'єкт ---------------------**/





            /**------------------ Запис почергово обєктів Person в файл "people.bin" ------------------**/
             outputStream.writeInt(people.length);

            for (Person person : people) {
                outputStream.writeObject(person);

            }
            /**------------------- Запис почергово обєктів Person в файл "people.bin" ------------------**/
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
