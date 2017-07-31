package com.example.pd_liu.picker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class PickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
    }

    public void datePicker(View view) {
        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(PickerActivity.this, "i == " + i + ",,i1 == " + i1 + ",,i2== " + i2, Toast.LENGTH_SHORT).show();
            }
        }, 2017, 7, 3);
        dialog.show();
    }

    public void timePicker(View view) {
        TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                Toast.makeText(PickerActivity.this, "i == " + i + ",,i1 == " + i1, Toast.LENGTH_SHORT).show();
            }
        }, 1, 5, false);
        dialog.show();
    }

    public void elseInform(View view) {
        startActivity(new Intent(this, FullscreenActivity.class));
    }
}
