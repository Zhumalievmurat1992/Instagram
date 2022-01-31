package ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentLikeBinding;

import java.util.ArrayList;

import adapter.AdapterLike;
import model.ModelLike;


public class LikeFragment extends Fragment {

    private FragmentLikeBinding binding;
    private AdapterLike AdapterLike;
    private ArrayList<ModelLike> like;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLikeBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        AdapterLike = new AdapterLike(like);
        binding.recyclerLike.setAdapter(AdapterLike);
    }

    private void loadData() {
        like = new ArrayList<>();
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
        like.add(new ModelLike(R.drawable.oval_1, R.drawable.rectangle1, "karennne liked your photo.", "1h"));
       }

    }
