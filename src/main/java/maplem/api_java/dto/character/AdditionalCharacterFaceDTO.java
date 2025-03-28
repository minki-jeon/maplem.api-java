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
public class AdditionalCharacterFaceDTO {
	@SerializedName("face_name")
	private String faceName;
	@SerializedName("base_color")
	private String baseColor;
	@SerializedName("mix_color")
	private String mixColor;
	@SerializedName("mix_rate")
	private String mixRate;
}
