package dmacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Forest;

@Repository
public interface IForestRepo extends JpaRepository<Forest, Long>  {}
