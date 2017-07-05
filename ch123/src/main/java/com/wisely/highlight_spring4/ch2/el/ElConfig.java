package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:58 2017/7/4 0004
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:test.properties")
//安照书上的把文件放到@PropertySource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties")，提示找不到文件
//于是放到resources目录下，能找得到文件。刚好直接也在classpath下
public class ElConfig {

    @Value("I Love You !") //注入普通字符串
    private String normal;

    @Value("#{systemProperties['os.name']}") //注入操作系统属性
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}") //注入表达式结果
    private double randomNumber;

    @Value("#{demoService.another}") //注入其他Bean属性
    private String fromAnother;

    @Value("classpath:test.txt") //注入文件资源
    private Resource testFile;

    @Value("http://www.baidu.com") //注入网址资源
    private Resource testUrl;

    @Value("${book.name}") //注入配置文件
    private String bookName;

    @Autowired
    private Environment environment;
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        }catch (Exception e){

        }
    }
}
