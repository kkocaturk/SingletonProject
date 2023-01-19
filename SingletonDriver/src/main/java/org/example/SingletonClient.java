package org.example;

public class SingletonClient {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            Singleton s = Singleton.getInstance();
            s.printName();
        }
       // Singleton singleton=new Singleton(); olmuyor çünkü  Singleton private

    }
}
/* çıktılar

Singleton1
Singleton1
Singleton1
Singleton1
Singleton1

Process finished with exit code 0
 */