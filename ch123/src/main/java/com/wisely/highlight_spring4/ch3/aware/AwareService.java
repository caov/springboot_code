package com.wisely.highlight_spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @Author:van
 * @Description 实现BeanNameAware,ResourceLoaderAware接口，获得Bean名称和资源加载的服务
 * @Date: Create in 下午 2:14 2017/7/5 0005
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    private String beanName;

    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("classpath:test.txt");
        try{
            System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
