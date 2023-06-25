package ch.bbw.m183.vulnerapp.datamodel;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "blogs")
public class BlogEntity {

	@Id
	@NotNull(message = "Die ID darf nicht null sein")
	UUID id;

	@Column
	@CreationTimestamp
	LocalDateTime createdAt;

	@Column(columnDefinition = "text")
	@NotBlank(message = "Der Titel darf nicht leer sein")
	@Size(max = 100, message = "Der Titel darf maximal 100 Zeichen lang sein")
	String title;

	@Column(columnDefinition = "text")
	@NotBlank(message = "Der Inhalt darf nicht leer sein")
	String body;
}
