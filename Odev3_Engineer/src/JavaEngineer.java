public class JavaEngineer extends Engineer implements JavaDeveloper {
    public JavaEngineer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(name + " is developing backend systems.");
    }

    @Override
    public void codeInJava() {
        System.out.println(name + " is proficient in Java.");
    }
}
