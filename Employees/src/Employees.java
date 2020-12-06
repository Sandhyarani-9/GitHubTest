public class Employees {
    private String name;
    private String email;
    private long phone;

    public Employees(String name, String email,long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void salary(){
        System.out.println("Salary of employees created.");
    }

    public void printData(){
        System.out.println("name is : "+name);
        System.out.println("email is : "+email);
        System.out.println("phone is : "+phone);
    }
}
