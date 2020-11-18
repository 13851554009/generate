package com.t3.generate;

import com.t3.generate.generator.JdbcGenUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成器入口
 * @author
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        /*String jdbcUrl = "jdbc:mysql://192.168.99.100:3306/test?useUnicode=true&characterEncoding=utf-8";
        String jdbcUsername = "root";
        String jdbcPassword = "123456";*/

        String jdbcUrl = "jdbc:mysql://172.16.24.49:3306/t3_resource?useUnicode=true&characterEncoding=utf-8";
        String jdbcUsername = "pgm_user";
        String jdbcPassword = "mDuYeuj5s8e5YPHh";

        //表名或者表名前缀
        String tablePrefix = "'t_vehicle_virtual_vin'";

        //api 和service 模块包名称，如 driver, passenger
        String javaModule = "manager";

        //t3-admin 模块名称,model 文件夹下的模块名称，如passenger
        String webModule = "manager";

        //为了省去拷贝代码，直接配置工程代码路径，一键生成到各个目录下面; 如果不配置则生成在当前工程的模块中
        Map modulePath = new HashMap<String,String>(3);
        //modulePath.put("apiPath","E:/T3/t3_dev/t3/t3-driver/driver-api/src/main/java");
        //modulePath.put("servicePath","E:/T3/t3_dev/t3/t3-driver/driver-service/src/main/java");
        //modulePath.put("t3adminPath","E:/T3/t3_dev/t3-admin/src/main/java/com/t3/ts/model");
        //E:/T3/t3_dev/t3-admin/src/main/java/com/t3/ts/model

        JdbcGenUtils.generatorCode(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword, tablePrefix, javaModule, webModule,modulePath);
    }

}
