package pe.edu.utp.BibMpch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Builder
@Table(name = "tb_recurso_textual")
@AllArgsConstructor
@NoArgsConstructor
public class TextResource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rete_id")
	private Long id;

	@OneToOne
	@JoinColumn(name = "rete_tipo_texto_id")
	private TextResourceType type;

	@OneToOne
	@JoinColumn(name = "rete_editorial_id")
	private Editorial editorial;

	@Column(name = "rete_titulo")
	private String title;

	@Column(name = "rete_fec_publicacion")
	private LocalDate publicationDate;

	@Column(name = "rete_num_paginas")
	private Short pages;

	@Column(name = "rete_edicion")
	private Short edition;

	@Column(name = "rete_volumen")
	private Short volume;
}
