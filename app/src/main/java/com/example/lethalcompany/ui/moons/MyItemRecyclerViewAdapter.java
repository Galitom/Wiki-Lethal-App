package com.example.lethalcompany.ui.moons;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lethalcompany.MainActivity;
import com.example.lethalcompany.ui.moons.placeholder.Moon;
import com.example.lethalcompany.ui.moons.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.lethalcompany.databinding.FragmentMoons2Binding;

import java.util.List;

/**

 {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Moon> mValues;

    public MyItemRecyclerViewAdapter(List<Moon> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentMoons2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).getName().toString());
        holder.mIdView.setOnClickListener(v -> {
            Moon moon = mValues.get(position);
            Intent intent = new Intent(holder.mIdView.getContext(),MoonDettaglio.class );
            intent.putExtra("moon",moon);

            holder.mIdView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;

        public Moon mItem;

        public ViewHolder(FragmentMoons2Binding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;

        }

    }
}
