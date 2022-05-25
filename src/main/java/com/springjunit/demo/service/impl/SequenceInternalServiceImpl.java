package com.springjunit.demo.service.impl;

import com.springjunit.demo.exception.BusinessException;
import com.springjunit.demo.repository.ExtraRepository;
import com.springjunit.demo.service.SequenceInternalService;
import com.springjunit.demo.util.ErrorCode;
import com.springjunit.demo.util.Global;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SequenceInternalServiceImpl implements SequenceInternalService {

    private final ExtraRepository extraRepository;

    /**
     * generateEmployeeCode
     *
     * @return String
     */
    @Override
    public String generateEmployeeCode() {

        Long nextNoOrder = extraRepository.getNextValueSeq(Global.EMPLOYEE_CODE_NO_SEQUENCE);

        if (nextNoOrder == null)
            throw new BusinessException(ErrorCode.COULD_NOT_GENERATE_CODE, "Could not Generate code for object");

        String code = "SNV";
        String number = String.format("%04d", nextNoOrder);

        return code + number;
    }


}
