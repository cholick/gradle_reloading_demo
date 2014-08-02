package com.cholick.demo

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path('/hello')
@Produces(MediaType.APPLICATION_JSON)
class HelloResource {

    List<String> greetings = ['Hello', 'Hi', 'Hey']

    @GET
    Map greetings() {
        return [greetings: greetings]
    }

}
