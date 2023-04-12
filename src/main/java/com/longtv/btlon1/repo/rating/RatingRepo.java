package com.longtv.btlon1.repo.rating;

import com.longtv.btlon1.entity.rating.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating, Long> {
    List<Rating> findByBookId(long id);
}
