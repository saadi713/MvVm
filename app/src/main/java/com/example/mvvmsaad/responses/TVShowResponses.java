package com.example.mvvmsaad.responses;

import com.example.mvvmsaad.models.TVShow;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowResponses {
//page pages same as on api and getters
    @SerializedName("page")
    private int page;

    @SerializedName("pages")
    private int totalPages;

    @SerializedName("tv_shows")
    private List<TVShow> tvShows;


    public int getPage() {
        return page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<TVShow> getTvShows() {
        return tvShows;
    }
}
