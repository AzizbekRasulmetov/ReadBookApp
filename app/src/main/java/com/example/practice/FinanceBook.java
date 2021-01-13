package com.example.practice;

public class FinanceBook {

    private String name;
    private String author;
    private int pages;
    private String category;

    public static final FinanceBook[] FINANCE_BOOKS = {
            new FinanceBook("Rich Dad Poor Dad", "Robert Kiyosaki", 272, "Finance"),
            new FinanceBook("The Road To Financial Freedom", "Bodo Shaefer", 274, "Finance"),
          //  new FinanceBook("Think and Grow Rich", "Napaleon Hill", 238, "Personal success"),
          //  new FinanceBook("The Power Of Habit", "Charles Duhigg", 371, "Personal success"),
            new FinanceBook("Kira and a Dog Name Money", "Bodo Shaefer", 228, "Finance"),
            new FinanceBook("The Richest Man in Babylon", "George Clason", 144, "Personal success")
    };

    public FinanceBook(){}
    public FinanceBook(String name, String author, int pages, String category){
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.category = category;
    }



    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    public String toString(){
        return this.getName();
    }
}
