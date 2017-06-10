package me.wuwenbin.sql.exception;

/**
 * 异常类
 * <p>
 * Created by wuwenbin on 2017/1/12.
 */
public class DeleteSQLConditionsNullException extends RuntimeException {
    public DeleteSQLConditionsNullException() {
        super("删除语句中条件不能为空!");
    }
}
