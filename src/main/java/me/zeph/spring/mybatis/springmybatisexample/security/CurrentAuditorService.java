package me.zeph.spring.mybatis.springmybatisexample.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class CurrentAuditorService {
  public static String getCurrentAuditor() throws Exception {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if (authentication == null) {
      throw new Exception("Need authentication");
    }
    return authentication.getName();
  }
}
