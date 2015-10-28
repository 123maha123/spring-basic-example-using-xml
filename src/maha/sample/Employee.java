package maha.sample;

import java.util.Date;

public class Employee {
    private String empId;
    private String empName;
    private Address address;
    private Date dateOfJoining;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId( String empId ) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName( String empName ) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress( Address address ) {
        this.address = address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining( Date dateOfJoining ) {
        this.dateOfJoining = dateOfJoining;
    }

}
