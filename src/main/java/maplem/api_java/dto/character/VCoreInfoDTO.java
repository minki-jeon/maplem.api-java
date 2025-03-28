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
public class VCoreInfoDTO {
	@SerializedName("slot_id")
	private String slotId;
	@SerializedName("slot_level")
	private Integer slotLevel;
	@SerializedName("v_core_name")
	private String vCoreName;
	@SerializedName("v_core_type")
	private String vCoreType;
	@SerializedName("v_core_level")
	private Integer vCoreLevel;
	@SerializedName("v_core_skill_name_1")
	private String vCoreSkillName1;
	@SerializedName("v_core_skill_name_2")
	private String vCoreSkillName2;
	@SerializedName("v_core_skill_name_3")
	private String vCoreSkillName3;
}
