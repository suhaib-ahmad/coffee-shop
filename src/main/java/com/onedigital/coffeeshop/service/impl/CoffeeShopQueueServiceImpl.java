package com.onedigital.coffeeshop.service.impl;

import com.onedigital.coffeeshop.dto.CustomerQueueDTO;
import com.onedigital.coffeeshop.repository.CoffeeShopQueueRepository;
import com.onedigital.coffeeshop.service.CoffeeShopQueueService;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoffeeShopQueueServiceImpl implements CoffeeShopQueueService {

  private final CoffeeShopQueueRepository queueRepository;

  public CoffeeShopQueueServiceImpl(
      CoffeeShopQueueRepository queueRepository) {
    this.queueRepository = queueRepository;
  }

  @Override
  public List<CustomerQueueDTO> getCustomersInWaiting() {
    return queueRepository.getCustomersInQueue();
  }
}
