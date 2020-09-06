package com.example.designpattern.iterator;
/**
 * 书架类
 * @author zhangquanwei
 */
public class BookShelf implements Aggregate {
    private Book[] books;

    private int last = 0;

    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }

    /**
     * 获得书籍
     * @param index
     * @return
     */
    public Book getBookAt(int index){

        return books[index];

    }

    /**
     * 添加书籍
     * @param book
     */
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    /**
     * 获得书架上的书籍数量
     * @return
     */
    public int getLength(){
        return books.length;
    }

    /**
     * 获得书架迭代器对象
     * @return
     */
    @Override
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
