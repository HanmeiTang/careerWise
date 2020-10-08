package entity;

import java.util.Set;

public class Item {
	// Cast GitHub response to a concise hashmap
	private String itemId;
	private String name;
	private String address;
	private Set<String> keywords;
	private String imageUrl;
	private String url;

	public String getItemId() {
		return itemId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Set<String> getKeywords() {
		return keywords;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getUrl() {
		return url;
	}

	private Item(ItemBuilder ib) {
		this.itemId = ib.itemId;
		this.name = ib.name;
		this.address = ib.address;
		this.keywords = ib.keywords;
		this.imageUrl = ib.imageUrl;
		this.url = ib.url;

	}

	public static class ItemBuilder {
		private String itemId;
		private String name;
		private String address;
		private Set<String> keywords;
		private String imageUrl;
		private String url;

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setKeywords(Set<String> keywords) {
			this.keywords = keywords;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Item build() {
			return new Item(this);
		}

	}

}
