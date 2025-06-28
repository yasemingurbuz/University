public class MasterStudent extends GraduateStudent{
    public MasterStudent(int no, String name, int year, String dob, String major, String advisor) {
        super(no, name, year, dob, major, advisor);
    }

    @Override
    public void register() {
        System.out.println(name + " registered to the master degree.");
    }

    @Override
    public void writeThesis() {
        meetWithAdvisor();
        System.out.println("The master thesis topic is " + thesis);
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Student " + name + " meets with advisor " + advisor + " to write the master thesis.");
    }

    @Override
    public String toString() {
        return "MasterStudent{" +
                "  no=" + no +'\n'+
                ", name='" + name + '\n' +
                ", year=" + year +'\n'+
                ", dob=" + dob +'\n'+
                ", major='" + major + '\n' +
                ", advisor='" + advisor + '\n' +
                ", thesis='" + thesis +
                '}';
    }
}
