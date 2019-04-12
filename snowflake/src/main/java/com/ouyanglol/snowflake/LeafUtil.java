package com.ouyanglol.snowflake;

import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.common.PropertyFactory;
import com.sankuai.inf.leaf.snowflake.SnowflakeIDGenImpl;

import java.util.Properties;

/**
 * 借助美团leaf框架生成snowflake
 * @Author: dnouyang
 * @Date: 2019/4/12 10:16
 */
public class LeafUtil {
    private static Properties properties = PropertyFactory.getProperties();
    private static final IDGen idGen = new SnowflakeIDGenImpl(properties.getProperty("leaf.zk.list"), Integer.valueOf(properties.getProperty("leaf.port")));
    public static String get(String key) {
        return idGen.get(key).toString();
    }
}
