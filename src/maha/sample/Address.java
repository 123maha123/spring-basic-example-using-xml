package maha.sample;

import org.springframework.beans.factory.annotation.Required;

public class Address {
    private String street;
    private String city;
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet( String street ) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    @Required
    public void setCountry( String country ) {
        this.country = country;
    }
}
