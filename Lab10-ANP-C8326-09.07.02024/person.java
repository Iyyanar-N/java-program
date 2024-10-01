import address1.Address;
import employ.Employment;
import personal.PersonalDetails;

public class Person {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Gandhi Nagar", "Vanur", "62701");
        Employment employment = new Employment("Tech Corp", "Software Engineer", 120000);
        PersonalDetails personalDetails = new PersonalDetails("John", "Doe", 30, address, employment);

        System.out.println(personalDetails);
    }
}
//personal details
package personal;

import address1.Address;
import employ.Employment;

public class PersonalDetails {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private Employment employment;

    public PersonalDetails(String firstName, String lastName, int age, Address address, Employment employment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.employment = employment;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    
    public String toString() {
        return "PersonalDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", employment=" + employment +
                '}';
    }
}
//address class
package address1;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters and Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
//employ class
package employ;

public class Employment {
    private String companyName;
    private String jobTitle;
    private double salary;

    public Employment(String companyName, String jobTitle, double salary) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
