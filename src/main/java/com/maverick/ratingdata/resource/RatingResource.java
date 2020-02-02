package com.maverick.ratingdata.resource;

import java.util.ArrayList;
import java.util.List;

import com.maverick.ratingdata.models.Rating;
import com.maverick.ratingdata.models.UserRating;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RatingResource
 */

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)  {
        return new Rating(movieId, 8);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserMovieRating(@PathVariable("userId") String userId)  {
        List<Rating> ratings = new ArrayList<>();
        ratings.add(new Rating("12", 8));
        ratings.add(new Rating("13", 9));
        
        UserRating userRating = new UserRating();
        userRating.setRatingList(ratings);
        return userRating;
    }
    
}