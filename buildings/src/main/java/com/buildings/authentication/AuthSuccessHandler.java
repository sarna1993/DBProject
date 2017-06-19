package com.buildings.authentication;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.buildings.enums.TypKontaEnum;

public class AuthSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }
    
	@Override
	public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1, Authentication arg2)
			throws IOException, ServletException {
		
		handle(arg0, arg1, arg2);
		clearAuthenticationAttributes(arg0);
	}

	private void handle(HttpServletRequest request, HttpServletResponse response, Authentication auth) throws IOException {
		String targetUrl = "/";
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals(TypKontaEnum.LOKATOR.getRoleName())) {
            	targetUrl += TypKontaEnum.LOKATOR.getPanelName();
                break;
            } else if (grantedAuthority.getAuthority().equals(TypKontaEnum.KSIEGOWA.getRoleName())) {
            	targetUrl += TypKontaEnum.KSIEGOWA.getPanelName();
                break;
            } else if (grantedAuthority.getAuthority().equals(TypKontaEnum.MANAGER.getRoleName())) {
            	targetUrl += TypKontaEnum.MANAGER.getPanelName();
            	break;
            } else if (grantedAuthority.getAuthority().equals(TypKontaEnum.TECHNICZNY.getRoleName())) {
            	targetUrl += TypKontaEnum.TECHNICZNY.getPanelName();
            	break;
            } else if (grantedAuthority.getAuthority().equals(TypKontaEnum.ADMIN.getRoleName())) {
            	targetUrl += TypKontaEnum.ADMIN.getPanelName();
            	break;
            }
        }
		redirectStrategy.sendRedirect(request, response, targetUrl);
	}
	
    protected void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
    }
}
