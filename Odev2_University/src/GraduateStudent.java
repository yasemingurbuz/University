public class GraduateStudent extends AbstractStudent{
    protected String advisor;
    protected String thesis;
    public GraduateStudent(int no, String name, int year, String dob, String major, String advisor){
        super(no, name, year, dob, major);
        this.advisor=advisor;
    }
    @Override
    public void study(){
        super.study();
        writeThesis();
    }

    @Override
    public void register(){
        System.out.println(name+" registered to complete the academic degree.");
    }

    public void writeThesis(){
        meetWithAdvisor();
        System.out.println("The graduate thesis topic is "+thesis);
    }

    public void meetWithAdvisor(){
        System.out.println("Student "+name+" meets with advisor "+advisor+" to write the gruadete thesis.");
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "  no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                ", advisor='" + advisor + '\'' +
                ", thesis='" + thesis + '\'' +
                '}';
    }
}
