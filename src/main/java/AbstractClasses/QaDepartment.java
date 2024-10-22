package AbstractClasses;


public class QaDepartment extends ItDepartment {
    private QA[] qas;

    public QaDepartment(String name, QA[] qas) {
        super(name, null);
        this.qas = qas;
    }

    @Override
    public int getAmountOfEmployees() {
        return qas.length;
    }

    public QA[] getQas() {
        return qas;
    }

    // Returns string representation of QaDepartment.
    // Includes the department name and details of each QA employee (name and position).
    // Return String with department name and QA employee details.

    @Override
    public String toString() {
        String result = getName() + "\n";
        for (QA qa : qas) {
            result += "QA Employee name: " + qa.getName() + ", Position: " + qa.getPosition() + "\n";
        }
        return result;
    }
}
