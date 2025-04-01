package maplem.api_java;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class MapleStoryMApiErrorBody {
	
	private Error error;
	
	@Getter
	@Setter
	class Error {
		private String name;
		private String message;
	}
}
