package com.camsys.adapter;


import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class TimeAdapter {

  public static LocalTime unmarshal(String v) {
    if (Objects.nonNull(v)) {
      try {
        return LocalTime.parse(v);
      } catch (DateTimeParseException e) {
        throw new RuntimeException("Failed to parse time: " + v, e);
      }
    }
    return null;
  }

  public static String marshal(LocalTime v) {
    if (Objects.nonNull(v)) {
      return DateTimeFormatter.ISO_LOCAL_TIME.format(v);

    }
    return null;
  }
}
