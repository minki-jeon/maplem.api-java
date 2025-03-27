package maplem.api_java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import lombok.Getter;
import lombok.Setter;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import maplem.api_java.dto.character.CharacterBasicDTO;
import maplem.api_java.dto.character.CharacterDTO;
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
			// TODO thorw parseError(response);
		}
		
		return response.body();
	}
	
	public CharacterBasicDTO getCharacterBasic(String ocid) throws IOException {
		final Response<CharacterBasicDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacterBasic(this.apiKey, ocid)
				.execute();
		if (!response.isSuccessful()) {
			// TODO thorw parseError(response);
		}
		
		return response.body();
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
