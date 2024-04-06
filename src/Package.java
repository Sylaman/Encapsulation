public class Package {

    private final double dimensions;
    private final double mass;
    private final String deliveryAddress;
    private final String registrationNumber;
    private final boolean fragile;

    public Package(double dimensions, double mass, String deliveryAddress, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.deliveryAddress = deliveryAddress;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public Package setDimension(double dimensions) {
        return new Package(dimensions, mass, deliveryAddress, registrationNumber, fragile);
    }

    public Package setDeliveryAddress(String deliveryAddress) {
        return new Package(dimensions, mass, deliveryAddress, registrationNumber, fragile);
    }

    public Package setMass(double mass) {
        return new Package(dimensions, mass, deliveryAddress, registrationNumber, fragile);
    }


    public double getDimensions() {
        return dimensions;
    }

    public double getMass() {
        return mass;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }
}
