package com.company;
/*
Создать класс Book, содержащий поля tring title    String author    String content
для каждого поля создать метод , который выводит на экран значения поля. Реализовать возможность добавления в книгу названия, имени автора и содержания.
выведите на экран названия, автора и сожержание.
 */
public class Book {
    String title;
    String author;
    String content;

    String getTitle(){
        return title;
    }
    void setTitle(String newTitle){
        title=newTitle;
    }
    String getAuthor(){
        return author;
    }
    void setAuthor(String newAuthor){
        author=newAuthor;
    }
    String getContent(){
        return content;
    }
    void  setContent(String newContent){

    }

}
