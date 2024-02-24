package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrancyConversion {

  private Long id;
  private String from;
  private String to;
  private BigDecimal quantity;
  private BigDecimal converionMultiple;
  private BigDecimal totalCalculatedAmount;
  private String environment;

  public CurrancyConversion() {}

  public CurrancyConversion(
    Long id,
    String from,
    String to,
    BigDecimal quantity,
    BigDecimal converionMultiple,
    BigDecimal totalCalculatedAmount,
    String environment
  ) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.quantity = quantity;
    this.converionMultiple = converionMultiple;
    this.totalCalculatedAmount = totalCalculatedAmount;
    this.environment = environment;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public BigDecimal getConverionMultiple() {
    return converionMultiple;
  }

  public void setConverionMultiple(BigDecimal converionMultiple) {
    this.converionMultiple = converionMultiple;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public BigDecimal getTotalCalculatedAmount() {
    return totalCalculatedAmount;
  }

  public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
    this.totalCalculatedAmount = totalCalculatedAmount;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }
}
