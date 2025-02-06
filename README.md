
Guney's Digital Clock
Guney's Digital Clock, Java Swing kullanılarak geliştirilmiş, terminal benzeri dijital saat görüntüleyen ve gece/gündüz modları arasında geçiş yapabilen interaktif bir masaüstü uygulamasıdır.


Örnek Ekran Görüntüsü (Opsiyonel: Proje dizininde screenshot.png olarak ekleyin)

Özellikler
Dijital Saat Görüntüleme: Saat, dakika ve saniye bilgilerini "HH.MM.SS" formatında görüntüler.
Terminal Benzeri Çıkış: Saat bilgisi, basit ASCII sanat tarzında üç satırlı dijital rakamlar olarak oluşturulur.
Gece/Gündüz Modu: Uygulama, kullanıcı etkileşimi ile renk modları arasında geçiş yapabilir.
Gündüz Modu: Arka plan koyu gri, metin yeşil.
Gece Modu: Arka plan beyaz, metin siyah.
Otomatik Güncelleme: Saat her saniye güncellenir.
Teknolojiler
Java SE 8 ve Üzeri
Swing GUI Kütüphanesi
Java Time API (java.time.LocalTime)
Proje Yapısı
graphql
Kopyala
Düzenle
DigitalClock/
├── src/
│   └── DigitalClock/  
│       ├── Clock.java           # Ana uygulama ve GUI mantığı
│       ├── DigitalClock.java    # Dijital saat ASCII sanatının oluşturulması
│       └── (Diğer yardımcı sınıflar)
├── README.md                    # Bu dosya
└── screenshot.png               # (Opsiyonel) Uygulama ekran görüntüsü
Kurulum & Çalıştırma
Önkoşullar
Java Development Kit (JDK) 8 veya daha üst sürümün yüklü olduğundan emin olun.
Tercihen bir IDE (IntelliJ IDEA, Eclipse, VS Code vs.) kullanabilirsiniz.
Adımlar
Projeyi Klonlayın

bash
Kopyala
Düzenle
git clone https://github.com/kullaniciadi/guneys-digital-clock.git
cd guneys-digital-clock
Projeyi Derleyin ve Çalıştırın

IDE üzerinden açıp Clock.java dosyasındaki main metodunu çalıştırabilir veya komut satırından:

bash
Kopyala
Düzenle
javac -d bin src/DigitalClock/*.java
java -cp bin DigitalClock.Clock
Kullanım

Uygulama başlatıldığında dijital saat otomatik olarak güncellenecektir.
Sağ üstte yer alan mod butonuna tıklayarak gece/gündüz modları arasında geçiş yapabilirsiniz.
İyileştirme Önerileri
Thread Yönetimi: Uygulama kapatıldığında Timer nesnesinin düzgün sonlandırılması için ek cleanup kodları eklenebilir.
Daha Fazla Özelleştirme: Renk ve tema seçenekleri geliştirilebilir.
Testler: Birim testleri ekleyerek kodun güvenilirliği artırılabilir.
Katkıda Bulunmak
Katkılarınızı memnuniyetle karşılıyoruz! Eğer hata bulursanız veya yeni özellikler eklemek isterseniz, lütfen bir issue oluşturun veya pull request gönderin.

Fork yapın
Kendi branşınızda geliştirin
Pull Request oluşturun
Lisans
Bu proje MIT Lisansı kapsamında lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasına bakın.

Bu proje Guney tarafından geliştirilmiştir.

README dosyasını güncel tutmak, projeyi kullanan herkese net bilgi sağlamak adına önemlidir.
