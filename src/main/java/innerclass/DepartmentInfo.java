package innerclass;

public class DepartmentInfo {
    int id;

    // Static inner class Dev
    public static class Dev {
        private String name;
        private String programmingLanguage;
        private String yearsOfExperience;

        public Dev() {
            name = "Ivan";
            programmingLanguage = "Java";
            yearsOfExperience = "10";
        }
        // Static method to print information about class
        public static void printInfo() {
            System.out.println("Dev department: \nResponsible for software development, including designing," +
                    "coding, and maintaining applications.");

        }

        @Override
        public String toString() {
            return String.format("Dev department:\nName: %s, Programming Language: %s, Years Of Experience: " +
                    "%s\n===============================", name, programmingLanguage, yearsOfExperience);
        }
    }
    // Static inner class QA
    public static class QA {
        private String name;
        private String testingTool;
        private String yearsOfExperience;

        public QA() {
            name = "Yana";
            testingTool = "TestRail";
            yearsOfExperience = "3";
        }
        // Static method to print information about class
        public static void printInfo() {
            System.out.println("QA department: \nResponsible for testing and ensuring the quality of the software.");
        }

        @Override
        public String toString() {
            return String.format("QA department:\nName: %s, Testing Tool: %s, Years Of Experience: " +
                            "%s\n===============================",name, testingTool, yearsOfExperience);
        }
    }
    // Static inner class DevOps
    public static class DevOps {
        private String name;
        private String tool;
        private String yearsOfExperience;

        public DevOps() {
            name = "Roman";
            tool = "Docker";
            yearsOfExperience = "4";
        }
        // Static method to print information about class
        public static void printInfo() {
            System.out.println("DevOps department: \nManages infrastructure, deployment, and automation tools.");
        }

        @Override
        public String toString() {
            return String.format("Devops department:\nName: %s, Tool: %s, Years Of Experience: %s",
                    name, tool, yearsOfExperience);
        }
    }


    public static void main(String[] args) {
        DepartmentInfo.Dev developer = new DepartmentInfo.Dev();
        System.out.println(developer.toString());

        DepartmentInfo.QA qaEngineer = new DepartmentInfo.QA();
        System.out.println(qaEngineer.toString());

        DepartmentInfo.DevOps devOpsEngineer = new DepartmentInfo.DevOps();
        System.out.println(devOpsEngineer.toString());
    }
}

//    public static void main(String[] args) {
//        DepartmentInfo.Dev.printInfo();
//        DepartmentInfo.QA.printInfo();
//        DepartmentInfo.DevOps.printInfo();
//    }
//}
