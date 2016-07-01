package com.springboot.SpringAPP.domain;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import com.springboot.SpringAPP.web.BookmarkRestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class BookmarkResource extends ResourceSupport{

	private final BookMark bookMark;
	
	public BookmarkResource(BookMark bookMark){
		this.bookMark = bookMark;
		String username = this.bookMark.getAccount().getUsername();
		
		this.add(new Link(this.bookMark.getUri(), "bookmark-uri"));
		this.add(linkTo(BookmarkRestController.class, username).withRel("bookmarks"));
		this.add(linkTo(methodOn(BookmarkRestController.class, username)
				.readBookMark(username, bookMark.getId())).withSelfRel());
	}
	
	public BookMark getBookmark() {
        return bookMark;
    }

}
