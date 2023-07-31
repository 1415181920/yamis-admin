package io.xiaoyu.modular.util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommonUtil {

    //转驼峰
    public static String toCamelCase(String tableName) {
        return Arrays.stream(tableName.split("_"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining());
    }

}
