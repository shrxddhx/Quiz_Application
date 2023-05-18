package com.example.quizapplicationp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.quizapplicationp2.QuestionsAnswers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button submitBtn;

    int score=0;
    int totalQuestion= QuestionsAnswers.question.length;
    int currentQuestionIndex=0;
    String selectedAnswer="";

    @Override
    public void onClick(View view){
        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestionsTextView=findViewById(R.id.total_question);
        questionTextView=findViewById(R.id.question);
        ansA=findViewById(R.id.ans_A);
        ansA=findViewById(R.id.ans_B);
        ansA=findViewById(R.id.ans_C);
        ansA=findViewById(R.id.ans_D);
        submitBtn=findViewById(R.id.submit_btn);


        totalQuestionsTextView.setText("Total questions: "+totalQuestion);

    }
}