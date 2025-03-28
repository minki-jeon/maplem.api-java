package maplem.api_java.dto.character;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class StealSkillInfoDTO {
	@SerializedName("skill_name")
	private String skillName;
	@SerializedName("skill_slot")
	private String skillSlot;
}
