package maplem.api_java;

import java.util.concurrent.TimeUnit;

import lombok.Getter;
import lombok.Setter;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
	
	public CharacterDTO getCharacter(String characterName, String worldName) {
		final Response<CharacterDTO> response = buildRetrofit()
				.create(CharacterApi.class)
				.getCharacter(this.apiKey, characterName, worldName)
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
