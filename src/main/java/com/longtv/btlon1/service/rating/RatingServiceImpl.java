package com.longtv.btlon1.service.rating;

import com.longtv.btlon1.entity.rating.Rating;
import com.longtv.btlon1.repo.rating.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    RatingRepo ratingRepo;

    @Override
    public boolean saveRating(Rating rating) {
        try{
            ratingRepo.save(rating);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Rating> getRatingByBookId(long id) {
        return ratingRepo.findByBookId(id);
    }
}
