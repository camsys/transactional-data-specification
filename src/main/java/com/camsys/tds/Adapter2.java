
package com.camsys.tds;

import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return (com.camsys.adapter.DateTimeAdapter.unmarshal(value));
    }

    public String marshal(LocalDateTime value) {
        return (com.camsys.adapter.DateTimeAdapter.marshal(value));
    }

}
