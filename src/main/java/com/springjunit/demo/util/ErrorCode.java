package com.springjunit.demo.util;

import com.springjunit.demo.exception.BusinessErrorCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ErrorCode {
    public static final BusinessErrorCode INTERNAL_SERVER_ERROR =
            new BusinessErrorCode(5000, "Internal server error", 503);
    public static final BusinessErrorCode INTERNAL_STORAGE_ERROR =
            new BusinessErrorCode(5001, "Internal storage error", 503);
    public static final BusinessErrorCode INTERNAL_BUFFER_ERROR =
            new BusinessErrorCode(5002, "Buffer connect fail", 503);
    public static final BusinessErrorCode COULD_NOT_GENERATE_QR =
            new BusinessErrorCode(5003, "Could not Generate QR code", 503);
    public static final BusinessErrorCode NOT_HAVE_OPERATOR_FIT =
            new BusinessErrorCode(5005, "There is not operator fit", 503);
    public static final BusinessErrorCode AUTHENTICATION_FAILED =
            new BusinessErrorCode(4871, "Authentication failed", 400);
    public static final BusinessErrorCode WRONG_PASSWORD =
            new BusinessErrorCode(4002, "Wrong password", 400);
    public static final BusinessErrorCode PASSWORD_INVALID =
            new BusinessErrorCode(4053, "Password invalid", 400);
    public static final BusinessErrorCode NOT_AUTHENTICATION =
            new BusinessErrorCode(4008, "You need to login to to access this resource", 401);
    public static final BusinessErrorCode UNSUPPORTED_RESOURCE =
            new BusinessErrorCode(4010, "Unsupported resource", 400);
    public static final BusinessErrorCode INVALID_FIELD_FORMAT =
            new BusinessErrorCode(4013, "Invalid field format", 400);
    public static final BusinessErrorCode ACCOUNT_LOGGED_OUT =
            new BusinessErrorCode(4014, "You have logged out", 401);
    public static final BusinessErrorCode SESSION_ENDED =
            new BusinessErrorCode(4015, "Your session has been ended", 401);
    public static final BusinessErrorCode UNAUTHORIZED =
            new BusinessErrorCode(4016, "You need to login to to access this resource", 401);
    public static final BusinessErrorCode FORBIDDEN =
            new BusinessErrorCode(4017, "You don't have permission to to access this resource", 403);
    public static final BusinessErrorCode ACCOUNT_FOLLOWED =
            new BusinessErrorCode(4023, "Already follow this account", 400);
    public static final BusinessErrorCode MISSING_PARAMETER =
            new BusinessErrorCode(4024, "Missing parameter", 400);
    public static final BusinessErrorCode OTP_SERVER_DENIES_REQUEST =
            new BusinessErrorCode(4025, "OTP server denied request", 400);
    public static final BusinessErrorCode FORMAT_DATE_INVALID =
            new BusinessErrorCode(4026, "Date format error", 400);
    public static final BusinessErrorCode FILE_NOT_FOUND =
            new BusinessErrorCode(4210, "File not found", 400);
    public static final BusinessErrorCode COULD_NOT_GENERATE_CODE =
            new BusinessErrorCode(5004, "Could not Generate code for object", 503);
    public static final BusinessErrorCode INVALID_FIELD_NAME =
            new BusinessErrorCode(4027, "Field name is invalid", 400);
    public static final BusinessErrorCode BOOLEAN_FIELD_NAME =
            new BusinessErrorCode(4028, "Boolean name is invalid", 400);
    public static final BusinessErrorCode NUMBER_FORMAT_ERROR =
            new BusinessErrorCode(4029, "Number format error", 400);
    public static final BusinessErrorCode UNSUPPORTED_ACTION_REF =
            new BusinessErrorCode(4030, "Unsupported action ref", 400);
    public static final BusinessErrorCode ENUM_FIELD_VALUE_INVALID =
            new BusinessErrorCode(4033, "Invalid value of boolean type", 400);
    public static final BusinessErrorCode INVALID_FILTER_OPERATOR =
            new BusinessErrorCode(4034, "Invalid filter operator", 400);
    public static final BusinessErrorCode INVALID_REQUEST =
            new BusinessErrorCode(4036, "Invalid request", 400);
    public static final BusinessErrorCode FILE_TOO_LARGE =
            new BusinessErrorCode(4201, "File to large", 400);
    public static final BusinessErrorCode FIELD_SORT_INVALID =
            new BusinessErrorCode(4160, "FIELD_SORT_INVALID", 400);

    public static final BusinessErrorCode ONLY_UPLOAD_10_FILES =
            new BusinessErrorCode(4202, "Only upload 10 file", 400);

    static {
        Set<Integer> codes = new HashSet<>();
        var duplications = Arrays.stream(ErrorCode.class.getDeclaredFields())
                .filter(f -> Modifier.isStatic(f.getModifiers()) && f.getType().equals(BusinessErrorCode.class))
                .map(f -> {
                    try {
                        return ((BusinessErrorCode) f.get(null)).getCode();
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .filter(code -> !codes.add(code))
                .collect(Collectors.toList());
        if (!duplications.isEmpty()) {
            throw new RuntimeException("Duplicate error code: " + duplications);
        }
    }
}
