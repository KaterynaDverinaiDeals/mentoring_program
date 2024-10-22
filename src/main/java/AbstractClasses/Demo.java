package AbstractClasses;

public class Demo {
    public static void main(String[] args) {
        QA[] qas = {
                new QA("Milan", Title.JUNIOR),
                new QA("Elena", Title.MIDDLE),
                new QA("Majda", Title.JUNIOR)
        };

        Dev[] devs = {
                new Dev("Alex", Title.SENIOR),
                new Dev("Ivan", Title.TECH_LEAD),
                new Dev("John", Title.MANAGER)
        };
        // Create QaDepartment and DevDepartment
        QaDepartment qaDepartment = new QaDepartment("QA Department", qas);
        DevDepartment devDepartment = new DevDepartment("Dev Department", devs);

        // Add departments to ItDepartment
        Department[] departments = {qaDepartment, devDepartment};
        ItDepartment itDepartment = new ItDepartment("IT Department", departments);

        // Print IT Department info
        printItDepartmentInfo(itDepartment);
    }

    public static void printItDepartmentInfo(ItDepartment itDepartment) {
        System.out.println(itDepartment.getName());
        System.out.println("Total Employees in IT Department: " + itDepartment.getAmountOfEmployees());

        // Iterate through each department in the IT Department
        for (Department dept : itDepartment.getDepartments()) {
            System.out.println(dept.getName());
            // Print total number of employees in the IT Department
            System.out.println("Number of employees: " + dept.getAmountOfEmployees());
            System.out.println(dept.toString());
        }
    }
}


//            // Iterate through each department in the IT Department
//            if (dept instanceof QaDepartment) {
//                QaDepartment QaDept = (QaDepartment) dept;
//                for (QA qa : QaDept.getQas()) {
//                    System.out.println("QA Employee name: " + qa.getName() + ", Position " + qa.getPosition());
//                }
//            }
//
//            if (dept instanceof DevDepartment) {
//                DevDepartment devDept = (DevDepartment) dept;
//                for (Dev dev : devDept.getDevs()) {
//                    System.out.println("Dev Employee name: " + dev.getName() + ", Position " + dev.getPosition());

