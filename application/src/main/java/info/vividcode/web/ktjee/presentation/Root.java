package info.vividcode.web.ktjee.presentation;

import javax.enterprise.context.RequestScoped;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/")
public class Root {

    @Controller
    @GET
    @Produces("text/html")
    public String getGood() {
        return "root.jsp";
    }

}
