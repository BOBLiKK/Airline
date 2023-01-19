public class Main {
    public static void main(String[] args) {

        Airline[] flights = new Airline[5];
        Airline flight1 = new Airline("Egypt", 14, "jet", 12, 21, "Monday");
        flights[0] = flight1;
        Airline flight2 = new Airline("Israel", 14, "jet", 19, 45, "Monday");
        flights[1] = flight2;
        Airline flight3 = new Airline("Egypt", 14, "jet", 12, 21, "Tuesday");
        flights[2] = flight3;
        Airline flight4 = new Airline("Mexico", 14, "jet", 18, 10, "Monday");
        flights[3] = flight4;
        Airline flight5 = new Airline("Egypt", 14, "jet", 12, 21, "Friday");
        flights[4] = flight5;

        AirlinesAgregator result = new AirlinesAgregator(flights);

        result.printInfo();
        result.findFlightsByGivenDestination("Egypt");
        result.findFlightsByGivenWeekday("Monday");
        result.findFlightsByGivenWeekdayAfterExactTime("Monday", 15);
    }
}