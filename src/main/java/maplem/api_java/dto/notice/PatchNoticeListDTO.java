package maplem.api_java.dto.notice;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PatchNoticeListDTO {
	@SerializedName("patch_notice")
	private List<PatchNoticeListItemDTO> patchNotice;
}
