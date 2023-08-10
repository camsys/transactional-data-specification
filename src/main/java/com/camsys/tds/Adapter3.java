
package com.camsys.tds;

import java.time.LocalDate;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, LocalDate>
{


    public LocalDate unmarshal(String value) {
        return (com.camsys.adapter.DateAdapter.unmarshal(value));
    }

    public String marshal(LocalDate value) {
        return (com.camsys.adapter.DateAdapter.marshal(value));
    }

}
