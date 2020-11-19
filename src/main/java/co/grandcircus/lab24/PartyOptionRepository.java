package co.grandcircus.lab24;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface PartyOptionRepository extends JpaRepository<PartyOption,Long>{

	@Query(value = "select * from partyoption where partyoption.votes <> ?1 order by votes", nativeQuery = true)
	List<PartyOption> findByVotes(int zero);
}
