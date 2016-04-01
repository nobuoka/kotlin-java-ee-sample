package info.vividcode.web.ktjee.application;

import info.vividcode.web.ktjee.domain.entities.Comment;
import info.vividcode.web.ktjee.domain.repositories.CommentRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class CommentApplication {

    @Inject
    private CommentRepository mCommentRepository;

    @Transactional
    public void createComment(String text) {
        Comment c = new Comment(text);
        mCommentRepository.add(c);
    }

    public List<Comment> readComments() {
        return mCommentRepository.getAll();
    }

}
