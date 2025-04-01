package maplem.api_java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import maplem.api_java.dto.character.CharacterBasicDTO;
import maplem.api_java.dto.character.CharacterBeautyEquipmentDTO;
import maplem.api_java.dto.character.CharacterDTO;
import maplem.api_java.dto.character.CharacterGuildDTO;
import maplem.api_java.dto.character.CharacterItemEquipmentDTO;
import maplem.api_java.dto.character.CharacterPetEquipmentDTO;
import maplem.api_java.dto.character.CharacterSkillEquipmentDTO;
import maplem.api_java.dto.character.CharacterStatDTO;
import maplem.api_java.dto.character.CharacterVMatrixDTO;
import maplem.api_java.templete.CharacterApi;

public class MapleStoryMApi {
	private final String apiKey;
	private static final String BASE_URL = "https://open.api.nexon.com/";
	
	@Getter
	@Setter
	private long timeout;
	
	public MapleStoryMApi(String apiKey) {
		this.apiKey = apiKey;
		this.timeout = 5000;
	}
	
	public CharacterDTO getCharacter(String characterName, String worldName) throws IOException {
		final Response<CharacterDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacter(this.apiKey, characterName, worldName)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterBasicDTO getCharacterBasic(String ocid) throws IOException {
		final Response<CharacterBasicDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterBasic(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterItemEquipmentDTO getCharacterItemEquipment(String ocid) throws IOException {
		final Response<CharacterItemEquipmentDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterItemEquipment(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterStatDTO getCharacterStat(String ocid) throws IOException {
		final Response<CharacterStatDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterStat(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterGuildDTO getCharacterGuild(String ocid) throws IOException {
		final Response<CharacterGuildDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterGuild(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterBeautyEquipmentDTO getCharacterBeautyEquipment(String ocid) throws IOException {
		final Response<CharacterBeautyEquipmentDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterBeautyEquipment(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterPetEquipmentDTO getCharacterPetEquipment(String ocid) throws IOException {
		final Response<CharacterPetEquipmentDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterPetEquipment(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterSkillEquipmentDTO getCharacterSkillEquipment(String ocid) throws IOException {
		final Response<CharacterSkillEquipmentDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterSkillEquipment(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterVMatrixDTO getCharacterVMatrix(String ocid) throws IOException {
		final Response<CharacterVMatrixDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterVMatrix(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			throw parseError(response);
		}
		
		return response.body();
	}
	
	private static MapleStoryMApiException parseError(Response<?> response) throws IOException {
		final Gson gson = new Gson();
		final MapleStoryMApiErrorBody error = gson.fromJson(response.errorBody().string(), MapleStoryMApiErrorBody.class);
		
		return new MapleStoryMApiException(error);
	}
	
	
	private Retrofit buildRetrofit() {
		return new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.client(this.buildClient())
				.build();
	}
	
	private OkHttpClient buildClient() {
		return new OkHttpClient.Builder()
				.readTimeout(timeout, TimeUnit.MILLISECONDS)
				.connectTimeout(timeout, TimeUnit.MILLISECONDS)
				.build();
	}
	
}
