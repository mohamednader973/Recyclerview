package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonRvAdapter extends RecyclerView.Adapter<PersonRvAdapter.PersonViewHolder> {
    private List<PersonModel> personList;

    public PersonRvAdapter(List<PersonModel> personList) {
        this.personList=personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.person_rv_item,parent,false);
        PersonViewHolder personViewHolder=new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        PersonModel personModel=personList.get(position);
        holder.nameTv.setText(personModel.getName());
        holder.ageTv.setText(personModel.getAge());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
    class PersonViewHolder extends RecyclerView.ViewHolder{
        TextView nameTv;
        TextView ageTv;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv=itemView.findViewById(R.id.name_tv);
            ageTv=itemView.findViewById(R.id.age_tv);
        }
    }
}
