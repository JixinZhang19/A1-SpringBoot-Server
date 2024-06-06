package skier;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Rebecca Zhang
 * Created on 2024-06-06
 */
@RestController
@RequestMapping("/skiers")
public class SkierController {

    @PostMapping("/{resortID}/seasons/{seasonID}/days/{dayID}/skiers/{skierID}")
    public ResponseEntity<SkierOutDto> writeLiftRide(@RequestBody SkierInDto skierInDto,
                                                     @PathVariable("resortID") Integer resortID,
                                                     @PathVariable("seasonID") String seasonID,
                                                     @PathVariable("dayID") String dayID,
                                                     @PathVariable("skierID") Integer skierID) {

        if (skierInDto.getTime() == null || skierInDto.getLiftID() == null) {
            return new ResponseEntity<>(new SkierOutDto("Invalid inputs"), HttpStatus.BAD_REQUEST);
        }
        int day = Integer.parseInt(dayID);
        if (day < 1 || day > 366) {
            return new ResponseEntity<>(new SkierOutDto("Invalid inputs"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new SkierOutDto("Write successful"), HttpStatus.CREATED);
    }

}
