package ie.atu.week3yr4b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {
    @PostMapping ("/ProductGet")
    public String productDetails(@RequestBody Product product){
       String getProducts = "Received product details for " + product.getName() + " with an ID of " + product.getId();
        return getProducts;

    }
}
