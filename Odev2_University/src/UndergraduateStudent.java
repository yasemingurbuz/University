public class UndergraduateStudent extends AbstractStudent{
    protected String minor;

    public UndergraduateStudent(int no, String name, int year, String dob, String major, String minor){
        super(no, name, year, dob, major);
        this.minor=minor;
    }

    @Override
    public void study(){
        super.study();
        System.out.println("Minor area: "+minor);
    }

    @Override
    public void register(){
        System.out.println(name+" registered to the academic courses.");
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public String toString() {
        return "Undergraduate Student{" +
                "  no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                "minor='" + minor + '\'' +
                '}';
    }
}
