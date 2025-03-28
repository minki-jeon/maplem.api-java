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
public class EquipmentSkillInfoDTO {
	@SerializedName("skill_mode")
	private Integer skillMode;
	@SerializedName("equipment_skill_set")
	private String equipmentSkillSet;
	@SerializedName("slot_id")
	private String slotId;
	@SerializedName("skill_name")
	private String skillName;
	@SerializedName("skill_type")
	private String skillType;
	@SerializedName("skill_grade")
	private String skillGrade;
	@SerializedName("add_feature_flag")
	private String addFeatureFlag;
}
