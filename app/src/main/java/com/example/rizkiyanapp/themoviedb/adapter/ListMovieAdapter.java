package com.example.rizkiyanapp.themoviedb.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.rizkiyanapp.themoviedb.R;

/**
 * Created by rizkiyanapp on 6/24/17.
 */

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.MovieViewHolder> {

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView movie_poster;
        TextView movie_tittle;
        RatingBar movie_rating;
        TextView movie_desc;

        public MovieViewHolder(View itemView) {
            super(itemView);

            movie_poster = (ImageView) itemView.findViewById(R.id.movie_poster_image);
            movie_tittle = (TextView) itemView.findViewById(R.id.movie_tittle);
            movie_rating = (RatingBar) itemView.findViewById(R.id.movie_rating);
            movie_rating.setMax(10);
            movie_desc = (TextView) itemView.findViewById(R.id.movie_desc);
        }
    }


    @Override
    public ListMovieAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_movie, parent, false);
        MovieViewHolder movieViewHolder = new MovieViewHolder(view);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(ListMovieAdapter.MovieViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 25;
    }
}
