package amex.customerInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {

   @GetMapping("/showall")
   public String showall() {
       return "showall";
   }
}
