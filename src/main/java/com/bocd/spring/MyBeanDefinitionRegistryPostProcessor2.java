package com.bocd.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

/**
 * @author fuwc
 * @version 1.0, 2019/9/18
 * @desc 加载配置文件
 */
//@Component
public class MyBeanDefinitionRegistryPostProcessor2 implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        try {
            initPerson(registry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initPerson(BeanDefinitionRegistry registry) throws IOException {
        Resource resource = new ClassPathResource("person.properties");
        Properties p = new Properties();
        System.out.println("=========");
        p.load(resource.getInputStream());
        p.entrySet().forEach(System.out::println);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("----MyBeanDefinitionRegistryPostProcessor2.postProcessBeanFactory");

    }
}