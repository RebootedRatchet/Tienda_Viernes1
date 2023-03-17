package com.tienda_v1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo");
    private Long idArticulo;

    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String imagen;
    private boolean activo;
    
    @JoinColumn(name="id_categoria", referencedColumnName="id_categoria");
    @ManyToOne
    private Categoria categoria;
    

    public Articulo() {
    }

}
