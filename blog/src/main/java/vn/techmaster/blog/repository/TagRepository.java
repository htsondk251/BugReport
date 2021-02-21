package vn.techmaster.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.techmaster.blog.model.Tag;

@Repository
public interface TagRepository extends JpaRepository <Tag, Long>{
//   @Query(value = "select t.posts from tag t where t.id = :tag_id", nativeQuery = true)
//   List<Post> posts = 
}