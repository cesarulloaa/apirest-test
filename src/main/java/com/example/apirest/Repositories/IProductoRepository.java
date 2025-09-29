package com.example.apirest.Repositories;

import com.example.apirest.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Long>{


}
