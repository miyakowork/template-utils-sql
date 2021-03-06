package org.templateproject.sql.util;


import org.templateproject.sql.annotation.SQLTable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


/**
 * some methods of sql building
 * <p>
 * Created by wuwenbin on 2017/1/9.
 */
public class SQLBuilderUtils {

    private static final String SINGLE_SPACE = " ";
    private static final String DOUBLE_SPACE = "  ";

    /**
     * 最后生成sql时候,做一些字符串处理
     *
     * @param sql to transfer
     * @return {@link String}
     */
    public static String dealSQL(String sql) {
        sql = sql.replace(", FROM ", " FROM ").replace(",  FROM ", " FROM ");
        sql = sql.replace(", WHERE ", " WHERE ").replace(",  WHERE ", " WHERE ");
        sql = sql.replace(", )", ")");
        sql = sql.replace(DOUBLE_SPACE, SINGLE_SPACE);
        if (sql.endsWith("AND"))
            sql = sql.substring(0, sql.length() - 3);
        if (sql.endsWith("AND "))
            sql = sql.substring(0, sql.length() - 4);
        if (sql.endsWith(","))
            sql = sql.substring(0, sql.length() - 1);
        if (sql.endsWith(", "))
            sql = sql.substring(0, sql.length() - 2);
        return sql;
    }

    /**
     * bean上是否存在@SQLTable
     *
     * @param beanClass the obj of sql building
     * @return {@link Boolean}
     */
    public static boolean SQLTableIsExist(Class<?> beanClass) {
        return beanClass.isAnnotationPresent(SQLTable.class);
    }

    /**
     * 检查字段上的routers是否是方法参数中指定的
     *
     * @param filedRouters 字段上的routers
     * @param paramRouters 方法参数中的routers
     * @return {@link Boolean}
     */
    public static boolean fieldRoutersInParamRouters(int[] filedRouters, int[] paramRouters) {
        List<Integer> paramRouterList = new ArrayList<>();
        for (int paramRouter : paramRouters) {
            paramRouterList.add(paramRouter);
        }

        for (int filedRouter : filedRouters) {
            if (paramRouterList.contains(filedRouter))
                return true;
        }
        return false;
    }

    /**
     * 获取类中所有字段包括父类的protected字段
     *
     * @param clazz
     * @return
     */
    public static Field[] getAllFieldsExceptObject(Class<?> clazz) {
        List<Field> fields = new Vector<>();
        Class tempClass = clazz;
        while (tempClass != Object.class) {
            fields.addAll(Arrays.asList(tempClass.getDeclaredFields()));
            tempClass = tempClass.getSuperclass();
        }
        Field[] newField = new Field[fields.size()];
        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            newField[i] = field;
        }
        return newField;
    }
}
