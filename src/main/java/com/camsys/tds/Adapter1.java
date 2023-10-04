
package com.camsys.tds;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (java.lang.Boolean.valueOf(value));
    }

    public String marshal(Boolean value) {
        return (java.lang.Boolean.toString(value));
    }

}
