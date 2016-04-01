package info.vividcode.web.ktjee.domain.entities

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "comment")
@NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c")
class Comment(text: String) : Serializable {

    companion object {
        private val serialVersionUID = 1L
    }

    protected constructor() : this("")

    @field:[
        Id
        GeneratedValue(strategy = GenerationType.IDENTITY)
        Column(name = "id")
    ]
    var id: Long = 0

    @field:Column(name = "text")
    var text: String = text

}

fun EntityManager.createNamedQueryCommentFindAll() =
        this.createNamedQuery("Comment.findAll", Comment::class.java)
