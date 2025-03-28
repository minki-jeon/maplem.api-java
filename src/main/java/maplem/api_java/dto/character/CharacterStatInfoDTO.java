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
public class CharacterStatInfoDTO {
	@SerializedName("stat_name")
	private String statName;
	@SerializedName("stat_value")
	private String statValue;
}
