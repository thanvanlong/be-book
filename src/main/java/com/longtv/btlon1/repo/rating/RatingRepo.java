package com.longtv.btlon1.repo.rating;

import com.longtv.btlon1.entity.rating.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends MongoRepository<Rating, String> {
    List<Rating> findByBookId(String id);
}
