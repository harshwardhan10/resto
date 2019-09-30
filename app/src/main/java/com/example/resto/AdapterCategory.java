package com.example.resto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterCategory extends RecyclerView.Adapter<AdapterCategory.MyViewHolder> {

    Context context;
    ArrayList<CategoryView>categoryViews;

    public AdapterCategory(Context c, ArrayList<CategoryView> p)
    {
        context = c;
        categoryViews = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.categoriesText.setText(categoryViews.get(position).getCategoryText());
        Picasso.get().load(categoryViews.get(position).getImageUrl()).into(holder.categoriesImage);
    }

    @Override
    public int getItemCount() {
        return categoryViews.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView categoriesText;
        ImageView categoriesImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            categoriesText = itemView.findViewById(R.id.textViewCategoryName);
            categoriesImage = itemView.findViewById(R.id.imageViewCategory);
        }
    }
}
