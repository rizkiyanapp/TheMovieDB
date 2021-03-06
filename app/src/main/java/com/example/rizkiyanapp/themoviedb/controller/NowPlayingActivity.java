package com.example.rizkiyanapp.themoviedb.controller;

import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rizkiyanapp.themoviedb.R;
import com.example.rizkiyanapp.themoviedb.adapter.ListMovieAdapter;

public class NowPlayingActivity extends Fragment implements SwipeRefreshLayout.OnRefreshListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_now_playing, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_list);
        recyclerView.setAdapter(new ListMovieAdapter());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        return rootView;
    }

    @Override
    public void onRefresh() {

    }
}