package com.ori.pojo.di;

import java.util.*;

/**
 * @author OriKey
 * @create 2020- 06- 17 18:49
 * -- 平凡才是唯一的答案 --
 **/
public class Student {
    private String name;
    private Address address;
    private List<String>hobbys;
    private Map<String,String>card;
    private Set<String >games;
    private String[]books;
    private Properties info;
    private String wife;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", games=" + games +
                ", books=" + Arrays.toString(books) +
                ", info=" + info +
                ", wife='" + wife + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}
