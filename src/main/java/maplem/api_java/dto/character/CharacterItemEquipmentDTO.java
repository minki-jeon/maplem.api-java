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
public class CharacterItemEquipmentDTO {
	@SerializedName("item_equipment")
	private List<CharacterItemEquipmentInfoDTO> itemEquipment;
}
