package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 2:06 2017/7/4 0004
 */
@Configuration //声明当前类是一个配置类
//使用@ComponentScan，自动扫描包名下所有的@Service,@Component,@Repository,@Controller的类，并注册为Bean
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
public class DiConfig {

}
