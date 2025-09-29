package com.example.apirest.Controllers;

import com.example.apirest.Entities.Producto;
import com.example.apirest.Repositories.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAllProductos(){
        return productoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id){
        return productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found " + id));
    }

    @PostMapping
    public Producto createProduct(@RequestBody Producto producto){
        return productoRepository.save(producto);
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto detalleProducto){
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found " + id));
         producto.setNombre(detalleProducto.getNombre());
         producto.setPrecio(detalleProducto.getPrecio());

         return productoRepository.save(producto);

    }

    @DeleteMapping("/{id}")
    public String deleteProduto(@PathVariable Long id) {
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found " + id));
        productoRepository.delete(producto);

        return "El producto " + id + " ha sido eliminado";
    }

}
