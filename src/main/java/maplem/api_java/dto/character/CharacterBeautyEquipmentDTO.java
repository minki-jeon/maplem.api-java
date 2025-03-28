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
public class CharacterBeautyEquipmentDTO {

	@SerializedName("character_gender")
	private String characterGender;
	@SerializedName("character_class")
	private String characterClass;
	@SerializedName("character_hair")
	private CharacterHairDTO characterHair;
	@SerializedName("character_face")
	private CharacterFaceDTO characterFace;
	@SerializedName("character_skin_name")
	private String characterSkinName;
	@SerializedName("additional_character_hair")
	private AdditionalCharacterHairDTO additionalCharacterHair;
	@SerializedName("additional_character_face")
	private AdditionalCharacterFaceDTO additionalCharacterFace;
	@SerializedName("additional_character_skin_name")
	private String additionalCharacterSkinName;
	
}
