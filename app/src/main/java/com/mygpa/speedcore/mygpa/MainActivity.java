package com.mygpa.speedcore.mygpa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Ini ceritanya data yang bakalan kita pake nanti
        String infoUserJSON = "{\"photo\": \"res/Image1.jpg\",\"name\": \"Firmansyah Yanuar\",\"prodi\": \"Teknik Informatika\"}";
        String dataMatkulJSON = "[{\"nama_matkul\": \"Struktur Data\",\"sks\": 3,\"nilai\": {\"tugas\": 100,\"kuis\": 85,\"uts\": 90,\"uas\": 60,\"prak\": 0,\"persen_tugas\": 10,\"persen_kuis\": 20,\"persen_uts\": 30,\"persen_uas\": 40,\"persen_prak\": 0}},{\"nama_matkul\": \"Algoritma dan Pemrograman\",\"sks\": 3,\"nilai\": {\"tugas\": 90,\"kuis\": 75,\"uts\": 80,\"uas\": 70,\"prak\": 80,\"persen_tugas\": 10,\"persen_kuis\": 10,\"persen_uts\": 30,\"persen_uas\": 40,\"persen_prak\": 10}},{\"nama_matkul\": \"Logika Informatika\",\"sks\": 3,\"nilai\": {\"tugas\": 80,\"kuis\": 60,\"uts\": 70,\"uas\": 50,\"prak\": 90,\"persen_tugas\": 10,\"persen_kuis\": 10,\"persen_uts\": 30,\"persen_uas\": 40,\"persen_prak\": 10}}]";

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
