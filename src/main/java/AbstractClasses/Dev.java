package AbstractClasses;

public class Dev implements ISpecialty {
    private Title position;
    private String name;

    public Dev (String name, Title position){
        this.name = name;
        this.position = position;
    }
    public Title getPosition(){
        return position;
    }
    public String getName(){
        return name;
    }

}