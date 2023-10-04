
package com.camsys.tds;

import java.time.LocalTime;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, LocalTime>
{


    public LocalTime unmarshal(String value) {
        return (com.camsys.adapter.TimeAdapter.unmarshal(value));
    }

    public String marshal(LocalTime value) {
        return (com.camsys.adapter.TimeAdapter.marshal(value));
    }

}
