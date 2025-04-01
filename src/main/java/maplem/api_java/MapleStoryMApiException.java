package maplem.api_java;

import lombok.Getter;

@Getter
public class MapleStoryMApiException extends RuntimeException {
	private final String errorCode;
	private final String message;
	
	public MapleStoryMApiException(MapleStoryMApiErrorBody errorBody) {
		super(errorBody.getError().getMessage());
		
		this.errorCode = errorBody.getError().getName();
		this.message = errorBody.getError().getMessage();
	}
	
	public MapleStoryMApiException(String errorCode, String message) {
		super(message);
		
		this.errorCode = errorCode;
		this.message = message;
	}
}
