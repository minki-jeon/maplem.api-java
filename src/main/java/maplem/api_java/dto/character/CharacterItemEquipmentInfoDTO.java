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
public class CharacterItemEquipmentInfoDTO {

	@SerializedName("item_name")
	private String itemName;
	@SerializedName("item_equipment_page_name")
	private String itemEquipmentPageName;
	@SerializedName("item_equipment_slot_name")
	private String itemEquipmentSlotName;
}
