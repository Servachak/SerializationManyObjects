import java.io.Serializable;

/**
 * Created by adavi on 07.08.2017.
 */
public class Person implements Serializable{

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
