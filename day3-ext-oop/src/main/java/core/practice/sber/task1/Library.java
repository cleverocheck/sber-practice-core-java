package core.practice.sber.task1;

import java.util.ArrayList;

class Library {
    private final ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public boolean borrowItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title) && !item.isBorrowed()) {
                item.setBorrowed(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title) && item.isBorrowed()) {
                item.setBorrowed(false);
                return true;
            }
        }
        return false;
    }

    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) return item;
        }
        return null;
    }
}

