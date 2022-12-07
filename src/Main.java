public class Main {
    public static void main(String[] args) {
        Job job = new Job("Driver","Manasa 145");
        Father father = new Father(45,"Pavel",job,HairColor.BLACK);
        System.out.println(father.getInfo());
        father.salary();
        father.salary(String.valueOf(40000));
        System.out.println("--------------------");
        Job job1 = new Job("Programmer","Sovetskaya 45");
        Son son = new Son(25,"Aleksei",job,HairColor.BLUE,"Football");
        System.out.println(son.getInfo());
        son.salary();
        son.salary(String.valueOf(56000));
        System.out.println("--------------------");
        Job job2 = new Job("Journalist","Frunze 88");
        Son son1 = new Son(27,"Mihail",job,HairColor.WHITE,"Play computer games");
        System.out.println(son1.getInfo());
        son1.salary();
        son1.salary(String.valueOf(28000));
    }
}