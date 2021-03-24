package com.example.mvvmsaad.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvmsaad.R;
import com.example.mvvmsaad.viewmodels.MostPopularTVShowsViewModel;


public class MainActivity extends AppCompatActivity {

    private MostPopularTVShowsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MostPopularTVShowsViewModel.class);
        getMostPopularTVShows();//fun called

    }
private void getMostPopularTVShows ()
{
    viewModel.getMostPopularTVShows(0).observe(this, mostPopularTVShowsResponse
            ->Toast.makeText(getApplicationContext(),"total pages"+ mostPopularTVShowsResponse.getTotalPages(),
            Toast.LENGTH_SHORT).show());
}

}