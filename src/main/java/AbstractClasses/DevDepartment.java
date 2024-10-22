package AbstractClasses;


public class DevDepartment extends ItDepartment {
    private Dev[] devs;

    public DevDepartment(String name, Dev[] devs) {
        super(name, null);
        this.devs = devs;
    }

    @Override
    public int getAmountOfEmployees() {
        return devs.length;
    }

    public Dev[] getDevs() {
        return devs;
    }

    //Returns string representation of the DevDepartment.
    // Includes department name and details of each developer (name and position).
    // Return String with department name and developer details.
    @Override
    public String toString() {
        String result = getName() + "\n";
        for (Dev dev : devs) {
            result += "Dev Employee name: " + dev.getName() + ", Position: " + dev.getPosition() + "\n";
        }
        return result;
    }
}
