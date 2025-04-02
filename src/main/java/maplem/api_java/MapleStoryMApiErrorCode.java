package maplem.api_java;

import lombok.Getter;

@Getter
public enum MapleStoryMApiErrorCode {

    OPENAPI00001("서버 내부 오류"),
    OPENAPI00002("권한이 없는 경우"),
    OPENAPI00003("유효하지 않은 식별자"),
    OPENAPI00004("파라미터 누락 또는 유효하지 않음"),
    OPENAPI00005("유효하지 않은 API KEY"),
    OPENAPI00006("유효하지 않은 게임 또는 API PATH"),
    OPENAPI00007("API 호출량 초과"),
    OPENAPI00009("데이터 준비 중"),
    OPENAPI00010("게임 점검 중"),
    OPENAPI00011("API 점검 중");
	
//	private final String code;
//	private final String message;
	private final String kr_message;
	
	MapleStoryMApiErrorCode(String value) {
//		this.code = name;
		this.kr_message = value;
	}
//	
//	public static MapleStoryMApiErrorCode fromString(String name) {
//        for (MapleStoryMApiErrorCode errorCode : MapleStoryMApiErrorCode.values()) {
//            if (errorCode.code.equals(name)) {
//                return errorCode;
//            }
//        }
//
//        throw new IllegalArgumentException("No enum constant for string: " + name);
//    }
}
