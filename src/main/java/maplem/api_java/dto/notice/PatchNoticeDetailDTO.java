package maplem.api_java.dto.notice;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import maplem.api_java.Utils;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PatchNoticeDetailDTO {

	@SerializedName("title")
	private String title;
	@SerializedName("url")
	private String url;
	@SerializedName("contents")
	private String contents;
	@SerializedName("date")
	private String date;
	@SerializedName("notice_tag")
	private ArrayList<String> noticeTag;
	
	public LocalDateTime getDate() {
		return Utils.toLocalDateTime(this.date);
	}

}
