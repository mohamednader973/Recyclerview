package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView personRv;
    private PersonRvAdapter adapter;
    private List<PersonModel> personModelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personRv=findViewById(R.id.person_rv);
        adapter=new PersonRvAdapter(personModelList);
        PersonModel personModel=new PersonModel("mohamed","22");
        PersonModel personModel2=new PersonModel("karim","20");
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        personModelList.add(personModel);
        personModelList.add(personModel2);
        LinearLayoutManager layoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        personRv.setLayoutManager(layoutManager);
        personRv.addItemDecoration(new DividerItemDecoration(MainActivity.this,layoutManager.getOrientation()));
        personRv.setAdapter(adapter);
    }
}