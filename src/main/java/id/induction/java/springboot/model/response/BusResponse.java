package id.induction.java.springboot.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BusResponse {

    private int status;

    private String message;

    private int totalPassenger;
}
