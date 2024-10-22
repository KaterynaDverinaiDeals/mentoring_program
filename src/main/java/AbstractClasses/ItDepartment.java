package AbstractClasses;

public class ItDepartment extends Department {
    private Department[] departments;

    public ItDepartment(String name, Department[] departments) {
        super(name);
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    @Override
    public int getAmountOfEmployees() {
        int totalEmployees = 0;
        for (Department dept: departments){
            totalEmployees+=dept.getAmountOfEmployees();
        }
        return totalEmployees;
    }
}

