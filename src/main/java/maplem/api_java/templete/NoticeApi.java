package maplem.api_java.templete;

import maplem.api_java.dto.notice.NoticeListDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface NoticeApi {
	@GET("maplestorym/v1/notice")
	Call<NoticeListDTO> getNoticeList(@Header("x-nxopen-api-key") String apiKey);
}
