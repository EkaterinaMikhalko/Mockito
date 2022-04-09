package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;
import ru.netology.manager.PosterManager;
import ru.netology.repository.FilmRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmTest {


    FilmItem first = new FilmItem(1, "Бладшот");
    FilmItem second = new FilmItem(2,"Вперед");
    FilmItem third = new FilmItem(3,"Отель Белград");
    FilmItem forth = new FilmItem(4,"Джентельмены");
    FilmItem fifth = new FilmItem(5,"Человек-невидимка");
    FilmItem sixth = new FilmItem(6,"Тролли.Мировой Тур");
    FilmItem seventh = new FilmItem(7,"Номер один");
    FilmItem eighth = new FilmItem(8,"Лулу и Бриггс");
    FilmItem ninth = new FilmItem(9,"Человек-паук. Нет пути домой");
    FilmItem tenth = new FilmItem(10,"Прятки");
    FilmItem eleventh = new FilmItem(11,"Кощей. Начало");

    @Test
    void findLastTen (){
        PosterManager manager = new PosterManager ();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        FilmItem [] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second};
        FilmItem [] actual = manager.findLast();
    }


    @Test
    void  findLast () {
        PosterManager manager = new PosterManager(2);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);

        FilmItem [] expected = {forth, third};
        FilmItem [] actual = manager.findLast();
    }

    @Test
    void removeById () {
        FilmRepository repo = new FilmRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);

        repo.removeById(1);

        FilmItem [] expected = {third, second};
        FilmItem [] actual = repo.findall();
    }

//    @Test
//    void findAll () {
//        FilmItem first = new FilmItem(1, "Бладшот");
//        FilmItem second = new FilmItem(2,"Вперед");
//        FilmItem third = new FilmItem(3,"Отель Белград");
//
//        PosterManager manager = new PosterManager ();
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//
//
//        manager.findAll();
//
//        FilmItem [] expected = {third, second, first};
//        FilmItem [] actual = manager.findLast();
//
//
//    }

}
