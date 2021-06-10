package dto;

/*
    implementasi inner class
 */
public class Company {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    ini adalah inner class
    public class Employee {
        private String name;

//        mengacu ke company
        public String getCompany(){
           return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
