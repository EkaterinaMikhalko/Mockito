package ru.netology.manager;

import ru.netology.domain.FilmItem;


public class PosterManager {

    private FilmItem [] items = new FilmItem[0];
    private int lastCount = 10;

    public PosterManager (){

    }

    public PosterManager (int lastCount) {
        this.lastCount = lastCount;
    }

    public void add (FilmItem item) {
        FilmItem [] tmp = new FilmItem[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp [tmp.length - 1] = item;
        this.items = tmp;

    }

    public FilmItem [] findAll () {
        return this.items;
    }

    public FilmItem [] findLast () {
        int resultLength;
        if (items.length < lastCount) {
            resultLength = items.length;
        } else {
            resultLength = lastCount;
        }
        FilmItem [] result = new FilmItem [resultLength];

        for (int i = 0; i < resultLength; i++){
            result [i] = items[items.length-1-i];
        }
        return result;

        }

    }

