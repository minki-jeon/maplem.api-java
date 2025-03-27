package maplem.api_java.dto.character;

import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import maplem.api_java.Utils;

@AllArgsConstructor
@Data
@ToString
public class CharacterBasicDTO {
	
	@SerializedName("character_name")
	private String characterName;
	@SerializedName("world_name")
	private String worldName;
	@SerializedName("character_date_create")
	private String characterDateCreate;
	@SerializedName("character_date_last_login")
	private String characterDateLastLogin;
	@SerializedName("character_date_last_logout")
	private String characterDateLastLogout;
	@SerializedName("character_job_name")
	private String characterJobName;
	@SerializedName("character_gender")
	private String characterGender;
	@SerializedName("character_exp")
	private String characterExp;
	@SerializedName("character_level")
	private String characterLevel;
	
	public LocalDateTime getCharacterDateCreate() {
		return Utils.toLocalDateTime(this.characterDateCreate);
	}
	public LocalDateTime getCharacterDateLastLogin() {
		return Utils.toLocalDateTime(this.characterDateLastLogin);
	}
	public LocalDateTime getCharacterDateLastLogout() {
		return Utils.toLocalDateTime(this.characterDateLastLogout);
	}
}
