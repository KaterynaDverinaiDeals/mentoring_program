package innerclass;
//Create the class Department. Create inner static classes Dev, QA, DevOps. Add any fields to your inner classes

public class Department {
    int id;

    // Static inner class Dev
    public static class Dev {
        private String name;
        private String programmingLanguage;
        private String yearsOfExperience;

        public Dev() {
            this.name = "Ivan";
            this.programmingLanguage = "Java";
            this.yearsOfExperience = "10";
        }

        @Override
        public String toString() {
            return String.format("Name: %s, Programming Language: %s, Years Of Experience: %s", name, programmingLanguage, yearsOfExperience);
        }
    }

    public static class QA {
        private String name;
        private String testingTool;
        private String yearsOfExperience;

        public QA() {
            this.name = "Yana";
            this.testingTool = "TestRail";
            this.yearsOfExperience = "3";
        }

        @Override
        public String toString() {
            return String.format("Name: %s, Testing Tool: %s, Years Of Experience: %s", name, testingTool, yearsOfExperience);
        }
    }

    public static class DevOps {
        private String name;
        private String tool;
        private String yearsOfExperience;

        public DevOps() {
            this.name = "Roman";
            this.tool = "Docker";
            this.yearsOfExperience = "4";
        }

        @Override
        public String toString() {
            return String.format("Name: %s, Tool: %s, Years Of Experience: %s", name, tool, yearsOfExperience);
        }
    }


    public static void main(String[] args) {
        Department.Dev developer = new Department.Dev();
        System.out.println(developer);

        Department.QA engineer = new Department.QA();
        System.out.println(engineer);

        Department.DevOps devOpsEngineer = new Department.DevOps();
        System.out.println(devOpsEngineer);
    }
}

