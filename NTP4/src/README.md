# Java OOP Pratikleri - Bölüm 4 (NTP4)

Bu proje, Java'da Nesne Tabanlı Programlama (OOP) kapsamında ileri düzey sınıf özelliklerini, yapıcı metotları (constructors) ve bellek yönetimini (static kavramı) pekiştirmek amacıyla yazılmış pratik kodlarını içermektedir.

## İçerik ve Paket Yapısı

Proje içerisinde yer alan paketler ve odaklandıkları konular şunlardır:

* **`BankaHesabi/`**: Yapıcı metotların aşırı yüklenmesi (Constructor Overloading), `this()` anahtar kelimesi ile yapıcılar arası geçiş ve `static` değişken kullanılarak oluşturulan nesne sayısının (toplam hesap sayısı) takip edilmesi.
* **`Ev/` & `Ev2/`**: Farklı parametre kombinasyonlarıyla nesne üretimi. Sınıfa ait (`static`) değişkenler ile nesneye ait değişkenler arasındaki temel davranış farklarının incelenmesi.
* **`Magaza/`**: Sınıf değişkenlerinin varsayılan değerleri ve `static` metotlar içerisinden nesne oluşturarak diğer metotlara erişim mantığı. *(Not: Bu pakette metotların birbirini çağırmasıyla oluşan bir sonsuz döngü (StackOverflow) konsepti de örneklendirilmiştir.)*
* **`Parametre/`**: Sınırsız sayıda parametre alabilen (Varargs - `int...`) metotların tanımlanması ve metot aşırı yükleme (Method Overloading) kuralları.

## Öğrenim Hedefleri
* `static` ve *instance* (nesne) değişkenlerinin ayrımını kavramak.
* Kod tekrarını önlemek için `this()` ile constructor zincirleri kurmak.
* Varargs kullanarak esnek metotlar tasarlamak.