public class Programmers extends Employees{
    private String programmingLang;
    private String dataBase;

    public Programmers(String name, String email,long phone, String programmingLang, String dataBase) {
        super(name,email,phone);
        this.programmingLang = programmingLang;
        this.dataBase = dataBase;
    }

    @Override
    public void salary() {
        System.out.println("programmers get high salary");
        super.salary();
    }
    public void printData(){
        super.printData();
    System.out.println("programminglang is : "+programmingLang);
    System.out.println("database is : "+dataBase);
}
}
