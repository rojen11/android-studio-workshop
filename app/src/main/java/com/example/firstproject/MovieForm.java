package com.example.firstproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MovieForm#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MovieForm extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private MovieViewModel viewModel;

    public MovieForm() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MovieForm.
     */
    // TODO: Rename and change types and number of parameters
    public static MovieForm newInstance(String param1, String param2) {
        MovieForm fragment = new MovieForm();
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
        View view = inflater.inflate(R.layout.fragment_movie_form, container, false);

        Button submitButton = view.findViewById(R.id.movieSubmit);
        EditText title = view.findViewById(R.id.movieTitle);
        EditText description = view.findViewById(R.id.movieDescription);
        EditText releaseDate = view.findViewById(R.id.movieReleaseDate);
        EditText director = view.findViewById(R.id.movieDirector);
        EditText imageUrl = view.findViewById(R.id.movieImage);

        viewModel = new ViewModelProvider(requireActivity()).get(MovieViewModel.class);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setMovie(title.getText().toString(), description.getText().toString(), releaseDate.getText().toString(), director.getText().toString(), imageUrl.getText().toString());
                Navigation.findNavController(view).navigate(R.id.action_movieForm_to_movieDetail);
            }
        });

        return view;
    }
}