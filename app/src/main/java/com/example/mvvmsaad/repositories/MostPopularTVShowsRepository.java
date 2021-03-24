package com.example.mvvmsaad.repositories;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmsaad.network.ApiClient;
import com.example.mvvmsaad.network.ApiService;
import com.example.mvvmsaad.responses.TVShowResponses;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostPopularTVShowsRepository {
    private final ApiService apiService;

    public MostPopularTVShowsRepository() {

        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TVShowResponses> getMostPopularTVShows(int page) {
        MutableLiveData<TVShowResponses> data = new MutableLiveData<>();

        apiService.getMostPopularTVShows().enqueue(new Callback<TVShowResponses>() {
            @Override
            public void onResponse(@NonNull  Call<TVShowResponses> call,@NonNull Response<TVShowResponses> response) {

                data.setValue(response.body());

            }

            @Override
            public void onFailure(@NonNull Call<TVShowResponses> call,@NonNull Throwable t) {
                data.setValue(null);
            }
        });
         return  data;
    }
}

