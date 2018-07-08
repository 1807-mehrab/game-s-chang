package RoomPackage;
import java.util.Set;
import java.util.HashMap;
import ItemPackage.Item;

public class Room implements Checkable{
    private String id = null;
    private String desc1 = null;
    private String desc2 = null;
    private HashMap<String, Room> exits;

    Room(){}
    Room(String id, String desc1, String desc2){
        this.id = id;
        this.desc1 = desc1;
        this.desc2 = desc2;
        exits = new HashMap<>();
    }

    void setId(String id){this.id = id;}
    String getId(){return id;}

    void getDesc1(){return desc1;}
    void getDesc2(){return desc2;}
}