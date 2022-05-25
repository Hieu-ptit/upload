package com.springjunit.demo.model.response;

import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.JsonAttribute;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@CompiledJson
public class CompanyResponse {
    private int id;

    private String name;

    private String address;

    private String code;

    @JsonAttribute(name = "employee_Infos")
    private List<EmployeeInfo> employeeInfos;
}
