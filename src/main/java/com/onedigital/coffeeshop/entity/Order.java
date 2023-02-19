package com.onedigital.coffeeshop.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Item name is required")
  private String itemName;

  @Column(precision = 6, scale = 2)
  private BigDecimal itemPrice;

  public Order() {
  }

  public Order(String itemName, BigDecimal itemPrice) {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public BigDecimal getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(BigDecimal itemPrice) {
    this.itemPrice = itemPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(id, order.id) && Objects.equals(itemName, order.itemName)
        && Objects.equals(itemPrice, order.itemPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemName, itemPrice);
  }
}
