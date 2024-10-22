package AbstractClasses;

public class QA implements ISpecialty {
    private Title position;
    private String name;

    public QA (String name, Title position){
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
