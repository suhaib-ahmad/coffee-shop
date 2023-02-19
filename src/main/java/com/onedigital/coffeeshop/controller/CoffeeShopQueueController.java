package com.onedigital.coffeeshop.controller;

import com.onedigital.coffeeshop.dto.CustomerQueueDTO;
import com.onedigital.coffeeshop.service.CoffeeShopQueueService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee-shop")
public class CoffeeShopQueueController {

  private final CoffeeShopQueueService queueService;

  public CoffeeShopQueueController(
      CoffeeShopQueueService queueService) {
    this.queueService = queueService;
  }

  @GetMapping("/queue/customers")
  public ResponseEntity<List<CustomerQueueDTO>> getCustomersInWaiting() {
    List<CustomerQueueDTO> queueSlots = queueService.getCustomersInWaiting();
    return ResponseEntity.ok(queueSlots);
  }
}
