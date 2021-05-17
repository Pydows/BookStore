package metier;

import java.time.LocalDate;
import java.util.List;

public class Infos {
	private String title;
	private List<String> authors;
	private String description;
	private String publishedDate;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	@Override
	public String toString() {
		return "Infos [title=" + title + ", authors=" + authors + ", description=" + description + ", publishedDate="
				+ publishedDate + "]";
	}
	
	

}
