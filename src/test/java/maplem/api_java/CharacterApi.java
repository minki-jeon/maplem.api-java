package maplem.api_java;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import maplem.api_java.dto.character.CharacterBasicDTO;
import maplem.api_java.dto.character.CharacterBeautyEquipmentDTO;
import maplem.api_java.dto.character.CharacterDTO;
import maplem.api_java.dto.character.CharacterGuildDTO;
import maplem.api_java.dto.character.CharacterItemEquipmentDTO;
import maplem.api_java.dto.character.CharacterPetEquipmentDTO;
import maplem.api_java.dto.character.CharacterSkillEquipmentDTO;
import maplem.api_java.dto.character.CharacterStatDTO;
import maplem.api_java.dto.character.CharacterVMatrixDTO;

@DisplayName("캐릭터 정보 조회")
public class CharacterApi {
	private static final String apiKey = System.getProperty("API_KEY");		// [Run Configurations > VM arguments]
	private static final MapleStoryMApi api = new MapleStoryMApi(apiKey);	// main
	private static final String ocid = "9aa8425eb305ff231a632c6507ab63ccc583003eb0448898768cf5ad982a332b";		// INPUT_OCID

	@Test
	@DisplayName("캐릭터 식별자(ocid) 조회")
	void getCharacter() throws IOException {
		String nickname = "쩌밍";				// INPUT_NICKNAME
		String world = "루나";				// INPUT_WORLDNAME
		CharacterDTO response = api.getCharacter(nickname, world);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("기본 정보 조회")
	void getCharacterBasic() throws IOException {
		CharacterBasicDTO response = api.getCharacterBasic(ocid);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("장착 아이템 정보 조회")
	void getCharacterItemEquipment() throws IOException {
		CharacterItemEquipmentDTO response = api.getCharacterItemEquipment(ocid);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("스탯 정보 조회")
	void getCharacterStat() throws IOException {
		CharacterStatDTO response = api.getCharacterStat(ocid);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("가입한 길드 정보 조회")
	void getCharacterGuild() throws IOException {
		CharacterGuildDTO response = api.getCharacterGuild(ocid);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("장착 헤어, 성형, 피부 정보 조회")
	void getCharacterBeautyEquipment() throws IOException {
		CharacterBeautyEquipmentDTO response = api.getCharacterBeautyEquipment(ocid);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("장착 펫 정보 조회")
	void getCharacterPetEquipment() throws IOException {
		CharacterPetEquipmentDTO response = api.getCharacterPetEquipment(ocid);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("장착 스킬 정보 조회")
	void getCharacterSkillEquipment() throws IOException {
		CharacterSkillEquipmentDTO response = api.getCharacterSkillEquipment(ocid);
//		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("V매트릭스 정보 조회")
	void getCharacterVMaxtrix() throws IOException {
		CharacterVMatrixDTO response = api.getCharacterVMatrix(ocid);
//		System.out.println(response.toString());
	}
}
