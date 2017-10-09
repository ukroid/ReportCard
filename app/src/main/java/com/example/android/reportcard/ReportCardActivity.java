package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class ReportCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card);

        ReportCard[] rcArray = {(new ReportCard("Sushiko", 6, 10)),
                (new ReportCard("Robin", 8, 3)),
                (new ReportCard("Obee", 12, 10)),
                (new ReportCard("Gan", 11, 6)),
                (new ReportCard("Raral", 8, 3))
        };

        TextView textList =(TextView)findViewById(R.id.grade_list);

        for (int i = 0; i < rcArray.length; i++) {
            String previous = textList.getText().toString();
            String next = rcArray[i].toString();
            String overall = previous + next;
            textList.setText(overall);
        }

    }

}

