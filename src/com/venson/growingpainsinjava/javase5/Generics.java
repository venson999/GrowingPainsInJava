package com.venson.growingpainsinjava.javase5;

import java.util.Stack;

public class Generics {

    public static void main(String[] args) {

        //========= box =========
        Box<Object> box = new Box<Object>();
        box.put(new Object());
        box.put(new Fruit());
        box.put(new Apple());
        box.put(new RedApple());
        box.put(new Banana());

        //========= fruitBox =========
        FruitBox fruitBox = new FruitBox();
        // fruitBox.put(new Object());
        fruitBox.put(new Fruit());
        fruitBox.put(new Apple());
        fruitBox.put(new RedApple());
        fruitBox.put(new Banana());

        //========= appleBox =========
        AppleBox appleBox = new AppleBox();
        // appleBox.put(new Object());
        // appleBox.put(new Fruit());
        appleBox.put(new Apple());
        appleBox.put(new RedApple());
        // appleBox.put(new Banana());

        //========= redAppleBox =========
        RedAppleBox redAppleBox = new RedAppleBox();
        // redAppleBox.put(new Object());
        // redAppleBox.put(new Fruit());
        // redAppleBox.put(new Apple());
        redAppleBox.put(new RedApple());
        // redAppleBox.put(new Banana());

        //========= bananaBox =========
        BananaBox bananaBox = new BananaBox();
        // bananaBox.put(new Object());
        // bananaBox.put(new Fruit());
        // bananaBox.put(new Apple());
        // bananaBox.put(new RedApple());
        bananaBox.put(new Banana());

        //========= box =========
        box.putAll(box);
        box.putAll(fruitBox);
        box.putAll(appleBox);
        box.putAll(redAppleBox);
        box.putAll(bananaBox);

        box.getAll(box);
        // box.getAll(fruitBox);
        // box.getAll(appleBox);
        // box.getAll(redAppleBox);
        // box.getAll(bananaBox);

        //========= fruitBox =========
        // fruitBox.putAll(box);
        fruitBox.putAll(fruitBox);
        fruitBox.putAll(appleBox);
        fruitBox.putAll(redAppleBox);
        fruitBox.putAll(bananaBox);

        fruitBox.getAll(box);
        fruitBox.getAll(fruitBox);
        // fruitBox.getAll(appleBox);
        // fruitBox.getAll(redAppleBox);
        // fruitBox.getAll(bananaBox);

        //========= appleBox =========
        // appleBox.putAll(box);
        // appleBox.putAll(fruitBox);
        appleBox.putAll(appleBox);
        appleBox.putAll(redAppleBox);
        // appleBox.putAll(bananaBox);

        appleBox.getAll(box);
        appleBox.getAll(fruitBox);
        appleBox.getAll(appleBox);
        // appleBox.getAll(redAppleBox);
        // appleBox.getAll(bananaBox);

        //========= redAppleBox =========
        // redAppleBox.putAll(box);
        // redAppleBox.putAll(fruitBox);
        // redAppleBox.putAll(appleBox);
        redAppleBox.putAll(redAppleBox);
        // redAppleBox.putAll(bananaBox);

        redAppleBox.getAll(box);
        redAppleBox.getAll(fruitBox);
        redAppleBox.getAll(appleBox);
        redAppleBox.getAll(redAppleBox);
        // redAppleBox.getAll(bananaBox);

        //========= bananaBox =========
        // bananaBox.putAll(box);
        // bananaBox.putAll(fruitBox);
        // bananaBox.putAll(appleBox);
        // bananaBox.putAll(redAppleBox);
         bananaBox.putAll(bananaBox);

        bananaBox.getAll(box);
        bananaBox.getAll(fruitBox);
        // bananaBox.getAll(appleBox);
        // bananaBox.getAll(redAppleBox);
        bananaBox.getAll(bananaBox);
    }
}

class Fruit {}

class Apple extends Fruit {}

class RedApple extends Apple {}

class Banana extends Fruit {}

class Box<T> {

    private Stack<T> container = new Stack<T>();

    public void put(T t) {
        container.push(t);
    }

    public T get() {
        return container.pop();
    }

    public boolean isEmpty() {
        return container.empty();
    }

    public void putAll(Box<? extends T> box) {
        while (!box.isEmpty()) {
            put((box.get()));
        }
    }

    public void getAll(Box<? super T> box) {
        while (!isEmpty()) {
            box.put(get());
        }
    }
}

class FruitBox extends Box<Fruit> {}

class AppleBox extends Box<Apple> {}

class RedAppleBox extends Box<RedApple> {}

class BananaBox extends Box<Banana> {}
