package com.springjunit.demo.util;

import java.util.Arrays;
import java.util.List;

public class Global {

    public final static String EMPLOYEE_CODE_NO_SEQUENCE = "employee_code_no_seq";

    public final static List<String> fieldSortEmployee = Arrays.asList("code", "createdAt", "name", "department", "positions");

    public static String getFunctionPostgres = "jsonb_extract_path_text";

    public Global() {
    }

}