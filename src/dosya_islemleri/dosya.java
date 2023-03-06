package dosya_islemleri;
import java.io.*;
import java.util.*;

public class dosya {

	public static void main(String[] args) throws IOException {
		menuGoster();
	
	}
	public static void menuGoster() throws IOException {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		
		while(x>=0 && x<5) {
			/* menü girişlerinin kontrölü
			 * istenen öğrencinin bilgileri düzenlenecek.,
			 * Bug : boşluktan sonra veri girilmemesi sorununu araştır (ana konu java scanner)
			 			// x harf değilse veya x ıntegerse gir onun dışında menuGoster

			 */
			System.out.println("1-KAYIT EKLE");
			System.out.println("2-LİSTELE");
			System.out.println("3-KAYIT ARA");
			System.out.println("4-VERİLERİ SİL");
			System.out.println("0-ÇIKIŞ");
			
			System.out.println("seçenek: ");
			x=sc.nextInt();
			switch(x) {
				case 0:
					menuGoster();
					break;
				case 1:
					bilgileriGir();
					break;
				case 2:
					Listele();	
					break;
				case 3:
					kayitGoster();
					break;
				case 4:
					verileriSil();
					break;
				default:
					System.out.println("Lütfen Geçerli Bir Seçenek Seçin.");
					menuGoster();
			}
		}
		
	}
		public static void kayitEkle(String ad, String soyad, String numara, String bölüm, String cinsiyet, 
				String dogumyeri, String yas, String telno) throws IOException {
			Ogrenci ogrenci1 = new Ogrenci();
			Manager manager = new Manager();
			ogrenci1.setAd(ad);
			ogrenci1.setSoyad(soyad);
			ogrenci1.setTelNo(telno);
			ogrenci1.setOgrenciNo(numara);
			ogrenci1.setBolum(bölüm);
			ogrenci1.setCinsiyet(cinsiyet);
			ogrenci1.setDogumYeri(dogumyeri);
			ogrenci1.setYas(yas);
			manager.ekle(ogrenci1);
		}
			
		public static void bilgileriGir() throws IOException {
			
			System.out.println("Ad Giriniz : ");
			Scanner add= new Scanner(System.in);
			String ad = add.next();
			System.out.println("Soyad Giriniz : ");
			Scanner syd= new Scanner(System.in);
			String soyad = syd.next();
			System.out.println("Bolumunuzu Giriniz : ");
			Scanner bolum = new Scanner(System.in);
			String bolm= bolum.next();
			System.out.println("okul numaranızı Giriniz : ");
			Scanner no = new Scanner(System.in);
			String numara= no.next();
			System.out.println("yasinizi Giriniz : ");
			Scanner yas=new Scanner(System.in);
			String yass= yas.next();
			System.out.println("dogum yerinizi Giriniz : ");
			Scanner dogumyeri = new Scanner(System.in);
			String dogumyerii= dogumyeri.next();
			System.out.println("telefon numaranızı Giriniz : ");
			Scanner telno=new Scanner(System.in);
			String telnu=telno.next();
			System.out.println("cinsiyetinizi Giriniz : ");
			Scanner cins=new Scanner(System.in);
			String cinsiyet = cins.next();
			kayitEkle(ad,soyad,numara,bolm,cinsiyet,dogumyerii,yass,telnu);
		}
		
		public static void Listele() throws IOException {
		    File file = new File("ogrenciler1.dat");
		    if(!file.exists()) {
		        file.createNewFile();
		    }
		    FileReader fileReader = new FileReader(file);
		    BufferedReader br = new BufferedReader(fileReader);
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		    br.close();
		}

		public static void kayitGoster() throws IOException {
			Scanner input = new Scanner(System.in);
			System.out.print("Aranacak kelimeyi girin: ");
			String searchWord = input.nextLine();
			File file = new File("ogrenciler1.dat");
			if(!file.exists()) {
				file.createNewFile();
			}else search(file,searchWord);


		}
		
		public static void verileriSil() throws IOException {
			 System.out.println("Tüm verileri silmek istiyor musunuz? (evet için 1, hayır için 2 yazınız)");
				File file = new File("ogrenciler1.dat");
				if(!file.exists()) {
					file.createNewFile();
				}
			 Scanner cevap = new Scanner(System.in);
			 int cvp = cevap.nextInt();
			 if(cvp == 1) {
				 		PrintWriter yazici = new PrintWriter(file);
			            yazici.print("");
			            yazici.close();
			            System.out.println("Dosyadaki tüm veriler silindi.");
			            menuGoster();
			            
			 } else menuGoster();
		
		}
		
		
		public static void search(File file, String searchedWord) throws FileNotFoundException {
			Scanner fileReader = new Scanner(file);
			while (fileReader.hasNextLine()) {
			    String line = fileReader.nextLine();
			    String searchedLine = line.toUpperCase();
			    if (searchedLine.contains(searchedWord.toUpperCase())) {
			        System.out.println(line);
			    }
			}
			fileReader.close();
		}
	

}

	

		
		
	
		



