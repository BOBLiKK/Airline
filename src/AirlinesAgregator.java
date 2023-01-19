public class AirlinesAgregator {

    private int amount;
    Airline[] airline;

    public AirlinesAgregator(Airline[] ourAirline){
        this.amount = ourAirline.length;
        airline = new Airline[amount];

        for(int i = 0; i < this.amount; i++){
            this.airline[i] = ourAirline[i];
        }
    }

    public int getAmount() {
        return amount;
    }

    public void findFlightsByGivenDestination(String destination){
        System.out.println("Flights to " + destination + ":");
        for(int i = 0; i < getAmount(); i++){
            if(airline[i].getDestination().compareTo(destination) == 0){
                airline[i].prtintAirlineInformation();
            }
        }
    }

    public void findFlightsByGivenWeekday(String weekday){
        System.out.println("Flights on " + weekday + ":");
        for(int i = 0; i < getAmount(); i++){
            if(airline[i].getDayOfTheWeek().compareTo(weekday) == 0){
                airline[i].prtintAirlineInformation();
            }
        }
    }

    public void findFlightsByGivenWeekdayAfterExactTime(String weekday, int breakPointHour){
        System.out.println("Flights on " + weekday +  " after " +  breakPointHour + " o'clock:");
        for(int i = 0; i < getAmount(); i++){
            if(airline[i].getDayOfTheWeek().compareTo(weekday) == 0 && airline[i].getHourOfDeparture() >= breakPointHour){
                airline[i].prtintAirlineInformation();
            }
        }
    }

    public void printInfo(){
        for(int i = 0; i < this.amount; i++){
            airline[i].prtintAirlineInformation();
        }
    }
}
