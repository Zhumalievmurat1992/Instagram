package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.databinding.ItemLikeBinding;

import java.util.ArrayList;

import model.ModelLike;

public class AdapterLike extends RecyclerView.Adapter<AdapterLike.CountViewHolder> {
    ArrayList<ModelLike> like;
    private ItemLikeBinding binding;

    public AdapterLike(ArrayList<ModelLike> like) {
        this.like = like;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemLikeBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(like.get(position));
    }

    @Override
    public int getItemCount() {
        return like.size();
    }


    static class CountViewHolder extends RecyclerView.ViewHolder {
        ItemLikeBinding binding;

        public CountViewHolder(@NonNull ItemLikeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(ModelLike like) {
            binding.imagePerson.setImageResource(like.getImagePerson());
            binding.imagePhoto.setImageResource(like.getImagePhoto());
            binding.tvNamePerson.setText(like.getText());
            binding.tvHour.setText(like.getTextHour());
        }
    }

}

