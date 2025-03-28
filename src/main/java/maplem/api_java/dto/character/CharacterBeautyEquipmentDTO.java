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
public class CharacterBeautyEquipmentDTO {

	@SerializedName("character_gender")
	private String characterGender;
	@SerializedName("character_class")
	private String characterClass;
	@SerializedName("character_hair")
	private List<CharacterHairInfoDTO> characterHair;
	@SerializedName("character_face")
	private List<CharacterFaceInfoDTO> characterFace;
	@SerializedName("character_skin_name")
	private String characterSkinName;
	@SerializedName("additional_character_hair")
	private List<AdditionalCharacterHairInfoDTO> additionalCharacterHair;
	@SerializedName("additional_character_face")
	private List<AdditionalCharacterFaceInfoDTO> additionalCharacterFace;
	@SerializedName("additional_character_skin_name")
	private String additionalCharacterSkinName;
	
}
