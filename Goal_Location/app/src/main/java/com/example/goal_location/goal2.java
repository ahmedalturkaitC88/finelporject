package com.example.goal_location;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

import java.util.ArrayList;

public class goal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        ArrayList<Goal> Go = new ArrayList<>();

        Goal g1 = new Goal("ملعب الجابريه","الجابره",20,R.drawable.i1,99455735);
        Goal g2 = new Goal("ملعب اليرموك","اليرموك",10,R.drawable.i2,00000000);
        Goal g3 = new Goal("ملعب spower","الخالديه",15,R.drawable.i3,97570004);
        Goal g4 = new Goal("ملعب High School Stadium Sabah Al-Nasser","الجهراء",10,R.drawable.i4,00000000);
        Goal g5 = new Goal("ملعب صباح السالم","صباح السالم",15,R.drawable.i5,99977355);
        Goal g6 = new Goal("ملعب السالميه","السالميه",35,R.drawable.i5,50627676 );


        Go.add(g1);
        Go.add(g2);
        Go.add(g3);
        Go.add(g4);
        Go.add(g5);
        Go.add(g6);


        RecyclerView rv = findViewById(R.id.res);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        goalAdapter ga = new goalAdapter(Go,this);
        rv.setAdapter(ga);


    }
}