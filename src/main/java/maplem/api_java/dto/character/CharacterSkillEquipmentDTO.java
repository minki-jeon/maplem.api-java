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
public class CharacterSkillEquipmentDTO {
	@SerializedName("character_class")
	private String characterClass;
	@SerializedName("skill")
	private SkillInfoDTO skill;
}
