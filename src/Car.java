import java.time.LocalDate;

public class Car {
    private String lpn;
    private int power;
    static double quotient = 1;
    private int year;

    public Car(String lpn, int power, int year){
        this.lpn = lpn;
        this.power = power;
        this.year = year;
    }

    public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static double getQuotient() {
        return quotient;
    }

    public static void setQuotient(double quotient) {
        Car.quotient = quotient;
    }

    public double taxes() {
        if (quotient != 0){
            return (power * quotient - (LocalDate.now().getYear() - year) / quotient);
        }else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "The taxes to pay for car with license plate number " + getLpn() + " issued in " + getYear()
                + " with power " +getPower() + " are " + taxes();
    }
}
