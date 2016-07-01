package com.lxd.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
    private String characterEncoding;//编码方式在web.xml中
    private boolean enabled;//是否启动filter，初始值在web.xml中
    
    public void init(FilterConfig config) throws ServletException {
        // TODO Auto-generated method stub
        //初始化时加载参数
        //从配置文件中读取设置到编码方式
        characterEncoding=config.getInitParameter("characterEncoding");
        //启动该过滤器完成编码方式到修改
        enabled="true".equalsIgnoreCase(characterEncoding.trim())
            ||"1".equalsIgnoreCase(characterEncoding.trim());
        
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        if(enabled||characterEncoding!=null){
            request.setCharacterEncoding(characterEncoding);//设置request编码方式
            response.setCharacterEncoding(characterEncoding);//设置response编码方式
        }
        chain.doFilter(request, response);//doFilter将修改好的request和response参数向下传递；
        
    }

    public void destroy() {
        // TODO Auto-generated method stub
        characterEncoding=null;
        
    }
}