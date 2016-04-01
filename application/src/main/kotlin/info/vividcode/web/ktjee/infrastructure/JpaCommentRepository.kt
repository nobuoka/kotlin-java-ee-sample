package info.vividcode.web.ktjee.infrastructure

import info.vividcode.web.ktjee.domain.entities.Comment
import info.vividcode.web.ktjee.domain.repositories.CommentRepository
import javax.enterprise.context.ApplicationScoped
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@ApplicationScoped
open class JpaCommentRepository() : CommentRepository {

    @field:PersistenceContext(unitName = "jerseysample")
    private lateinit var mEntityManager : EntityManager

    override fun add(comment: Comment?) {
        mEntityManager.persist(comment)
    }

    override fun getAll(): List<Comment>? {
        return mEntityManager.createNamedQuery("Comment.findAll", Comment::class.java).resultList
    }

}
