//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.07 at 12:09:40 AM EDT 
//


package com.camsys.tds;

import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return (com.camsys.adapter.DateTimeAdapter.unmarshal(value));
    }

    public String marshal(LocalDateTime value) {
        return (com.camsys.adapter.DateTimeAdapter.marshal(value));
    }

}
