package com.example.m295lb.utils.handlers;

import com.example.m295lb.utils.expections.ModulNotCreatedException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ModulNotCreatedExceptionHandler implements ExceptionMapper<ModulNotCreatedException> {

    @Override
    public Response toResponse(ModulNotCreatedException e) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
    }
}
