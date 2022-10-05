package com.ReclaimTheMeal;

import org.springframework.data.domain.Page;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    void savePost(Post post) throws Exception;
    Post getPostById(long id);
    void deletePostById(long id);
    Page<Post> findPaginated(int pageNum, int pageSize,
                             String sortField,
                             String sortDirection);
    List<Post> getPostsByUser(Long id);
}