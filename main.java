package ThiJava1;

public class main {
    public static void main(String[] args){
        Bank bk = new Bank(1000,10);
        System.out.printf("$ %.2f",bk.calculateInterest());

        Flight fl = new Flight(0,"Duong");
        Flight fl1 = new Flight(857, "Toronto");

        fl.display();
        fl1.display();
    }
}
