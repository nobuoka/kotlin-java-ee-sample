package info.vividcode.web.ktjee.presentation

import info.vividcode.web.ktjee.application.CommentApplication
import java.net.URI

import javax.enterprise.context.RequestScoped
import javax.inject.Inject
import javax.mvc.Models
import javax.mvc.annotation.Controller
import javax.ws.rs.*
import javax.ws.rs.core.Response

@Path("/comments")
@RequestScoped
open class CommentController {

    @field:Inject
    private lateinit var mCommentApplication: CommentApplication

    @field:Inject
    private lateinit var mModels: Models

    @Controller
    @GET
    @Produces("text/html")
    open fun getTest(): Response {
        mModels.put("comments", mCommentApplication.readComments())
        return Response.ok("comments.jsp").build()
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    open fun postTest(@FormParam("comment-text") commentText: String): Response {
        mCommentApplication.createComment(commentText)
        mModels.put("comments", mCommentApplication.readComments())
        return Response.seeOther(URI.create("/comments")).build()
    }

}
