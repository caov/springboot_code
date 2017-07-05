package com.wisely.highlight_spring4.ch3.aware;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:16 2017/7/5 0005
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.aware") //使用@ComponentScan，自动扫描包名下所有@Service等的类，并注册为Bean
public class AwareConfig {

}
