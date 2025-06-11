package ru.netology.oop.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.oop.domain.ListFilms;

public class ListFilmsManagerTest {

    ListFilms film1 = new ListFilms(1, "Бладшот", "боевик", "с 5 марта");
    ListFilms film2 = new ListFilms(2, "Вперёд", "мультфильм", "с 12 марта");
    ListFilms film3 = new ListFilms(3, "Отель 'Белград'", "комедия", "с 5 марта");
    ListFilms film4 = new ListFilms(4, "Джентельмены", "боевик", "с 13 февраля");
    ListFilms film5 = new ListFilms(5, "Человек-невидимка", "ужасы", "с 5 марта");
    ListFilms film6 = new ListFilms(6, "Тролли. Мировой тур", "мультфильм", "с 19 марта");
    ListFilms film7 = new ListFilms(7, "Номер один", "комедия", "с 19 марта");

    @Test
    public void testFindLast () {
        ListFilmsManager manager = new ListFilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        ListFilms[] expected = {film6, film5, film4, film3, film2};
        ListFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);


        ListFilms[] expected = {film1};
        ListFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);


        ListFilms[] expected = {film4, film3, film2, film1};
        ListFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4FindLast () {
        ListFilmsManager manager = new ListFilmsManager(7);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        ListFilms[] expected = {film7, film6, film5, film4, film3, film2, film1};
        ListFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5FindLast() {
        ListFilmsManager manager = new ListFilmsManager();


        ListFilms[] expected = {};
        ListFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6FindLast () {
        ListFilmsManager manager = new ListFilmsManager(4);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        ListFilms[] expected = {film7, film6, film5, film4};
        ListFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        ListFilms[] expected = {film1, film2, film3, film4, film5, film6, film7};
        ListFilms[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
