public class Programmer extends Contact{
private String language;
private String database;

public Programmer(String name,String phoneNumber,String language,String database){
super(name,phoneNumber);
this.language=language;
this.database=database;
}

    public String getLanguage() {
        return language;
    }

    public String getDatabase() {
        return database;
    }
}
