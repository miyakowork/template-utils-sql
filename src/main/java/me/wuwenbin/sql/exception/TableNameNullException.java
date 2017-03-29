package me.wuwenbin.sql.exception;

/**
 * 异常类
 * <p>
 * Created by wuwenbin on 2017/1/10.
 */
public class TableNameNullException extends Exception {

    public TableNameNullException() {
        super("tableName 为空!");
    }
}
