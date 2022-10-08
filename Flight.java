package ThiJava1;

public class Flight {
    int number;
    String destination;

    public Flight() {
        this.number = 0;
        this.destination = null;
    }

    public Flight(int number, String destination) {
        try{
            if(number <= 0) {
                System.out.println("\nSố chuyến bay là số duong!");
            }else {
                this.number = number;
                this.destination = destination;
            }
        }catch (Exception e){

        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    void display() {
        System.out.println(getNumber()+", "+getDestination());

    }

}
