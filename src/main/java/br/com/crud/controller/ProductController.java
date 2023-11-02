package br.com.crud.controller;

import br.com.crud.dto.ProductDto;
import br.com.crud.service.ProductService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    ProductService service;

    @GET
    public Response listProducts(){
        return Response.ok(service.listProduct()).build();
    }

    @POST
    public Response saveProduct(ProductDto dto){
        return Response.ok(service.saveProduct(dto)).status(201).build();
    }

    @PUT
    @Path("{id}")
    public Response updateProduct(@PathParam("id") Long id, ProductDto dto) {
        service.updateProduct(id, dto);
        return Response.status(204).build();
    }

    @DELETE
    @Path("{id}")
    public Response removeProduct(@PathParam("id") Long id) {
        service.removeProduct(id);
        return Response.status(204).build();
    }
}
