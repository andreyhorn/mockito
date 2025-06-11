package ru.netology.oop.manager;

import ru.netology.oop.domain.ListFilms;

public class Main {
    public static void main(String[] args) {

        ListFilms film1 = new ListFilms(1, "Бладшот", "боевик", "с 5 марта");
        ListFilms film2 = new ListFilms(2, "Вперёд", "мультфильм", "с 12 марта");
        ListFilms film3 = new ListFilms(3, "Отель 'Белград'", "комедия", "с 5 марта");
        ListFilms film4 = new ListFilms(4, "Джентельмены", "боевик", "с 13 февраля");
        ListFilms film5 = new ListFilms(5, "Человек-невидимка", "ужасы", "с 5 марта");
        ListFilms film6 = new ListFilms(6, "Тролли. Мировой тур", "мультфильм", "с 19 марта");
        ListFilms film7 = new ListFilms(7, "Номер один", "комедия", "с 19 марта");

        ListFilmsManager manager = new ListFilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        ListFilms[] all = manager.findLast();
    }


}