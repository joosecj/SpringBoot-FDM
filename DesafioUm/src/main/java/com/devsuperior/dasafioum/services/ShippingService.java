package com.devsuperior.dasafioum.services;

import com.devsuperior.dasafioum.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        Double shipping = 0.0;
        if (order.getBasic() < 100.0) {
            shipping = 20.0;
        } else if (order.getBasic() <= 200.0) {
            shipping = 12.0;
        }
        return shipping;
    }
}
