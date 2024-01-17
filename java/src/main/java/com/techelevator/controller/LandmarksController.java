package com.techelevator.controller;

import com.techelevator.dao.LandmarksDao;
import com.techelevator.model.Landmarks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path="/landmarks/")
public class LandmarksController {

    @Autowired
    private LandmarksDao landmarksDao;

    @RequestMapping(path="{placeId}", method = RequestMethod.POST)
    public void createLandmark(@PathVariable String placeId){
        landmarksDao.createLandmark(placeId);
    }


}
