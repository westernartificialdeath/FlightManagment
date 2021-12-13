public class Flight {
    private String destination;
    private int flightNumber;
    private Types flightType;

    public String getDestination()  {
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

    public Types getFlightType() {
        return flightType;
    }

    public void setFlightType(Types flightType) {
        this.flightType = flightType;
    }

    public Flight(String destination, int flightNumber, Types flightType) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightType = flightType;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", flightType=" + flightType +
                '}';
    }

    public Flight(String destination, int flightNumber) {
        this.destination = destination;
        this.flightNumber = flightNumber;
    }
}
