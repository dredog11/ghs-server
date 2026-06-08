package de.champonthis.ghs.server.model;

import java.util.LinkedList;

import lombok.Data;

@Data
public class CampaignHistoryEntry {

	private long revision;
	private long timestamp;
	private LinkedList<String> info = new LinkedList<>();

}
