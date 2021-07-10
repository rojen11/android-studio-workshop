package com.example.firstproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MovieDetail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MovieDetail extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private MovieViewModel viewModel;

    public MovieDetail() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MovieDetail.
     */
    // TODO: Rename and change types and number of parameters
    public static MovieDetail newInstance(String param1, String param2) {
        MovieDetail fragment = new MovieDetail();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie_detail, container, false);

        viewModel = new ViewModelProvider(requireActivity()).get(MovieViewModel.class);

        // Get elements from xml
        TextView title = view.findViewById(R.id.movieDetailTitle);
        TextView description = view.findViewById(R.id.movieDetailDescription);
        TextView releasedDate = view.findViewById(R.id.movieDetailReleasedDate);
        TextView director = view.findViewById(R.id.movieDetailDirector);

        ImageView image = view.findViewById(R.id.movieDetailImage);

        // Set details of form
        title.setText(viewModel.getMovieTitle());
        description.setText(viewModel.getMovieDescription());
        releasedDate.setText(viewModel.getMovieReleaseYear());
        director.setText(viewModel.getMovieDirector());

        if (viewModel.getMovieImageUrl() != null) {
            Glide.with(view).asBitmap().load(viewModel.getMovieImageUrl()).into(image);
        }

        return view;
    }
}