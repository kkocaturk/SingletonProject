package org.example;

/**
 * Ensure a class only has one instance, and provide a global point of access to it.
 *
 * Ya da
 *
 * Bir sınıfın sadece bir tane nesnesinin olduğundan emin ol ve ona global bir erişim noktası sağla.
 *
 *  * Singleton sınıfı dışında herhangi bir yerde yazılmasını engelleyebileceğiniz tek kısım “Singleton()” çağrısıdır.
 *  * Çünkü Java’da erişim sınırlaması sağlayan yapılar (access modifiers) temelde üye elementlere erişimi kontrol ederler.
 *  * Üye elementler ise ya üye değişkenler ya da üye metotlardır.
 *  * Yapılandırıcı da üye bir metot olarak bu erişim kısıtlamasına dahildir.
 *  * Kısaca, yapılandırıcıyı “private” olarak nitelerseniz, kimse “Singleton()” yapılandırıcı çağrısını yapamaz.
 *
 *
 *  “ Singleton sınıfının nesnesini, Singleton sınıfı dışında kimse oluşturamaz” .
 *  Yani Singleton, kendi nesnesini oluşturabilir çünkü “private” erişim niteleyicisi, kendi sınıfı için geçerli değildir.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();   // private  Singleton singleton = new Singleton(); //Singleton sınıfının nesnesi zaten Singleton sınıfı dışında bir yerde oluşturulamaz.
                                                            // Buradan şu sonuç çıkar, “singleton” ile referans verdiğimiz nesne, nesne değişkeni değil, sınıf değişkeni, yani “static” olmalıdır

    private static int count;
    private String name;

    private Singleton() {
        count++;
        name = "Singleton" + count;
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public void printName() {
        System.out.println(name);
    }
}
