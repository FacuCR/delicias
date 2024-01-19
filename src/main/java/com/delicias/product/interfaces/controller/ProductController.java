package com.delicias.product.interfaces.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para gestionar las operaciones CRUD de los productos
 *
 * @author Facundo Castro
 */
@Api(tags = "Product API")
@RestController
@RequestMapping("/product")
public class ProductController {
//    private final ProductService productService;
//
//    @Autowired
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

//    @ApiOperation("Get all products")
//    @GetMapping
//    public List<Product> getAllProducts() {
//        return productService.getAllProducts();
//    }
}
