package info.vividcode.web.ktjee.domain.repositories;

import info.vividcode.web.ktjee.domain.entities.Comment;

import java.util.List;

public interface CommentRepository {

    void add(Comment comment);

    List<Comment> getAll();

}
