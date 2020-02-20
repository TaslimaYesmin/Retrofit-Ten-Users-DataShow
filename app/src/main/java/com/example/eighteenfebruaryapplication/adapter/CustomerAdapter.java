package com.example.eighteenfebruaryapplication.adapter;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eighteenfebruaryapplication.R;
import com.example.eighteenfebruaryapplication.model.User;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {
    private List<User> userList;
    private Context context;

    public CustomerAdapter(List<User> userList, Context context) {
        this.userList = userList;
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
        User user = userList.get(position);
        holder.idTv.setText(user.getId());
        holder.nameTv.setText(user.getName());
        holder.userNameTv.setText(user.getUsername());
        holder.emailTv.setText(user.getEmail());
        holder.streetTv.setText(user.getAddress().getStreet());
        holder.suiteTv.setText(user.getAddress().getSuite());
        holder.cityTv.setText(user.getAddress().getCity());
        holder.zipCodeTv.setText(user.getAddress().getZipcode());
        holder.phoneTv.setText(user.getPhone());
        holder.websiteTv.setText(user.getWebsite());
        holder.companyNameTv.setText(user.getCompany().getName());
        holder.companyCatchPhrase.setText(user.getCompany().getCatchPhrase());
        holder.companyBs.setText(user.getCompany().getBs());

        double lat = Double.valueOf(userList.get(position).getAddress().getGeo().getLat());
        double lng = Double.valueOf(userList.get(position).getAddress().getGeo().getLng());
        Geocoder geocoder= new Geocoder(context, Locale.getDefault());
        List<Address>addresses;
        try {
            addresses = geocoder.getFromLocation(lat,lng,1);
            holder.locationTv.setText(addresses.get(0).getFeatureName());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv, idTv, userNameTv, emailTv, streetTv, suiteTv, cityTv, zipCodeTv, locationTv, companyNameTv, companyCatchPhrase, companyBs, phoneTv, websiteTv;

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
            locationTv=itemView.findViewById(R.id.locationId);
            companyNameTv = itemView.findViewById(R.id.companyName);
            companyCatchPhrase = itemView.findViewById(R.id.companyCatchPhrase);
            companyBs = itemView.findViewById(R.id.companyBs);
            phoneTv = itemView.findViewById(R.id.phone);
            websiteTv = itemView.findViewById(R.id.webSite);
        }
    }
}
