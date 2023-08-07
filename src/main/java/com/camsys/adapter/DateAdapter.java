package com.camsys.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class DateAdapter {

  public static LocalDate unmarshal(String v) {
    if (Objects.nonNull(v)) {
      try {
        return LocalDate.parse(v);
      } catch (DateTimeParseException e) {
        throw new RuntimeException("Failed to parse time: " + v, e);
      }
    }
    return null;
  }

  public static String marshal(LocalDate v) {
    if (Objects.nonNull(v)) {
      return DateTimeFormatter.ISO_DATE.format(v);
    }
    return null;
  }
}
