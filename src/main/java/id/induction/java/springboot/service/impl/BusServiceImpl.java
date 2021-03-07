package id.induction.java.springboot.service.impl;

import id.induction.java.springboot.model.request.BusRequest;
import id.induction.java.springboot.model.response.BusResponse;
import id.induction.java.springboot.service.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {

    private int totalPassenger(int child, int adult){
        return child + adult;
    }

    @Override
    public void responseEmpty(BusRequest request) {
        System.out.println("total passenger = " + totalPassenger(request.getChild(), request.getAdult()));
    }

    @Override
    public ResponseEntity<BusResponse> responseOk(BusRequest request) {
        BusResponse response = BusResponse.builder()
                .status(HttpStatus.OK.value())
                .message(HttpStatus.OK.getReasonPhrase())
                .totalPassenger(totalPassenger(request.getChild(), request.getAdult()))
                .build();
        System.out.println("response = " + response);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BusResponse> responseError(BusRequest request) {
        BusResponse response = BusResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .totalPassenger(totalPassenger(request.getChild(), request.getAdult()))
                .build();
        System.out.println("response = " + response);

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
