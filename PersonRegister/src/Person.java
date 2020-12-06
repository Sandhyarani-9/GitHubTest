public class Person {

    private String name;
    private String place;
    private int age;
    private Long phone;

    public Person(String name,String place,int age,Long phone){
        this.name=name;
        this.age=age;
        this.place=place;
        this.phone=phone;
    }
   /* public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }*/
    public void setAge(int age){
        this.age=age;
    }
    public  int getAge() {
        return age;
    }
   /* public void setPlace(String place){
        this.place=place;
    }
    public String getPlace(){
        return place;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }*/


public String ShowPersonInfo(String name){
        String text="Din name är: " +name+ "\nAge : " +age+ "\nPlace : " + place+"\nPhone number är : " + phone;
        return text;
}

}
