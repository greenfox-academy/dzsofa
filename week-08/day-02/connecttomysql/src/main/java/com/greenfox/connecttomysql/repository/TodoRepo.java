package com.greenfox.connecttomysql.repository;

import com.greenfox.connecttomysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long>{
}
