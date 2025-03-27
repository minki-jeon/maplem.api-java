package maplem.api_java.templete;

import maplem.api_java.dto.character.CharacterBasicDTO;
import maplem.api_java.dto.character.CharacterDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface CharacterApi {
	@GET("maplestorym/v1/id")
	Call<CharacterDTO> getCharacter(@Header("x-nxopen-api-key") String apiKey, @Query("character_name") String characterName, @Query("world_name") String worldName);
	
	@GET("maplestorym/v1/character/basic")
	Call<CharacterBasicDTO> getCharacterBasic(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);
}
