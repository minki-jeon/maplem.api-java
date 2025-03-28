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
public class StellaMemorizeInfoDTO {
	@SerializedName("skill_name")
	private String skillName;
	@SerializedName("equipment_skill_set")
	private String equipmentSkillSet;
}
