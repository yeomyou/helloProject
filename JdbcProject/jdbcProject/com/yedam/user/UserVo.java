package jdbcProject.com.yedam.user;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
	private String userId;
	private String userPw;
	private String userName;
	private String userBirth;
	private String userPhone;
	private String userAddr;
}
