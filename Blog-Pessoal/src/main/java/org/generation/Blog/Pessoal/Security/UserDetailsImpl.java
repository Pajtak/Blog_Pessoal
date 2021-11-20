package org.generation.Blog.Pessoal.Security;

import java.util.Collection;
import java.util.List;

import org.generation.Blog.Pessoal.model.UsuarioModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String usuarioName;

	private String password;
	
	private List<GrantedAuthority> authorities;

	public UserDetailsImpl(UsuarioModel user) {
		this.usuarioName = user.getUsuario();
		this.password = user.getSenha();
	}

	public UserDetailsImpl() {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return usuarioName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
