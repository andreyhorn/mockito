package ru.netology.oop.manager;

import ru.netology.oop.domain.ListFilms;

public class ListFilmsManager {

    private ListFilms[] film = new ListFilms[0];
    private int limit;

    public ListFilmsManager() {
        limit = 5;
    }

    public ListFilmsManager(int limit) {
        this.limit = limit;
    }


    public void add(ListFilms item) {
        ListFilms[] tmp = new ListFilms[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = item;
        film = tmp;

    }

    public ListFilms[] findAll() {
        return film;
    }

    public ListFilms[] findLast() {
        ListFilms[] film = findAll();
        ListFilms[] result;
        if (limit < film.length) {
            result = new ListFilms[limit];
        } else {
            result = new ListFilms[film.length];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = film[film.length - 1 - i];
        }
        return result;
    }

}
