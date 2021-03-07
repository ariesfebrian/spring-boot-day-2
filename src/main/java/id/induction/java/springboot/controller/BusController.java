package id.induction.java.springboot.controller;

import id.induction.java.springboot.model.request.BusRequest;
import id.induction.java.springboot.model.response.BusResponse;
import id.induction.java.springboot.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    @Autowired
    BusService busService;

    @GetMapping("/{name}")
    public String name(@PathVariable String name){
        return "Bus Name : " + name;
    }

    @GetMapping("/nama/{busName}")
    public String number(@PathVariable String busName, @RequestParam("nomor") String number){
        return "Bus Name : " + busName + " and Bus Number: " + number;
    }

    @PostMapping("/response/empty")
    public void busResponseEmpty(@RequestBody BusRequest request){
        busService.responseEmpty(request);
    }

    @PostMapping("/response/ok")
    public ResponseEntity<BusResponse> busResponseOk(@RequestBody BusRequest request){
        return busService.responseOk(request);
    }

    @PostMapping("/response/error")
    public ResponseEntity<BusResponse> busResponseError(@RequestBody BusRequest request){
        return busService.responseError(request);
    }
}
