package com.example.user.weguide.logic;

import com.example.user.weguide.util.AssetType;

public class Asset {
	private AssetType type;
	private String asset;
	
	public Asset(AssetType type, String asset) {
		this.type = type;
		this.asset = asset;
	}

	public AssetType getType() {
		return type;
	}

	public void setType(AssetType type) {
		this.type = type;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}
	
	
}
