package com.ouyanglol.snowflake;

import com.ouyanglol.snowflake.utils.LeafUtil;
import org.springframework.stereotype.Controller;

/**
 * @Author: dnouyang
 * @Date: 2019/4/12 16:35
 */
@Controller
public class Main {
    public static void main(String[] args) {
        System.out.println(LeafUtil.get("3"));
    }
}
