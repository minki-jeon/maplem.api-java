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
public class CharacterVMatrixDTO {
	@SerializedName("character_class")
	private String characterClass;
	@SerializedName("character_v_core_equipment")
	private List<VCoreInfoDTO> characterVCoreEquipment;
}
