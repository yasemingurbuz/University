public class VocationalStudent extends Student{
    public VocationalStudent(int no, String name, int year, String dob, String major){
        super(no,name,year,dob,major);
    }
    @Override
    public void study(){
        System.out.println("Vocational student "+name+ "is studying.");
    }

    @Override
    public void register(){
        System.out.println(name+" registered to the vocational courses.");
    }
    @Override
    public String toString() {
        return "Vocational Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
