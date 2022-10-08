public class CourseName {
    private String name;

    public static CourseName instance = new CourseName();

    public static CourseName getInstance() {
        return instance;
    }




    private CourseName(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
