public class MultiTalentedEngineer extends Engineer implements Blogger,InstrumentPlayer,JavaDeveloper,Parent,TeamFan{
    public MultiTalentedEngineer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(name + " is working on software projects.");
    }

    @Override
    public void writeBlog() {
        System.out.println(name + " is writing a tech blog.");
    }

    @Override
    public void takeCareOfChildren() {
        System.out.println(name + " is taking care of children.");
    }

    @Override
    public void cheerTeam() {
        System.out.println(name + " is cheering for their football team.");
    }

    @Override
    public void playInstrument() {
        System.out.println(name + " is playing the guitar.");
    }

    @Override
    public void codeInJava() {
        System.out.println(name + " is coding in Java.");
    }
}
