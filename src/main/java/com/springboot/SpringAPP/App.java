package com.springboot.SpringAPP;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.SpringAPP.dao.AccountRepository;
import com.springboot.SpringAPP.dao.BookmarkRepository;
import com.springboot.SpringAPP.domain.Account;
import com.springboot.SpringAPP.domain.BookMark;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	/*
	@Bean
	CommandLineRunner init(AccountRepository accountRepository,
			BookmarkRepository bookmarkRepository){
		
		return (evt) -> Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
					    .forEach(a -> {
					    	Account account = accountRepository.save(new Account(a,"password"));
					    	bookmarkRepository.save(new BookMark(account, "http://bookmark.com/1/" + a, "A description"));
					    	bookmarkRepository.save(new BookMark(account, "http://bookmark.com/2/" + a, "A description"));
					    });
		
	}
	*/
    public static void main( String[] args )
    {
       
       SpringApplication.run(App.class, args);
       Thread thread = Thread.currentThread();
      /* long id = thread.getId();
       String name = thread.getName();
       int priority = thread.getPriority();
       State state = thread.getState();
       String threadGroupName = thread.getThreadGroup().getName();
       System.out.println("id="+id+"; name="+name+"; "
       		+ "priority="+priority+"; state="+state+"; threadGroupName="+threadGroupName);
       */
    }
}
