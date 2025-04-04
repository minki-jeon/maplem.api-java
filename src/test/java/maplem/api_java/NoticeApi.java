package maplem.api_java;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import maplem.api_java.dto.notice.EventNoticeDetailDTO;
import maplem.api_java.dto.notice.EventNoticeListDTO;
import maplem.api_java.dto.notice.NoticeDetailDTO;
import maplem.api_java.dto.notice.NoticeListDTO;
import maplem.api_java.dto.notice.PatchNoticeDetailDTO;
import maplem.api_java.dto.notice.PatchNoticeListDTO;

@DisplayName("공지 정보 조회")
public class NoticeApi {
	private static final String apiKey = System.getProperty("API_KEY");		// [Run Configurations > VM arguments]
	private static final MapleStoryMApi api = new MapleStoryMApi(apiKey);	// main

	@Test
	@DisplayName("공지사항 목록 조회")
	void getNotice() throws IOException {
		NoticeListDTO response = api.getNoticeList();
		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("공지사항 상세 조회")
	void getNoticeDetail() throws Exception {
		NoticeListDTO list = api.getNoticeList();
		if (list.getNotice().isEmpty()) {
			throw new Exception("Empty Notice List");
		}
		
		int noticeId = list.getNotice().get(0).getNoticeId();
		NoticeDetailDTO response = api.getNoticeDetail(noticeId);
		
		System.out.println(response.toString());
	}
	@Test
	@DisplayName("패치노트 목록 조회")
	void getPatchNotice() throws IOException {
		PatchNoticeListDTO response = api.getPatchNoticeList();
		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("패치노트 상세 조회")
	void getPatchNoticeDetail() throws Exception {
		PatchNoticeListDTO list = api.getPatchNoticeList();
		if (list.getPatchNotice().isEmpty()) {
			throw new Exception("Empty Notice List");
		}
		
		int noticeId = list.getPatchNotice().get(0).getNoticeId();
		PatchNoticeDetailDTO response = api.getPatchNoticeDetail(noticeId);
		
		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("진행 중 이벤트 목록 조회")
	void getEventNotice() throws IOException {
		EventNoticeListDTO response = api.getEventNoticeList();
		System.out.println(response.toString());
	}
	
	@Test
	@DisplayName("진행 중 이벤트 상세 조회")
	void getEventNoticeDetail() throws Exception {
		EventNoticeListDTO list = api.getEventNoticeList();
		if (list.getEventNotice().isEmpty()) {
			throw new Exception("Empty Notice List");
		}
		
		int noticeId = list.getEventNotice().get(0).getNoticeId();
		EventNoticeDetailDTO response = api.getEventNoticeDetail(noticeId);
		
		System.out.println(response.toString());
	}
}
