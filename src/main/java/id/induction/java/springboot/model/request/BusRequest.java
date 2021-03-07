package id.induction.java.springboot.model.request;

import lombok.Data;

@Data
public class BusRequest {

    private String name;

    private String number;

    private String destination;

    private int child;

    private int adult;
}
