package dosya_islemleri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
	
	public Manager() {}
	
	public void ekle(Ogrenci ogrenci) throws IOException {
		File file = new File("ogrenciler1.dat");
		FileWriter fWriter = new FileWriter(file,true);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		if(!file.exists()) {
			file.createNewFile();
		}
		String adF = String.format(" "+"%9s",ogrenci.getAd());
		String soyadf = String.format(" "+"%9s", ogrenci.getSoyad());
		String numaraf = String.format(" "+"%9s", ogrenci.getOgrenciNo());
		String bolumf = String.format(" "+"%9s", ogrenci.getBolum());
		String cinsf = String.format(" "+"%9s", ogrenci.getCinsiyet());
		String dgyerf = String.format(" "+"%9s", ogrenci.getDogumYeri());
		String yasf = String.format(" "+"%9s", ogrenci.getYas());
		String telf = String.format(" "+"%9s", ogrenci.getTelNo());
		bWriter.write("\n");
		bWriter.write(adF); 
		bWriter.write(soyadf);
		bWriter.write(numaraf);
		bWriter.write(cinsf);
		bWriter.write(dgyerf);
		bWriter.write(yasf);
		bWriter.write(telf);
		bWriter.write(bolumf);
		bWriter.close();
		System.out.println(adF+soyadf+numaraf+cinsf+dgyerf+yasf+telf+bolumf+" Eklendi");
	}
	
}
