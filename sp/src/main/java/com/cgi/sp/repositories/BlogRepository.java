package com.cgi.sp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cgi.sp.domain.Blog;
import com.cgi.sp.domain.Employee;

public interface BlogRepository extends CrudRepository<Blog, Integer>{
	 Iterable<Blog> findByAuthorName(String authorName);

}
