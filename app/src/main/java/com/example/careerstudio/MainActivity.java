package com.CareerStudio.careerstudio;

import static com.CareerStudio.careerstudio.R.id.b11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
    }

    public void buluck(View v){
        Intent intent = new Intent(this, webPageTample.class);
        if (v.getId()==b1.getId()){
            intent.putExtra("url","https://www.mastersportal.com/articles/422/top-7-reasons-to-study-a-medicine-degree-in-2023.html");
        } else if (v.getId()==b2.getId()) {
            intent.putExtra("url","https://www.indeed.com/career-advice/interviewing/why-do-you-want-to-be-a-software-developer");
        } else if (v.getId()==b3.getId()) {
            intent.putExtra("url","https://youngarchitect.com/10-reasons-why-you-should-study-architecture/");
        } else if (v.getId()==b4.getId()) {
            intent.putExtra("url","https://www.indeed.com/career-advice/finding-a-job/why-be-civil-engineer");
        }else if (v.getId()==b5.getId()) {
            intent.putExtra("url","https://engineering-jobs.theiet.org/article/why-choose-a-career-in-computer-engineering-");
        }
        else if (v.getId()==b6.getId()) {
            intent.putExtra("url","https://www.indeed.com/career-advice/career-development/reasons-to-study-mechanical-engineering");
        }
        else if (v.getId()==b7.getId()) {
            intent.putExtra("url","https://www.vismayamvfx.com/top-7-reasons-choose-interior-designing-course/");
        }

        else if (v.getId()==b8.getId()) {
            intent.putExtra("url","https://www.bachelorsportal.com/articles/1791/should-i-study-electrical-engineering-in-the-us-studies-and-careers-in-2023.html");
        }
        else if (v.getId()==b9.getId()) {
            intent.putExtra("url","https://www.thecompleteuniversityguide.co.uk/student-advice/what-to-study/six-reasons-to-study-business-and-management-studies");
        }
        else if (v.getId()==b10.getId()) {
            intent.putExtra("url","https://www.studysehir.com/en/post/10-reasons-to-study-law-in-turkey");
        }

        else {
            v.getId();
            b11.getId();
            intent.putExtra("url","https://www.thecompleteuniversityguide.co.uk/student-advice/what-to-study/five-reasons-to-study-dentistry");

        }
        {

        startActivity(intent);
        }
    }
}
