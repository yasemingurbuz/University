public class PhdStudent extends GraduateStudent{
    private boolean qualifyingExamTake;

    public PhdStudent(int no, String name, int year, String dob, String major,
                      String advisor, boolean qualifyingExamTake) {
        super(no, name, year, dob, major, advisor);
        this.qualifyingExamTake = qualifyingExamTake;
    }

    @Override
    public void study() {
        super.study();
        writePaper();
    }

    @Override
    public void register() {
        System.out.println(name + " registered to the PhD degree.");
    }

    @Override
    public void writeThesis() {
        meetWithAdvisor();
        System.out.println("The PhD thesis topic is " + thesis);
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Student " + name + " meets with advisor " + advisor + " to write the PhD thesis.");
    }

    public void writePaper() {
        System.out.println("PhD student writes paper.");
    }

    public boolean isQualifyingExamTake() {
        return qualifyingExamTake;
    }

    public void setQualifyingExamTake(boolean qualifyingExamTake) {
        this.qualifyingExamTake = qualifyingExamTake;
    }

    @Override
    public String toString() {
        return "PhdStudent{" +
                "  no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                ", advisor='" + advisor + '\'' +
                ", thesis='" + thesis + '\'' +
                "qualifyingExamTake=" + (isQualifyingExamTake() ? "Yes" : "No") +
                '}';
    }
}
