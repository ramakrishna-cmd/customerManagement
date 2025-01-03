package amex.customerInfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="customer_details")
public class Customer {

    @Id
    private int id;
    private String name;
    private int age;
    private long contactNo;


}
