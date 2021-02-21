package vn.techmaster.blog.controller.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.techmaster.blog.model.RatingPoint;
import vn.techmaster.blog.model.StatusType;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest {
  private Long id;
  @NotNull
	@Size(min=10, max=300, message="title must be with 10 and 300")
  private String title;

  @NotNull
	@Size(min=20, max=5000, message="content must be with 20 and 5000")
  private String content;

  private Long user_id;
  private RatingPoint rating; // = RatingPoint.ONE;

  private StatusType status = StatusType.NOT_FIXED;

  // public PostRequest(@NotNull @Size(min = 10, max = 300, message = "title must be with 10 and 300") String title,
  //     @NotNull @Size(min = 20, max = 5000, message = "content must be with 20 and 5000") String content) {
  //   this.title = title;
  //   this.content = content;
  //   if (status == null) {
  //     status = StatusType.NOT_FIXED;
  //   }
  // }

  
}
