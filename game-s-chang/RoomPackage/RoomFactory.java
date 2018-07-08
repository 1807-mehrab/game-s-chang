package RoomPackage;

public class RoomFactory{
    private static RooomFactory rF = null;

    private RoomFactory(){}

    public RoomFactory roomFactory(){
        if(rF == null){rF = new RoomFactory();}
        return rF;
    }

    public Room getNewRoom(String string){
        
    }

}