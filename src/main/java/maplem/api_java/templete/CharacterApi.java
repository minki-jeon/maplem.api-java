package maplem.api_java.templete;

import maplem.api_java.dto.character.CharacterBasicDTO;
import maplem.api_java.dto.character.CharacterBeautyEquipmentDTO;
import maplem.api_java.dto.character.CharacterDTO;
import maplem.api_java.dto.character.CharacterGuildDTO;
import maplem.api_java.dto.character.CharacterItemEquipmentDTO;
import maplem.api_java.dto.character.CharacterPetEquipmentDTO;
import maplem.api_java.dto.character.CharacterSkillEquipmentDTO;
import maplem.api_java.dto.character.CharacterStatDTO;
import maplem.api_java.dto.character.CharacterVMatrixDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface CharacterApi {
	@GET("maplestorym/v1/id")
	Call<CharacterDTO> getCharacter(@Header("x-nxopen-api-key") String apiKey, @Query("character_name") String characterName, @Query("world_name") String worldName);
	
	@GET("maplestorym/v1/character/basic")
	Call<CharacterBasicDTO> getCharacterBasic(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);
	
	@GET("maplestorym/v1/character/item-equipment")
	Call<CharacterItemEquipmentDTO> getCharacterItemEquipment(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);

	@GET("maplestorym/v1/character/stat")
	Call<CharacterStatDTO> getCharacterStat(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);

	@GET("maplestorym/v1/character/guild")
	Call<CharacterGuildDTO> getCharacterGuild(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);

	@GET("maplestorym/v1/character/beauty-equipment")
	Call<CharacterBeautyEquipmentDTO> getCharacterBeautyEquipment(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);

	@GET("maplestorym/v1/character/pet-equipment")
	Call<CharacterPetEquipmentDTO> getCharacterPetEquipment(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);

	@GET("maplestorym/v1/character/skill-equipment")
	Call<CharacterSkillEquipmentDTO> getCharacterSkillEquipment(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);

	@GET("maplestorym/v1/character/vmatrix")
	Call<CharacterVMatrixDTO> getCharacterVMatrix(@Header("x-nxopen-api-key") String apiKey, @Query("ocid") String ocid);
}
