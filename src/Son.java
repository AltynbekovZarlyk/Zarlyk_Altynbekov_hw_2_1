public class Son extends Father {
    private String hobby;

    public Son(int age, String name, Job job, HairColor color, String hobby) {
        super(age, name, job, color);
        this.hobby = hobby;
    }

    @Override
    public String getInfo() {
        return "Age: " + getAge() +
                "\nName: " + getName() + " (son)" +
                "\nJob: " + getJob().getProfession() +
                "\nAddress: " + getJob().getWorkAddress() +
                "\nHair color: " + this.getColor() +
                "\nHobby: " + hobby;
    }
}
