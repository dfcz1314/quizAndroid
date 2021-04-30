package com.codesample.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codesample.quiz.databinding.ActivityMainBinding;
import com.codesample.quiz.databinding.ActivityQuestionListBinding;

public class QuestionListActivity extends AppCompatActivity {

    private ActivityQuestionListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionListActivity.this, SettingActivity.class);
                startActivity(intent); //액티비티 이동
            }

        });



    }
}
