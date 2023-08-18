package br.dev.brum.javadesignpatterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(Singleton.getInstance());
    }
}