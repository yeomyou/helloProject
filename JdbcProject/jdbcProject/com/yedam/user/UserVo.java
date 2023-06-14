package jdbcProject.com.yedam.user;

import java.io.Serializable;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo implements Serializable {
	private String userId;
	private String userPw;
	private String userName;
	private String userBirth;
	private String userPhone;
	private String userAddr;
}
