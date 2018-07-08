public class Item implements Checkable{
    String id = null;

    Item(){}

    
    public void desc(){}
    public void desc2(){}
    public abstract void interact();
    public void setId(String id){this.id = id;}
    public String getId(){return id;}
}