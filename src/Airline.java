public class Airline {

    private String destination;
    private int flightNumber;
    private String typeofAircraft;
    private int hourOfDeparture;
    private int minuteOfDeparture;
    private String dayOfTheWeek;

    public Airline(){
        this.destination = "";
        this.flightNumber = 0;
        this.typeofAircraft = "";
        this.hourOfDeparture = 0;
        this.minuteOfDeparture = 0;
        this.dayOfTheWeek = "";

    }

    public Airline(String destination, int flightNumber, String typeofAircraft, int hourOfDeparture, int minuteOfDeparture, String dayOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeofAircraft = typeofAircraft;
        if(hourOfDeparture < 0 || hourOfDeparture > 23){
            this.hourOfDeparture = 0;
        }else{
            this.hourOfDeparture = hourOfDeparture;
        }

        if(minuteOfDeparture < 0 || minuteOfDeparture > 59){
            this.minuteOfDeparture = 0;
        }else{
            this.minuteOfDeparture = minuteOfDeparture;
        }
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeofAircraft() {
        return typeofAircraft;
    }

    public void setTypeofAircraft(String typeofAircraft) {
        this.typeofAircraft = typeofAircraft;
    }

    public int getHourOfDeparture() {
        return hourOfDeparture;
    }

    public void setHourOfDeparture(int hourOfDeparture) {
        this.hourOfDeparture = hourOfDeparture;
    }

    public int getMinuteOfDeparture() {
        return minuteOfDeparture;
    }

    public void setMinuteOfDeparture(int minuteOfDeparture) {
        this.minuteOfDeparture = minuteOfDeparture;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public void printTime(){
        System.out.print("Time of departure is: ");
        if(getHourOfDeparture() < 10){
            System.out.print("0" + getHourOfDeparture() + ":");
        }else{
            System.out.print(getHourOfDeparture() + ":");
        }
        if(getMinuteOfDeparture() < 10){
            System.out.println("0" + getMinuteOfDeparture());
        }else{
            System.out.println(getMinuteOfDeparture());
        }
    }

    public void prtintAirlineInformation(){
        System.out.println("Airline's information:");
        System.out.println("Aircraft's destination: " + getDestination());
        System.out.println("Aircraft's flight number: " + getFlightNumber());
        System.out.println("Aircraft's type: " + getTypeofAircraft());
        printTime();
        System.out.println("Day of the week: " + getDayOfTheWeek());
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Airline airline)) {
            return false;
        }

        if (getFlightNumber() != airline.getFlightNumber()) {
            return false;
        }
        if (getHourOfDeparture() != airline.getHourOfDeparture()) {
            return false;
        }
        if (getMinuteOfDeparture() != airline.getMinuteOfDeparture()) {
            return false;
        }
        if (getDestination() != null ? !getDestination().equals(airline.getDestination()) : airline.getDestination() != null) {
            return false;
        }
        if (getTypeofAircraft() != null ? !getTypeofAircraft().equals(airline.getTypeofAircraft()) : airline.getTypeofAircraft() != null) {
            return false;
        }
        return getDayOfTheWeek() != null ? getDayOfTheWeek().equals(airline.getDayOfTheWeek()) : airline.getDayOfTheWeek() == null;
    }

    @Override
    public int hashCode() {
        int result = getDestination() != null ? getDestination().hashCode() : 0;
        result = 31 * result + getFlightNumber();
        result = 31 * result + (getTypeofAircraft() != null ? getTypeofAircraft().hashCode() : 0);
        result = 31 * result + getHourOfDeparture();
        result = 31 * result + getMinuteOfDeparture();
        result = 31 * result + (getDayOfTheWeek() != null ? getDayOfTheWeek().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeofAircraft='" + typeofAircraft + '\'' +
                ", hourOfDeparture=" + hourOfDeparture +
                ", minuteOfDeparture=" + minuteOfDeparture +
                ", dayOfTheWeek='" + dayOfTheWeek + '\'' +
                '}';
    }
}
