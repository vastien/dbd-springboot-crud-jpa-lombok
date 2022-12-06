package com.backend.backend.Entities;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TipoProductoEmpresaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer id_tipo_producto_empresa;
    private String nombre_producto;
}