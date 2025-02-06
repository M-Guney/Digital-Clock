---
# Guney's Digital Clock

Guney's Digital Clock, Java Swing kullanılarak geliştirilmiş, terminal benzeri dijital saat görüntüleyen ve gece/gündüz modları arasında geçiş yapabilen interaktif bir masaüstü uygulamasıdır.

![image](https://github.com/user-attachments/assets/f9f2b32f-e498-4f8f-bb7f-8acca1b4ef62)
![image](https://github.com/user-attachments/assets/2f29c240-0831-4bc6-afa5-a3b1125d55f2)


## Özellikler

- **Dijital Saat Görüntüleme:** Saat, dakika ve saniye bilgilerini "HH.MM.SS" formatında görüntüler.
- **Terminal Benzeri Çıkış:** Saat bilgisi, basit ASCII sanat tarzında üç satırlı dijital rakamlar olarak oluşturulur.
- **Gece/Gündüz Modu:** Uygulama, kullanıcı etkileşimi ile renk modları arasında geçiş yapabilir.  
  - **Gündüz Modu:** Arka plan koyu gri, metin yeşil.
  - **Gece Modu:** Arka plan beyaz, metin siyah.
- **Otomatik Güncelleme:** Saat her saniye güncellenir.

## Teknolojiler

- **Java SE 8 ve Üzeri**
- **Swing GUI Kütüphanesi**
- **Java Time API (java.time.LocalTime)**

## Proje Yapısı

```
DigitalClock/
├── src/
│   └── DigitalClock/  
│       ├── Clock.java           # Ana uygulama ve GUI mantığı
│       ├── DigitalClock.java    # Dijital saat ASCII sanatının oluşturulması
│       └── (Diğer yardımcı sınıflar)
├── README.md                    # Bu dosya
└── screenshot.png               # (Opsiyonel) Uygulama ekran görüntüsü
```

## Kurulum & Çalıştırma

### Önkoşullar

- Java Development Kit (JDK) 8 veya daha üst sürümün yüklü olduğundan emin olun.
- Tercihen bir IDE (IntelliJ IDEA, Eclipse, VS Code vs.) kullanabilirsiniz.

### Adımlar

1. **Projeyi Klonlayın**

   ```bash
   git clone https://github.com/kullaniciadi/guneys-digital-clock.git
   cd guneys-digital-clock
   ```

2. **Projeyi Derleyin ve Çalıştırın**

   IDE üzerinden açıp `Clock.java` dosyasındaki `main` metodunu çalıştırabilir veya komut satırından:

   ```bash
   javac -d bin src/DigitalClock/*.java
   java -cp bin DigitalClock.Clock
   ```

3. **Kullanım**

   - Uygulama başlatıldığında dijital saat otomatik olarak güncellenecektir.
   - Sağ altta yer alan mod butonuna tıklayarak gece/gündüz modları arasında geçiş yapabilirsiniz.

## İyileştirme Önerileri

- **Thread Yönetimi:** Uygulama kapatıldığında `Timer` nesnesinin düzgün sonlandırılması için ek cleanup kodları eklenebilir.
- **Daha Fazla Özelleştirme:** Renk ve tema seçenekleri geliştirilebilir.
- **Testler:** Birim testleri ekleyerek kodun güvenilirliği artırılabilir.

## Katkıda Bulunmak

Katkılarınızı memnuniyetle karşılıyoruz! Eğer hata bulursanız veya yeni özellikler eklemek isterseniz, lütfen bir [issue](https://github.com/kullaniciadi/guneys-digital-clock/issues) oluşturun veya pull request gönderin.

1. Fork yapın
2. Kendi branşınızda geliştirin
3. Pull Request oluşturun

## Lisans

Bu proje MIT Lisansı kapsamında lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasına bakın.

---

*Bu proje Muhammed Süleyman Guney tarafından geliştirilmiştir.*

--- 
