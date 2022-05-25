package com.springjunit.demo.model.request;

import com.dslplatform.json.JsonAttribute;
import com.springjunit.demo.model.bo.Gender;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Data
@Accessors(chain = true)
public class UpsertEmployeeRequest {

    @NotBlank(message = "4231")
    @Length(max = 99, message = "4232")
    private String name;

    @JsonAttribute(name = "date_of_birth")
    private Date dateOfBirth;

    private Gender sex;

    @NotBlank(message = "4813")
    private String phone;

    @Length(max = 50, message = "4233")
    private String email;

    @NotNull(message = "4238")
    private PropertiesRequest positions;

    @JsonAttribute(name = "station_ids")
    @NotEmpty(message = "4253")
    private List<@NotNull(message = "4253")Integer> stationIds;

    @Length(max = 100, message = "4236")
    private String address;

    @Pattern(regexp = "^[0-9]{9}$|^[0-9]{12}$", message = "4855")
    @NotBlank(message = "4239")
    private String identityCardNumber;

    private String fullAddress;


}
