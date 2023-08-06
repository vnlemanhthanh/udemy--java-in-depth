package edu.fx.thrillio.controllers;

import edu.fx.thrillio.entities.Bookmark;
import edu.fx.thrillio.entities.User;
import edu.fx.thrillio.managers.BookmarkManager;

public class BookmarkController {
    private static BookmarkController instance = new BookmarkController();

    private BookmarkController() {
    }

    public static BookmarkController getInstance() {
	return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
	BookmarkManager.getInstance().saveUserBookmark(user, bookmark);

    }

}
