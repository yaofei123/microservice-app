/**
 * Created by fei.yao on 2017/12/28.
 */
package com.ehaoyao.ordercenter.framework.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这个是最简单的配置形式，一般应用用这种形式就可以了，用来指示Apollo注入application namespace的配置到Spring环境中
 *
 * @author fei.yao
 * @create 2017-12-28
 **/
@Configuration
@EnableApolloConfig
public class AppConfig {

    @Bean
    public XxlJobConfig xxlJobConfig() {
        return new XxlJobConfig();
    }
}

