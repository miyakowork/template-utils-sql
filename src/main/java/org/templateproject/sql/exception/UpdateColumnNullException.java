package org.templateproject.sql.exception;

/**
 * 异常类
 *
 * Created by wuwenbin on 2017/1/12.
 */
public class UpdateColumnNullException extends RuntimeException {
    public UpdateColumnNullException() {
        super("update语句更新字段不能为空!");
    }
}
