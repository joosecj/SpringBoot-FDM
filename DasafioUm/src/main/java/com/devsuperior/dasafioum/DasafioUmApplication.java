package com.devsuperior.dasafioum;

import com.devsuperior.dasafioum.entities.Order;
import com.devsuperior.dasafioum.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DasafioUmApplication implements CommandLineRunner {
    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(DasafioUmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Código do pedido: ");
        Integer code = sc.nextInt();
        System.out.print("Valor produto: ");
        Double basic = sc.nextDouble();
        System.out.print("Desconto: ");
        Double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.println("Pedido código: " + order.getCode());
        System.out.printf("Valor total: %.2f", orderService.total(order));

        sc.close();



    }
}
