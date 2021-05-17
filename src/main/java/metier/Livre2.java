package metier;

import com.google.gson.annotations.SerializedName;

public class Livre2 {
	private String id;
	
	private Infos volumeInfo;
	
	public Livre2() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Infos getVolumeInfo() {
		return volumeInfo;
	}

	public void setVolumeInfo(Infos volumeInfo) {
		this.volumeInfo = volumeInfo;
	}

	@Override
	public String toString() {
		return "Livre2 [id=" + id + ", volumeInfo=" + volumeInfo + "]";
	}

	
}
