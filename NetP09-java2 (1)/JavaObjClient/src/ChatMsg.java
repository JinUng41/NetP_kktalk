
// ChatMsg.java ä�� �޽��� ObjectStream ��.
import java.io.Serializable;
import javax.swing.ImageIcon;

class ChatMsg implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String code; // 100:�α���, 400:�α׾ƿ�, 200:ä�ø޽���, 300:Image
	private String data;
	private String roomId;
	public ImageIcon img;

	public ChatMsg(String username, String code, String msg) {
		this.username = username;
		this.code = code;
		this.data = msg;
	}
	
	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getData() {
		return data;
	}

	public String getId() {
		return username;
	}

	public void setId(String username) {
		this.username = username;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}
}