package com.longtv.btlon1.service.rating;

import com.longtv.btlon1.entity.rating.Rating;

import java.util.List;

public interface RatingService {
    boolean saveRating(Rating rating);
    List<Rating> getRatingByBookId(String id);
}
