package cn.zzzcr.springboots.dao.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {


    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean beanFilter = new FilterRegistrationBean();
        beanFilter.setFilter(new WebStatFilter());
        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
        initParams.put("slowSqlMillis","5000");
        initParams.put("logSlowSql","true");
        beanFilter.setInitParameters(initParams);
        beanFilter.setUrlPatterns(Arrays.asList("/*"));
        return beanFilter;
    }


    @Bean
    public ServletRegistrationBean setStatViewServlet(){
        ServletRegistrationBean beanServlet = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow","");
        initParams.put("filters","stat,wall,log4j");
        beanServlet.setInitParameters(initParams);
        return  beanServlet;
    }

}
