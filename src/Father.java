public class Father extends GrandFather {
    private int age;
    private String name;

    public Father(int age, String name, Job job, HairColor color) {
        this.age = age;
        this.name = name;
        super.setJob(job);
        super.setColor(color);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return "Age: " + getAge() +
                "\nName: " + getName() + " (father)" +
                "\nJob: " + getJob().getProfession() +
                "\nAddress: " + getJob().getWorkAddress() +
                "\nHair color: " + this.getColor();
    }

    public void salary() {
        System.out.println("Оклад: 35000");
    }

    public int salary(String salary) {
        System.out.println("Получил: " + salary);
        return 0;
    }
}
