package application;

import javafx.beans.property.SimpleStringProperty;

public class Szemely {
	private SimpleStringProperty id;
	private SimpleStringProperty vezetknev;
	private SimpleStringProperty keresztnev;
	private SimpleStringProperty szuletesidatum;
	
	public Szemely(String id, String vezeteknev, String keresztnev, String szuletesidatum) {
		this.id = new SimpleStringProperty(id);
		this.vezetknev = new SimpleStringProperty(vezeteknev);
		this.keresztnev = new SimpleStringProperty(keresztnev);
		this.szuletesidatum = new SimpleStringProperty(szuletesidatum);
	}

	public final SimpleStringProperty idProperty() {
		return this.id;
	}
	
	public final String getId() {
		return this.idProperty().get();
	}
	
	public final void setId(final String id) {
		this.idProperty().set(id);
	}
	
	public final SimpleStringProperty vezetknevProperty() {
		return this.vezetknev;
	}
	
	public final String getVezetknev() {
		return this.vezetknevProperty().get();
	}
	
	public final void setVezetknev(final String vezetknev) {
		this.vezetknevProperty().set(vezetknev);
	}
	
	public final SimpleStringProperty keresztnevProperty() {
		return this.keresztnev;
	}
	
	public final String getKeresztnev() {
		return this.keresztnevProperty().get();
	}
	
	public final void setKeresztnev(final String keresztnev) {
		this.keresztnevProperty().set(keresztnev);
	}
	
	public final SimpleStringProperty szuletesidatumProperty() {
		return this.szuletesidatum;
	}
	
	public final String getSzuletesidatum() {
		return this.szuletesidatumProperty().get();
	}
	
	public final void setSzuletesidatum(final String szuletesidatum) {
		this.szuletesidatumProperty().set(szuletesidatum);
	}
	
	
	
}
