# OpenMRS

[OpenMRS](https://openmrs.org/tr/) (Open Medical Record System), düşük kaynaklı bölgelerde sağlık hizmetlerinin iyileştirilmesine yardımcı olmayı amaçlayan, açık kaynaklı bir elektronik tıbbi kayıt (EMR) sistemidir. Dünyanın dört bir yanındaki geliştiriciler ve sağlık profesyonelleri, OpenMRS’in geliştirilmesine ve uygulanmasına katkıda bulunmaktadır.

## Proje Hakkında

OpenMRS, 2004 yılında doğan bir açık kaynaklı proje olup, sağlık çalışanlarına klinik veri yönetiminde yardımcı olmak için geliştirilmiştir. OpenMRS, hastaların sağlık bilgilerini toplama, depolama, yönetme ve raporlama süreçlerini kolaylaştırır. Proje, çeşitli modüller ve özellikler ile özelleştirilebilir.

### Özellikler:
- Hasta kayıtlarını tutma ve yönetme
- Klinik ziyaret ve hasta durumu takipleri
- Laboratuvar sonuçlarının yönetimi
- Sağlık hizmetleri analizleri ve raporlama
- Modüler yapı ile genişletilebilirlik

## Gereksinimler

OpenMRS uygulamasını çalıştırabilmek için aşağıdaki sistem gereksinimlerine ihtiyaç vardır:

- **Java Development Kit (JDK)**: 10 veya üstü
- **Selenium Web Driver**: 4.23.x veya üstü
- **TestNG**: 7.9.x veya üstü
- **Git**: Versiyon kontrol sistemi
- **Modern bir tarayıcı**: Google Chrome, Mozilla Firefox, Microsoft Edge veya Safari gibi

# OpenMRS Test Süreçleri

## Test Edilen Özellikler

### 1. Sisteme Giriş (Login)
#### 1.1 Hataların Kontrolü
- **Amaç**: Yanlış kullanıcı adı veya şifre ile giriş yapıldığında uygun hata mesajının gösterilmesini sağlamak.
- **Test Süreci**:
    - Yanlış bir kullanıcı adı ve şifre ile giriş yapılmaya çalışılır.
    - Hata mesajının doğru bir şekilde görüntülendiği kontrol edilir (örneğin, "Kullanıcı adı veya şifre yanlış").

#### 1.2 Sisteme Giriş Yapmak
- **Amaç**: Doğru kimlik bilgileri ile sistemin açılmasını sağlamak.
- **Test Süreci**:
    - Doğru kullanıcı adı ve şifre girilir.
    - Başarılı giriş sonrası ana sayfaya yönlendirilip yönlendirilmediği kontrol edilir.

### 2. Sistemden Çıkış (Logout)
- **Amaç**: Kullanıcının sistemden çıkış yapabilmesini sağlamak.
- **Test Süreci**:
    - Kullanıcı giriş yaptıktan sonra çıkış yapma işlemi gerçekleştirilir.
    - Çıkış sonrası kullanıcı giriş sayfasına yönlendirilip yönlendirilmediği kontrol edilir.

### 3. Hasta Kayıt (My Account)
#### 3.1 Hasta Listesinde Arama
- **Amaç**: Kullanıcıların hastaları arama fonksiyonunu test etmek.
- **Test Süreci**:
    - Belirli bir hastanın ismi ile arama yapılır.
    - Arama sonuçlarının doğru bir şekilde gösterilip gösterilmediği kontrol edilir.

#### 3.2 Hasta Silme
- **Amaç**: Kullanıcının bir hastanın kaydını silebilmesini sağlamak.
- **Test Süreci**:
    - Silinecek hasta seçilir ve silme işlemi gerçekleştirilir.
    - Silme işlemi sonrası hasta kaydının hala listede olup olmadığını kontrol edilerek silinip silinmediği doğrulanır.

#### 3.3 Hasta Listeleme
- **Amaç**: Sistemde kayıtlı tüm hastaların listelenebilmesini sağlamak.
- **Test Süreci**:
    - Hasta listesi görüntülenir.
    - Listede yer alan hastaların doğru bir şekilde gösterilip gösterilmediği kontrol edilir.

#### 3.4 Hasta Kayıtlarını Birleştirme (Merge)
- **Amaç**: İki hasta kaydının birleştirilmesini sağlamak.
- **Test Süreci**:
    - Birleştirilecek hasta kayıtları seçilir.
    - Birleştirme işlemi sonrası hasta bilgilerinin doğru bir şekilde birleştirilip birleştirilmediği kontrol edilir.

### 4. Hasta Randevusu
#### 4.1 Yanlış Sistem Saat Dilimi ile Randevu Alma
- **Amaç**: Kullanıcıların yanlış bir saat diliminde randevu almaya çalıştıklarında karşılaştıkları hataların kontrolü.
- **Test Süreci**:
    - Kullanıcı yanlış bir saat diliminde randevu almaya çalışır.
    - Sistem tarafından gösterilen hata mesajlarının doğruluğu kontrol edilir (örneğin, "Lütfen doğru bir saat dilimi seçin").

## Test Süreçlerinin Genel Değerlendirmesi
- Tüm test süreçlerinde, beklenen sonuçların gerçekleştirilip gerçekleştirilmediği kontrol edilmeli.
- Herhangi bir hata veya uyumsuzluk durumunda, ilgili hata mesajlarının sistem tarafından doğru bir şekilde görüntülendiği kontrol edilmelidir.
- Test sonuçları ve herhangi bir hata durumu detaylı bir şekilde raporlanmalıdır.