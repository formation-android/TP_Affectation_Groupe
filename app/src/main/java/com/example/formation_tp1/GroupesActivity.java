package com.example.formation_tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GroupesActivity extends AppCompatActivity {

    // Array of strings...
    ListView simpleList;
   // String groupe_listes[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
            "Yann", "Zoé"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groupes);

       // simpleList = (ListView) findViewById(R.id.simpleListView);
       // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_groupes, R.id.textView, groupe_listes);

        simpleList = (ListView) findViewById(R.id.list_view_groupes);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(GroupesActivity.this,
                R.layout.activity_groupes, prenoms);

        simpleList.setAdapter(adapter);



    }
}
