package org.acme;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import io.quarkus.qute.Template;

import io.quarkus.qute.TemplateInstance;

import io.smallrye.common.annotation.Blocking;

import jakarta.inject.Inject;

import jakarta.ws.rs.*;

import jakarta.ws.rs.core.MediaType;


import java.util.List;


@Path("/bike")

@Consumes(MediaType.APPLICATION_JSON)

public class BikeResource {

    @Inject
    Template bikes;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Blocking
    public TemplateInstance listAllBikes() {
        List<PanacheEntityBase> allBikes = Bike.findAll().list();
        return bikes.data("allBikes", allBikes);

    }

}