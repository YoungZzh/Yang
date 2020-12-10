package school.cjlu.common.http;

import lombok.Data;

/**
 * Author:Young
 * Date:2020/12/7-22:07
 * 重复验证
 */
@Data
public class DuplicateVaild {

    /**
     * 字段名
     */
    private String name;

    /**
     * 字段值
     */
    private String param;

    /**
     * 字段名
     */
    private String extendName;

    /**
     * 字段值
     */
    private String extendParam;
    /**
     * 查询方式
     */
    private String queryType;
    /**
     * 查询的DATA
     */
    private String queryData;

    private String errorMsg;
}
