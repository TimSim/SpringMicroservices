package com.example.tim.repo;

import com.example.tim.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {
    /**
     * Find Tours associated with the Tour Package.
     *
     * @param code tour package code
     * @return List of found tours.
     */
    Page<Tour> findByTourPackageCode(@Param("code")String code, Pageable pageable);
}
