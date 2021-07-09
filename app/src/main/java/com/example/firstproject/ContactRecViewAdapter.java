package com.example.firstproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class ContactRecViewAdapter extends RecyclerView.Adapter<ContactRecViewAdapter.ViewHolder>{

    private ArrayList<Contact> contacts = new ArrayList<>();

    public Context context;

    public ContactRecViewAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactRecViewAdapter.ViewHolder holder, int position) {
        // set values from array
        holder.contactName.setText(contacts.get(position).getName());
        holder.contactEmail.setText(contacts.get(position).getEmail());

        // set image
        Glide.with(context).asBitmap().load(contacts.get(position).getImageUrl()).into(holder.imageView);

        holder.parent.setOnClickListener(v -> Snackbar.make(context, v, contacts.get(position).getName() + " Selected", Snackbar.LENGTH_LONG).show());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContact(ArrayList<Contact> contacts ) {
        this.contacts = contacts;
        notifyDataSetChanged();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView contactName, contactEmail;
        private CardView parent;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.contactName);
            contactEmail = itemView.findViewById(R.id.contactEmail);
            parent = itemView.findViewById(R.id.contactListParent);
            imageView = itemView.findViewById(R.id.recyclerViewImage);
        }
    }
}
