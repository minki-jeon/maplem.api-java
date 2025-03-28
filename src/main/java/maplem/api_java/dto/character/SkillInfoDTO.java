package maplem.api_java.dto.character;

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
public class SkillInfoDTO {
	@SerializedName("equipment_skill")
	private List<EquipmentSkillInfoDTO> equipmentSkill;
	@SerializedName("preset")
	private List<SkillPresetDTO> preset;
	@SerializedName("steal_skill")
	private List<StealSkillInfoDTO> stealSkill;
	@SerializedName("stella_memorize")
	private List<StellaMemorizeInfoDTO> stellaMemorize;
}
