import java.util.Random;

public class RegistrationOffice {

    public AbstractStudent getAStudent() {
        AbstractStudent student = null;
        Random random = new Random();
        int i = random.nextInt(6);
        switch (i) {
            case 0 -> student = new AbstractStudent(0, "Ebrar", 2026, "11.12.2010", "Language");
            case 1 -> student = new VocationalStudent(0, "Ahmet", 2026, "01.02.2020", "Electronics");
            case 2 -> student = new UndergraduateStudent(1, "Ayşe", 2020, "20.07.2020", "Computer Science", "Java-Backend Developer");
            case 3 -> student = new GraduateStudent(2, "Aslı", 2017, "15.07.1997", "Software Engineering", "Carlos Gsoer");
            case 4 -> student = new MasterStudent(2, "Mehmet", 2017, "15.09.1998", "Mechanical Engineering", "Carlos Gsoer");
            case 5 -> student = new PhdStudent(3, "Elif", 2018, "10.03.1995", "Physics", "Srile Corfs", true);
        }
        return student;
    }

    public void registerStudent(AbstractStudent student) {
        student.register();
    }

    public void printExtraInfo(AbstractStudent student){
        if(student instanceof MasterStudent m){
            m.setThesis("Metaverse");
            String thesisName=m.getThesis();
            System.out.println("Thesis Name: "+thesisName);
        }else if(student instanceof PhdStudent p){
            p.setThesis("Historical Things");
        }else if(student instanceof UndergraduateStudent ug){
            String minor=ug.getMinor();
            System.out.println(student.name+"'s minor area: "+minor);
        }else if(student instanceof VocationalStudent v){
            System.out.println("Vocational faculty is very far away from here.");
        }else if(student instanceof GraduateStudent g){
            System.out.println(student.name+" will graduate this year.");
        }else{
            System.out.println(student.name+" won the university.");
        }
    }
}