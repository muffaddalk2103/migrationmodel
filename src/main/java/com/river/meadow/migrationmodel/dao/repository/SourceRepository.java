/**
 * 
 */
package com.river.meadow.migrationmodel.dao.repository;

import java.net.InetAddress;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.river.meadow.migrationmodel.dao.entity.Source;

/**
 * @author muffa
 *
 */
@Repository
public interface SourceRepository extends CassandraRepository<Source, InetAddress> {
}
