package com.gaiaworks.zuulUtil;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {

//    过滤条件 执行顺序 执行条件 具体操作
//    filterType : pre 路由之前 routing 路由时 post 路由后  error 发送错误调用
//    filter: 过滤的顺序 ？？？
//    shouldFilter: 是否过滤 有效
//    run：过滤器的具体逻辑， 包括查sql，nosql去判断请求到底有没有权限访问
//
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1000;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        if(accessToken == null){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try{
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){
                return null;
            }
            System.out.println("ok");
        }


        return null;
    }
}
