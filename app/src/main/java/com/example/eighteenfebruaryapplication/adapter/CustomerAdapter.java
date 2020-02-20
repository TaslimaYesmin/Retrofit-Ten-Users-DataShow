package com.example.eighteenfebruaryapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eighteenfebruaryapplication.R;
import com.example.eighteenfebruaryapplication.model.Post;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {
    private List<Post> postList;
    private Context context;

    public CustomerAdapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAdapter.ViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.idTv.setText(post.getId());
        holder.nameTv.setText(post.getName());
        holder.userNameTv.setText(post.getUsername());
        holder.emailTv.setText(post.getEmail());
        holder.streetTv.setText(post.getAddress().getStreet());
        holder.suiteTv.setText(post.getAddress().getSuite());
        holder.cityTv.setText(post.getAddress().getCity());
        holder.zipCodeTv.setText(post.getAddress().getZipcode());
        holder.phoneTv.setText(post.getPhone());
        holder.websiteTv.setText(post.getWebsite());
        holder.companyNameTv.setText(post.getCompany().getName());
        holder.companyCatchPhrase.setText(post.getCompany().getCatchPhrase());
        holder.companyBs.setText(post.getCompany().getBs());
        //holder.latTv.setText(post.getGeo().getLat());
       // holder.lngTv.setText(post.getGeo().getLng());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv, idTv, userNameTv, emailTv, streetTv, suiteTv, cityTv, zipCodeTv, latTv, lngTv, companyNameTv, companyCatchPhrase, companyBs, phoneTv, websiteTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTv = itemView.findViewById(R.id.id);
            nameTv = itemView.findViewById(R.id.name);
            userNameTv = itemView.findViewById(R.id.userName);
            emailTv = itemView.findViewById(R.id.email);
            streetTv = itemView.findViewById(R.id.street);
            suiteTv = itemView.findViewById(R.id.suite);
            cityTv = itemView.findViewById(R.id.city);
            zipCodeTv = itemView.findViewById(R.id.zipCode);
            latTv = itemView.findViewById(R.id.lat);
            lngTv = itemView.findViewById(R.id.lng);
            companyNameTv = itemView.findViewById(R.id.companyName);
            companyCatchPhrase = itemView.findViewById(R.id.companyCatchPhrase);
            companyBs = itemView.findViewById(R.id.companyBs);
            phoneTv = itemView.findViewById(R.id.phone);
            websiteTv = itemView.findViewById(R.id.webSite);
        }
    }
}
