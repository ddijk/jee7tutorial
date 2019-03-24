package javaeetutorial.rest;

import javaeetutorial.order.entity.CustomerOrder;
import javaeetutorial.order.repository.CustomerOrderRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController implements InitializingBean {

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    @GetMapping("/aap")
    public String aap() {
        return "aap";
    }
    @GetMapping("/{id}")
    public ResponseEntity<CustomerOrder> getUser(@PathVariable("id") String id) {

        final Optional<CustomerOrder> user = customerOrderRepository.findById(Integer.valueOf(id));


        return user.map(co -> ok(co)).orElse(notFound());
    }

    private ResponseEntity<CustomerOrder> notFound() {
        return ResponseEntity.notFound().build();
    }

    private ResponseEntity<CustomerOrder> ok(CustomerOrder co) {
        return ResponseEntity.ok(co);
    }

    @GetMapping
    public ResponseEntity<List<CustomerOrder>> getAllUsers() {

        final List<CustomerOrder> users = customerOrderRepository.findAll();

        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<CustomerOrder> createUser(@RequestBody CustomerOrder user) {

        customerOrderRepository.save(user);
        return ResponseEntity.ok(user);

    }

    @Override
    public void afterPropertiesSet() throws Exception {


        System.out.println("USERCONTROLLER");
    }
}
