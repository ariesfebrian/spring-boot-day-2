package id.induction.java.springboot.service;

import id.induction.java.springboot.model.request.BusRequest;
import id.induction.java.springboot.model.response.BusResponse;
import org.springframework.http.ResponseEntity;

public interface BusService {

    void responseEmpty(BusRequest request);

    ResponseEntity<BusResponse> responseOk(BusRequest request);

    ResponseEntity<BusResponse> responseError(BusRequest request);
}
