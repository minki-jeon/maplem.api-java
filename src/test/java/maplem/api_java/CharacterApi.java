package maplem.api_java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import maplem.api_java.dto.character.CharacterBasicDTO;
import maplem.api_java.dto.character.CharacterDTO;

@DisplayName("캐릭터 정보 조회")
public class CharacterApi {
	private static final String apiKey = System.getProperty("API_KEY");		// [Run Configurations > VM arguments]
	private static final MapleStoryMApi api = new MapleStoryMApi(apiKey);	// main
	private static final String ocid = "9aa8425eb305ff231a632c6507ab63ccc583003eb0448898768cf5ad982a332b";		// INPUT_OCID
	
	@Test
	@DisplayName("캐릭터 식별자(ocid) 조회")
	void getCharacter() {
		String nickname = "쩌밍";
		String world = "루나";
		CharacterDTO response = api.getCharacter(nickname, world);
		System.out.println(response.toString());
	}
//	
//	@Test
//	@DisplayName("기본 정보 조회")
//	void getCharacterBasic() {
//		CharacterBasicDTO response = api.getCharaterBasic(ocid);
//		System.out.println(response.toString());
//		System.out.println(response.getCharacterName());
//	}
}
