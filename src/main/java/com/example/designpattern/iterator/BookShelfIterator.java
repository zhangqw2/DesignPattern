package com.example.designpattern.iterator;

/**
 * @author zhangquanwei
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 检测是否还有下一本书
     * @return
     */
    @Override
    public boolean hasNext() {
        if(index<bookShelf.getLength()){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 返回下一本书
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
