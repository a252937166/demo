package com.ouyanglol.snowflake.service;


import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.common.PropertyFactory;
import com.sankuai.inf.leaf.snowflake.SnowflakeIDGenImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;


/**
 * @author admin
 */
@Service
public class SnowflakeService {
    IDGen idGen;
    public SnowflakeService() {
        Properties properties = PropertyFactory.getProperties();
        idGen = new SnowflakeIDGenImpl(properties.getProperty("leaf.zk.list"), Integer.valueOf(properties.getProperty("leaf.port")));
        idGen.init();
    }
    public String get(String key) {
        return idGen.get(key).toString();
    }
}