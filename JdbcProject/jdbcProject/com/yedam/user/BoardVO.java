package jdbcProject.com.yedam.user;

import java.io.Serializable;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO implements Serializable {
	private int brdNo;
	private String brdTitle;
	private String brdWriter;
	private String brdContent;
	private String creDate;
	private int clickCnt;
}