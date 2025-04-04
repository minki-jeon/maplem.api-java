package maplem.api_java.templete;

import maplem.api_java.dto.notice.EventNoticeDetailDTO;
import maplem.api_java.dto.notice.EventNoticeListDTO;
import maplem.api_java.dto.notice.NoticeDetailDTO;
import maplem.api_java.dto.notice.NoticeListDTO;
import maplem.api_java.dto.notice.PatchNoticeDetailDTO;
import maplem.api_java.dto.notice.PatchNoticeListDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface NoticeApi {
	@GET("maplestorym/v1/notice")
	Call<NoticeListDTO> getNoticeList(@Header("x-nxopen-api-key") String apiKey);
	
	@GET("maplestorym/v1/notice/detail")
	Call<NoticeDetailDTO> getNoticeDetail(@Header("x-nxopen-api-key") String apiKey, @Query("notice_id") int noticeId);
	
	@GET("maplestorym/v1/notice-patch")
	Call<PatchNoticeListDTO> getPatchNoticeList(@Header("x-nxopen-api-key") String apiKey);
	
	@GET("maplestorym/v1/notice-patch/detail")
	Call<PatchNoticeDetailDTO> getPatchNoticeDetail(@Header("x-nxopen-api-key") String apiKey, @Query("notice_id") int noticeId);
	
	@GET("maplestorym/v1/notice-event")
	Call<EventNoticeListDTO> getEventNoticeList(@Header("x-nxopen-api-key") String apiKey);
	
	@GET("maplestorym/v1/notice-event/detail")
	Call<EventNoticeDetailDTO> getEventNoticeDetail(@Header("x-nxopen-api-key") String apiKey, @Query("notice_id") int noticeId);
	
	
}
