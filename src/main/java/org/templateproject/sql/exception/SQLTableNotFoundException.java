package org.templateproject.sql.exception;

/**
 * 异常类
 * <p>
 * Created by wuwenbin on 2017/1/9.
 */
public class SQLTableNotFoundException extends RuntimeException {

    public SQLTableNotFoundException(Class<?> clazz) {
        super(clazz.getName() + "上不存在 @SQLTable !");
    }

}
