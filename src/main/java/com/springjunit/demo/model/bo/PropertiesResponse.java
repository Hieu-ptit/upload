package com.springjunit.demo.model.bo;

import com.dslplatform.json.CompiledJson;
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
