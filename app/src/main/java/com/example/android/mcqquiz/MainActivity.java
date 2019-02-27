package com.example.android.mcqquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the radio buttons are clicked.
     */
    public void checkanswer(View view) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String Idcorrectans = view.getResources().getResourceName(view.getId());

        if (Idcorrectans.contains("correct")) {
            CharSequence text = "Good job! This answer is correct";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            CharSequence text = "Sorry! This answer is incorrect";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    /**
     * This method is called when the Submit button is clicked.
     */
    public void SubmitTest(View view) {
        int score = 0;
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        int Idcorrectans = view.getResources().getIdentifier("lichens_correct", "id", getPackageName());
        RadioButton user_ans = (RadioButton) findViewById(Idcorrectans);

        if (user_ans.isChecked()) {
            score += 1;
        }
        Idcorrectans = view.getResources().getIdentifier("anb_correct", "id", getPackageName());
        user_ans = (RadioButton) findViewById(Idcorrectans);

        if (user_ans.isChecked()) {
            score += 1;
        }
        Idcorrectans = view.getResources().getIdentifier("biobricks_correct", "id", getPackageName());
        user_ans = (RadioButton) findViewById(Idcorrectans);

        if (user_ans.isChecked()) {
            score += 1;
        }
        Idcorrectans = view.getResources().getIdentifier("recycling_correct", "id", getPackageName());
        user_ans = (RadioButton) findViewById(Idcorrectans);

        if (user_ans.isChecked()) {
            score += 1;
        }
        Idcorrectans = view.getResources().getIdentifier("abnbio_correct", "id", getPackageName());
        user_ans = (RadioButton) findViewById(Idcorrectans);

        if (user_ans.isChecked()) {
            score += 1;
        }
        Idcorrectans = view.getResources().getIdentifier("fermen_correct", "id", getPackageName());
        user_ans = (RadioButton) findViewById(Idcorrectans);

        if (user_ans.isChecked()) {
            score += 1;
        }
        Idcorrectans = view.getResources().getIdentifier("cb_primord_correct", "id", getPackageName());
        CheckBox user_ans_cb = (CheckBox) findViewById(Idcorrectans);
        boolean correct1 = user_ans_cb.isChecked();
        Idcorrectans = view.getResources().getIdentifier("cb_hold_correct", "id", getPackageName());
        user_ans_cb = (CheckBox) findViewById(Idcorrectans);
        boolean correct2 = user_ans_cb.isChecked();
        Idcorrectans = view.getResources().getIdentifier("cb_germ", "id", getPackageName());
        user_ans_cb = (CheckBox) findViewById(Idcorrectans);
        boolean correct3 = user_ans_cb.isChecked();
        Idcorrectans = view.getResources().getIdentifier("cb_tissue", "id", getPackageName());
        user_ans_cb = (CheckBox) findViewById(Idcorrectans);
        boolean correct4 = user_ans_cb.isChecked();

        if (correct1 && correct2 && !correct3 && !correct4) {
            score += 1;
        }
        EditText ed = (EditText) findViewById(R.id.et_rating);
        String rating = ed.getText().toString();

        if (rating.equalsIgnoreCase("lichens")) {
            score += 1;
        }
        CharSequence text = "Your score is " + score + "/8.";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the Checkbox are clicked.
     */
    public void checkoption(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CheckBox cb = (CheckBox) findViewById(view.getId());
        boolean is_checked = cb.isChecked();
        String Idcorrectans = view.getResources().getResourceName(view.getId());

        if (Idcorrectans.contains("correct") && is_checked) {
            CharSequence text = "Correct answer selected. There can be more than one correct answers";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            if (is_checked) {
                CharSequence text = "Incorrect answer selected";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }
    }

    /**
     * This method is called when the rating is given in the EditText.
     */
    public void RatingMethod(View view) {

        EditText ed = (EditText) findViewById(R.id.et_rating);
        String rating = ed.getText().toString();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        if (rating.equalsIgnoreCase("lichens")) {
            CharSequence text = "Right Answer";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            CharSequence text = "Well! lichens is a good example";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
