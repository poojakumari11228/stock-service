package stock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductInStockQuantity(@PathVariable("id") long id){
        return new ResponseEntity<>(1000L, HttpStatus.OK); // static data
    }

}
