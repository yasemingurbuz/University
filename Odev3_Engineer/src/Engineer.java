public abstract class Engineer {
    protected String name;
    protected int age;

    public Engineer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void work();
}

