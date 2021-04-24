package com.example.check_the_chicken;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public static int img1 = 0;
    int img2 = 0;
    int img3 = 0;
    int img4 = 0;
    int img5 = 0;
    int img6 = 0;
    int img7 = 0;
    int img8 = 0;
    int img9 = 0;
    int img10 = 0;
    int img11 = 0;
    int img12 = 0;
    int img13 = 0;
    int img14 = 0;
    int img15 = 0;
    int img16 = 0;
    int img17 = 0;
    int img18 = 0;
    int img19 = 0;
    int img20 = 0;
    int img21 = 0;
    int img22 = 0;
    int img23 = 0;
    int img24 = 0;
    int img25 = 0;
    int img26 = 0;
    int img27 = 0;
    int img28 = 0;
    int img29 = 0;
    int img30 = 0;
    int img31 = 0;






    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        String currentDay = currentDate.substring(0,2);
        String currentMonth = currentDate.substring(3,6);

        TextView dateText = findViewById(R.id.textDate);
        dateText.setText(currentDate);
        ImageView image31 = findViewById(R.id.imageView31);
        ImageView image30 = findViewById(R.id.imageView30);
        ImageView image29 = findViewById(R.id.imageView29);

        if (currentMonth.equals("Feb") || currentMonth.equals("Apr") || currentMonth.equals("Jun") || currentMonth.equals("Sep") || currentMonth.equals("Nov")){
            image31.setImageResource(R.drawable.x31);
        }
        if (currentMonth.equals("Feb")){
            image30.setImageResource(R.drawable.x30);
            image29.setImageResource(R.drawable.x29);
        }

        int check = 0;
        final int check1 = check;


        Button yes = (Button) findViewById(R.id.yesBtn);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkRed();
            }
        });
        Button no = (Button) findViewById(R.id.noBtn);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkGreen();
            }
        });





    }
    public void checkRed() {
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        String currentDay = currentDate.substring(0,2);
        if (currentDay.equals("01")){
            ImageView image = findViewById(R.id.imageView1);
            image.setImageResource(R.drawable.r1);
        }
        if (currentDay.equals("02")){
            ImageView image = findViewById(R.id.imageView2);
            image.setImageResource(R.drawable.r2);
        }
        if (currentDay.equals("03")){
            ImageView image = findViewById(R.id.imageView3);
            image.setImageResource(R.drawable.r3);
        }
        if (currentDay.equals("04")){
            ImageView image = findViewById(R.id.imageView4);
            image.setImageResource(R.drawable.r4);
        }
        if (currentDay.equals("05")){
            ImageView image = findViewById(R.id.imageView5);
            image.setImageResource(R.drawable.r5);
        }
        if (currentDay.equals("06")){
            ImageView image = findViewById(R.id.imageView6);
            image.setImageResource(R.drawable.r6);
        }
        if (currentDay.equals("07")){
            ImageView image = findViewById(R.id.imageView7);
            image.setImageResource(R.drawable.r7);
        }
        if (currentDay.equals("08")){
            ImageView image = findViewById(R.id.imageView8);
            image.setImageResource(R.drawable.r8);
        }
        if (currentDay.equals("09")){
            ImageView image = findViewById(R.id.imageView9);
            image.setImageResource(R.drawable.r9);
        }
        if (currentDay.equals("10")){
            ImageView image = findViewById(R.id.imageView10);
            image.setImageResource(R.drawable.r10);
        }
        if (currentDay.equals("11")){
            ImageView image = findViewById(R.id.imageView11);
            image.setImageResource(R.drawable.r11);
        }
        if (currentDay. equals("12")){
            ImageView image = findViewById(R.id.imageView12);
            image.setImageResource(R.drawable.r12);
        }
        if (currentDay.equals("13")){
            ImageView image = findViewById(R.id.imageView13);
            image.setImageResource(R.drawable.r13);
        }
        if (currentDay.equals("14")){
            ImageView image = findViewById(R.id.imageView14);
            image.setImageResource(R.drawable.r14);
        }
        if (currentDay.equals("15")){
            ImageView image = findViewById(R.id.imageView15);
            image.setImageResource(R.drawable.r15);
        }
        if (currentDay.equals("16")){
            ImageView image = findViewById(R.id.imageView16);
            image.setImageResource(R.drawable.r16);
        }
        if (currentDay.equals("17")){
            ImageView image = findViewById(R.id.imageView17);
            image.setImageResource(R.drawable.r17);
        }
        if (currentDay.equals("18")){
            ImageView image = findViewById(R.id.imageView18);
            image.setImageResource(R.drawable.r18);
        }
        if (currentDay.equals("19")){
            ImageView image = findViewById(R.id.imageView19);
            image.setImageResource(R.drawable.r19);
        }
        if (currentDay.equals("20")){
            ImageView image = findViewById(R.id.imageView20);
            image.setImageResource(R.drawable.r20);
        }
        if (currentDay.equals("21")){
            ImageView image = findViewById(R.id.imageView21);
            image.setImageResource(R.drawable.r21);
        }
        if (currentDay.equals("22")){
            ImageView image = findViewById(R.id.imageView22);
            image.setImageResource(R.drawable.r22);
        }
        if (currentDay.equals("23")){
            ImageView image = findViewById(R.id.imageView23);
            image.setImageResource(R.drawable.r23);
        }
        if (currentDay.equals("24")){
            ImageView image = findViewById(R.id.imageView24);
            image.setImageResource(R.drawable.r24);
        }
        if (currentDay.equals("25")){
            ImageView image = findViewById(R.id.imageView25);
            image.setImageResource(R.drawable.r25);
        }
        if (currentDay.equals("26")){
            ImageView image = findViewById(R.id.imageView26);
            image.setImageResource(R.drawable.r26);
        }
        if (currentDay.equals("27")){
            ImageView image = findViewById(R.id.imageView27);
            image.setImageResource(R.drawable.r27);
        }
        if (currentDay.equals("28")){
            ImageView image = findViewById(R.id.imageView28);
            image.setImageResource(R.drawable.r28);
        }
        if (currentDay.equals("29")){
            ImageView image = findViewById(R.id.imageView29);
            image.setImageResource(R.drawable.r29);
        }
        if (currentDay.equals("30")){
            ImageView image = findViewById(R.id.imageView30);
            image.setImageResource(R.drawable.r30);
        }
        if (currentDay.equals("31")){
            ImageView image = findViewById(R.id.imageView31);
            image.setImageResource(R.drawable.r31);
        }

    }
    public void checkGreen() {
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        String currentDay = currentDate.substring(0,2);
        if (currentDay.equals("01")){
            ImageView image = findViewById(R.id.imageView1);
            image.setImageResource(R.drawable.g1);
        }
        if (currentDay.equals("02")){
            ImageView image = findViewById(R.id.imageView2);
            image.setImageResource(R.drawable.g2);
        }
        if (currentDay.equals("03")){
            ImageView image = findViewById(R.id.imageView3);
            image.setImageResource(R.drawable.g3);
        }
        if (currentDay.equals("04")){
            ImageView image = findViewById(R.id.imageView4);
            image.setImageResource(R.drawable.g4);
        }
        if (currentDay.equals("05")){
            ImageView image = findViewById(R.id.imageView5);
            image.setImageResource(R.drawable.g5);
        }
        if (currentDay.equals("06")){
            ImageView image = findViewById(R.id.imageView6);
            image.setImageResource(R.drawable.g6);
        }
        if (currentDay.equals("07")){
            ImageView image = findViewById(R.id.imageView7);
            image.setImageResource(R.drawable.g7);
        }
        if (currentDay.equals("08")){
            ImageView image = findViewById(R.id.imageView8);
            image.setImageResource(R.drawable.g8);
        }
        if (currentDay.equals("09")){
            ImageView image = findViewById(R.id.imageView9);
            image.setImageResource(R.drawable.g9);
        }
        if (currentDay.equals("10")){
            ImageView image = findViewById(R.id.imageView10);
            image.setImageResource(R.drawable.g10);
        }
        if (currentDay.equals("11")){
            ImageView image = findViewById(R.id.imageView11);
            image.setImageResource(R.drawable.g11);
        }
        if (currentDay. equals("12")){
            ImageView image = findViewById(R.id.imageView12);
            image.setImageResource(R.drawable.g12);
        }
        if (currentDay.equals("13")){
            ImageView image = findViewById(R.id.imageView13);
            image.setImageResource(R.drawable.g13);
        }
        if (currentDay.equals("14")){
            ImageView image = findViewById(R.id.imageView14);
            image.setImageResource(R.drawable.g14);
        }
        if (currentDay.equals("15")){
            ImageView image = findViewById(R.id.imageView15);
            image.setImageResource(R.drawable.g15);
        }
        if (currentDay.equals("16")){
            ImageView image = findViewById(R.id.imageView16);
            image.setImageResource(R.drawable.g16);
        }
        if (currentDay.equals("17")){
            ImageView image = findViewById(R.id.imageView17);
            image.setImageResource(R.drawable.g17);
        }
        if (currentDay.equals("18")){
            ImageView image = findViewById(R.id.imageView18);
            image.setImageResource(R.drawable.g18);
        }
        if (currentDay.equals("19")){
            ImageView image = findViewById(R.id.imageView19);
            image.setImageResource(R.drawable.g19);
        }
        if (currentDay.equals("20")){
            ImageView image = findViewById(R.id.imageView20);
            image.setImageResource(R.drawable.g20);
        }
        if (currentDay.equals("21")){
            ImageView image = findViewById(R.id.imageView21);
            image.setImageResource(R.drawable.g21);
        }
        if (currentDay.equals("22")){
            ImageView image = findViewById(R.id.imageView22);
            image.setImageResource(R.drawable.g22);
        }
        if (currentDay.equals("23")){
            ImageView image = findViewById(R.id.imageView23);
            image.setImageResource(R.drawable.g23);
        }
        if (currentDay.equals("24")){
            ImageView image = findViewById(R.id.imageView24);
            image.setImageResource(R.drawable.g24);
        }
        if (currentDay.equals("25")){
            ImageView image = findViewById(R.id.imageView25);
            image.setImageResource(R.drawable.g25);
        }
        if (currentDay.equals("26")){
            ImageView image = findViewById(R.id.imageView26);
            image.setImageResource(R.drawable.g26);
        }
        if (currentDay.equals("27")){
            ImageView image = findViewById(R.id.imageView27);
            image.setImageResource(R.drawable.g27);
        }
        if (currentDay.equals("28")){
            ImageView image = findViewById(R.id.imageView28);
            image.setImageResource(R.drawable.g28);
        }
        if (currentDay.equals("29")){
            ImageView image = findViewById(R.id.imageView29);
            image.setImageResource(R.drawable.g29);
        }
        if (currentDay.equals("30")){
            ImageView image = findViewById(R.id.imageView30);
            image.setImageResource(R.drawable.g30);
        }
        if (currentDay.equals("31")){
            ImageView image = findViewById(R.id.imageView31);
            image.setImageResource(R.drawable.g31);
        }

    }


}