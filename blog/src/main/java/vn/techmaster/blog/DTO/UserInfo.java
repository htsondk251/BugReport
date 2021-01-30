package vn.techmaster.blog.DTO;

import lombok.Getter;
import lombok.Setter;
import vn.techmaster.blog.model.RoleType;

@Setter
@Getter
//UserInfo dùng để trả về dữ liệu phía client, nó không chứa những trường nhạy cảm như password !
public class UserInfo {
  private long id;
  private String fullname;
  private String email;
  private RoleType role;
}
