package javaeetutorial;

import javaeetutorial.order.entity.CustomerOrder;
import javaeetutorial.order.repository.CustomerOrderRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController implements InitializingBean {

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    @PostMapping
    public ResponseEntity<CustomerOrder> createOrder() {
        CustomerOrder order = new CustomerOrder(1, 's', 5, "Zonneweide");

        final CustomerOrder customerOrder = customerOrderRepository.save(order);

        return ResponseEntity.ok(customerOrder);

    }

    @GetMapping("")
    public ResponseEntity<CustomerOrder> getOrder() {

        CustomerOrder order = new CustomerOrder(1, 's', 5, "Zonneweide");

        final CustomerOrder customerOrder = customerOrderRepository.save(order);

        return ResponseEntity.ok(customerOrder);
    }

    @Override
    public void afterPropertiesSet() throws Exception {


        System.out.println("YESSSS. OrderController created");
    }
}
