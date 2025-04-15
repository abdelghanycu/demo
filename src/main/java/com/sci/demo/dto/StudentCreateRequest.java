package com.sci.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCreateRequest implements Serializable {

  private static final long serialVersionUID = -6899576967265101949L;

  @NotNull(message = "ya hag lo sama7t al name hykon required")
  private String name;
  @Min(value = 1, message = "age cannot be negative")
  private Integer age;
}
