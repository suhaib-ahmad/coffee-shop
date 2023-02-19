package com.onedigital.coffeeshop.service;

import com.onedigital.coffeeshop.dto.CustomerQueueDTO;
import java.util.List;

public interface CoffeeShopQueueService {

  List<CustomerQueueDTO> getCustomersInWaiting();
}
