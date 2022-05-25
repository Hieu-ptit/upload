package com.springjunit.demo.model.request;

import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.JsonAttribute;
import com.springjunit.demo.model.bo.TypeMedia;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@CompiledJson
public class FileRequest {

    private String name;

    private String url;

    private String owner;

    @JsonAttribute(name = "type_media")
    private TypeMedia typeMedia;

}
