package vn.techmaster.blog.DTO;

import java.time.LocalDateTime;
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
public class PostPOJO {
  private Long id;
  private String title;
  private String content;
  private Long user_id;
  private String userFullName;
  private LocalDateTime lastUpdate;
  private StatusType type;
  // @Enumerated(EnumType.STRING)
  private RatingPoint rating; // = RatingPoint.ONE;

  // @Enumerated(EnumType.STRING)
  private StatusType status; // = StatusType.NOT_FIXED;
}
