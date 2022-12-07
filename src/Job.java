public class Job {
    private String profession;
    private String workAddress;

    public Job(String profession, String workAddress) {
        this.profession = profession;
        this.workAddress = workAddress;
    }

    public String getProfession() {
        return profession;
    }

    public String getWorkAddress() {
        return workAddress;
    }
}
