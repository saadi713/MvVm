package com.example.mvvmsaad.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmsaad.models.TVShow;
import com.example.mvvmsaad.repositories.MostPopularTVShowsRepository;
import com.example.mvvmsaad.responses.TVShowResponses;

public class MostPopularTVShowsViewModel extends ViewModel {
//vm here
    public MostPopularTVShowsRepository mostPopularTVShowsRepository;
    public  MostPopularTVShowsViewModel ()
    {
        mostPopularTVShowsRepository = new MostPopularTVShowsRepository();

    }
    public  LiveData<TVShowResponses> getMostPopularTVShows(int page)
    {
        return  mostPopularTVShowsRepository.getMostPopularTVShows(page);
    }

}