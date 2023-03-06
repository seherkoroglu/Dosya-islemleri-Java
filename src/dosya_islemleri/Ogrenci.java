package dosya_islemleri;

public class Ogrenci {
	public String ad;
	public String soyad;
	public String ogrenciNo;
	public String bolum;
	public String cinsiyet;
	public String yas;
	public String dogumYeri;
	public String telNo;
		
	public Ogrenci() {
		super();
	}

	public Ogrenci(String ad, String soyad, String ogrenciNo, String bolum, String cinsiyet, String yas,
			String dogumYeri, String telNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.ogrenciNo = ogrenciNo;
		this.bolum = bolum;
		this.cinsiyet = cinsiyet;
		this.yas = yas;
		this.dogumYeri = dogumYeri;
		this.telNo = telNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	
	
}
