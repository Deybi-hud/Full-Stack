package com.holamundo.holamundo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import com.holamundo.holamundo.domain.Productos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/producto")  /*Unifica las rutas */
public class ProductosController {

    private List<Productos> productos = new ArrayList<>(Arrays.asList(
        new Productos(1, "TV", 400000),
        new Productos(2, "PC", 1000000)
    ));

    //@GetMapping
    @GetMapping
    public ResponseEntity<List<Productos>>  getProductos() {
        return ResponseEntity.ok(productos);

    }
    
    //@GetMapping("/{id}")
    @GetMapping("/{id}") 
    public ResponseEntity<?>  getPorProductos(@PathVariable int  id){
            for(Productos p : productos){
                if (p.getID() == id) {
                    return ResponseEntity.ok(p); 
                }
            }
            //Con esto se puden mandar un mensaje de error 
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no encontrado con ID " + id);
    }

    @PostMapping
    public ResponseEntity<?>  postProductos(@RequestBody Productos producto){
        productos.add(producto);

        return ResponseEntity.status(HttpStatus.CREATED).body("Producto creado exitosamente: " + producto.getNombre());
    }
    
    @PutMapping
    public ResponseEntity<?>  putProductos(@RequestBody Productos producto) {
        for(Productos p : productos){
            if (p.getID() == producto.getID()) {
                p.setNombre(producto.getNombre());
                p.setPrecio(producto.getPrecio());
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no fue creado: " + producto.getNombre());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductos(@PathVariable int id){
        for(Productos p: productos){
            if (p.getID() == id) {
                productos.remove(p);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El ID no fue encontrado " + id);
    }

    @PatchMapping
    public ResponseEntity<?> patchProductos(@RequestBody Productos producto){
        for(Productos p: productos){
            if (p.getID() == producto.getID()) {
                if (producto.getNombre() != null) {
                    p.setNombre(producto.getNombre());
                }
                else if (producto.getPrecio() != 0) {
                    p.setPrecio(producto.getPrecio());
                }
                return ResponseEntity.ok("El producto fue modificado con exito " + p.getNombre());
            }
        }   
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El producto no fue encontrado " + producto.getID());
    }
}
