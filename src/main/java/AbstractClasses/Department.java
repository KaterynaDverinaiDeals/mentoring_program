package AbstractClasses;

public abstract class Department {
    //The "name" field is protected so that it can be accessed directly by subclasses,
    // but not from outside this class or its package
    protected String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getAmountOfEmployees();
}


// TODO: implement method tostring