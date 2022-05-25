package com.springjunit.demo.model.response;

import com.dslplatform.json.CompiledJson;
import com.springjunit.demo.model.bo.PropertiesCode;
import com.springjunit.demo.model.bo.PropertiesType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@CompiledJson
public class PropertiesResponse {

    private Integer id;

    private String name;

    private PropertiesType type;

    private PropertiesCode code;

}
