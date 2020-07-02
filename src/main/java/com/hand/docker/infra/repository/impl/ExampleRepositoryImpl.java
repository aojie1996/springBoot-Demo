package com.hand.docker.infra.repository.impl;

import com.hand.docker.domain.entity.Example;
import com.hand.docker.domain.repository.ExampleRepository;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class ExampleRepositoryImpl extends BaseRepositoryImpl<Example> implements ExampleRepository {

}
