package com.bocd.spring;

import com.bocd.model.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author fuwc
 * @version 1.0, 2019/9/18
 * @desc 即实现postProcessBeanDefinitionRegistry方法，可以修改增加BeanDefinition。
 *       此特性可以用来动态生成bean，比如读取某个配置项，然后根据配置项动态生成bean。
 *       以上postProcessBeanDefinitionRegistry方法中可以通过env来读取配置项，
 *       根据配置项来进行datasoure注册过程，此处代码未实现此种逻辑。
 *       https://www.jianshu.com/p/b4bec64ada70
 *       https://www.cnblogs.com/songfahzun/p/9236656.html
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        for (int i = 0; i < 10; i++) {
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
            builder.addPropertyValue("name", "fuwc" + i);
            registry.registerBeanDefinition("person" + i, builder.getBeanDefinition());
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}