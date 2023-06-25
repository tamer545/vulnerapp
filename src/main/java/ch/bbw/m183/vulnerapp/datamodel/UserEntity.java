package ch.bbw.m183.vulnerapp.datamodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "users")
public class UserEntity implements UserDetails {

	@Id
	@NotBlank(message = "Benutzername darf nicht leer sein")
	String username;

	@Column
	@NotBlank(message = "Vollständiger Name darf nicht leer sein")
	String fullname;

	@Column
	@NotBlank(message = "Passwort darf nicht leer sein")
	@Size(min = 8, message = "Passwort muss mindestens 8 Zeichen lang sein")
	String password;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}
}
