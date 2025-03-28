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
public class SkillPresetDTO {
	@SerializedName("preset_slot_no")
	private Integer presetSlotNo;
	@SerializedName("skill_name_1")
	private String skillName1;
	@SerializedName("skill_name_2")
	private String skillName2;
	@SerializedName("skill_name_3")
	private String skillName3;
	@SerializedName("skill_name_4")
	private String skillName4;
	@SerializedName("preset_command_flag")
	private String presetCommandFlag;
}
