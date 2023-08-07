package com.camsys.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class DateTimeAdapter {

  public static LocalDateTime unmarshal(String v) {
    if (Objects.nonNull(v)) {
      try {
        return LocalDateTime.parse(v);
      } catch (DateTimeParseException e) {
        throw new RuntimeException("Failed to parse time: " + v, e);
      }
    }
    return null;
  }

  public static  String marshal(LocalDateTime v) {
    if (Objects.nonNull(v)) {
      return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(v);
    }
    return null;
  }
}
