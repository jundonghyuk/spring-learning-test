package nextstep.helloworld.mvc.mapping;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param-header")
public class ParamHeaderController {

//    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> message(@RequestParam(required = false) String name) {
//        return ResponseEntity.ok().body("message");
//    }

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE) //params
    public ResponseEntity<String> messageForParam(@RequestParam(defaultValue = "message") String name) {
        return ResponseEntity.ok().body(name);
    }

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE, headers = "HEADER") //params
    public ResponseEntity<String> messageForHeader() {
        return ResponseEntity.ok().body("hi");
    }
}
