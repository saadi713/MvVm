package com.example.mvvmsaad.network;

import com.example.mvvmsaad.responses.TVShowResponses;

import retrofit2.Call;
import retrofit2.http.GET;

    public interface ApiService {

    @GET ("most-popular")

        Call<TVShowResponses> getMostPopularTVShows();

}
