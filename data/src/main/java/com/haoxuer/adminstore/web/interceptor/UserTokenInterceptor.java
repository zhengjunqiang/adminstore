package com.haoxuer.adminstore.web.interceptor;

import com.haoxuer.adminstore.exception.NoUserTokenException;
import com.haoxuer.adminstore.exception.UnAuthorizationException;
import com.haoxuer.discover.user.utils.UserUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserTokenInterceptor extends HandlerInterceptorAdapter {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    String token = request.getParameter("userToken");
    if (token == null) {
      throw new NoUserTokenException();
    }
    Long app = UserUtils.getApp(token);
    if (app == null) {
      throw new UnAuthorizationException();
    }
    return true;
  }
}
