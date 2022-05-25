package com.springjunit.demo.model.request;

import com.dslplatform.json.CompiledJson;
import com.springjunit.demo.model.bo.PropertiesCode;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@CompiledJson
public class PropertiesRequest {

    private PropertiesCode code;

}
