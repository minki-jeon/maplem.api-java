package maplem.api_java.dto.character;

import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import maplem.api_java.Utils;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class CharacterPetEquipmentDTO {
	@SerializedName("pet_1_name")
	private String pet1Name;
	@SerializedName("pet_1_pet_type")
	private String pet1PetType;
	@SerializedName("pet_1_date_expire")
	private String pet1DateExpire;
	@SerializedName("pet_2_name")
	private String pet2Name;
	@SerializedName("pet_2_pet_type")
	private String pet2PetType;
	@SerializedName("pet_2_date_expire")
	private String pet2DateExpire;
	@SerializedName("pet_3_name")
	private String pet3Name;
	@SerializedName("pet_3_pet_type")
	private String pet3PetType;
	@SerializedName("pet_3_date_expire")
	private String pet3DateExpire;

	public LocalDateTime getPet1DateExpire() {
		return Utils.toLocalDateTime(this.pet1DateExpire);
	}
	public LocalDateTime getPet2DateExpire() {
		return Utils.toLocalDateTime(this.pet2DateExpire);
	}
	public LocalDateTime getPet3DateExpire() {
		return Utils.toLocalDateTime(this.pet3DateExpire);
	}
}
