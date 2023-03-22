public class student {

    private String id;
    private String name;
    private String dateofbirth;
    private String classList;

    public student(String id, String name, String dateofbirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.classList = classList;

    }

    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
