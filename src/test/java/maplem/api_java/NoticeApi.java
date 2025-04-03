package maplem.api_java;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import maplem.api_java.dto.notice.NoticeListDTO;

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
}
