package gameProject.entities.concretes;

import java.time.LocalDate;
import gameProject.entities.abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private double discountRate;
	private LocalDate startDate;
	private LocalDate expirationDate;
	
	public Campaign() {}

	public Campaign(int id, String campaignName, double discountRate, LocalDate startDate, LocalDate expirationDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.expirationDate = expirationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return getCampaignName();
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	
	
}
