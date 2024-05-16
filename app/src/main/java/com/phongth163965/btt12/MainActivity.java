package com.phongth163965.btt12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    private StudentBaseAdapter adapter;

    private List<Student> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.student_listview);
        list.add(new Student("Trinh Hong Phong", "18", R.drawable.android ));
        list.add(new Student("Trinh Hong A", "18", R.drawable.chrome ));
        list.add(new Student("Trinh Hong B", "18", R.drawable.apple ));
        list.add(new Student("Trinh Hong C", "18", R.drawable.blogger ));
        list.add(new Student("Trinh Hong D", "18", R.drawable.border ));
        list.add(new Student("Trinh Hong E", "18", R.drawable.dell ));
        list.add(new Student("Trinh Hong F", "18", R.drawable.facebook ));
        list.add(new Student("Trinh Hong G", "18", R.drawable.firefox ));
        list.add(new Student("Trinh Hong H", "18", R.drawable.hancock ));
        list.add(new Student("Trinh Hong I", "18", R.drawable.hp ));

        adapter = new StudentBaseAdapter(this, list);
        listView.setAdapter(adapter);
    }
}