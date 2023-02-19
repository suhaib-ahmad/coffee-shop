package com.onedigital.coffeeshop.dto;

import lombok.Data;

@Data
public class CustomerQueueDTO {

  private Long customerId;
  private String customerName;
  private Long orderId;
  private Long queuePosition;
}
