package th.ac.su.ict.amornchanok.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  Button btnOne;
    private  Button btnTwo;
    private  Button btnThree;
    private  Button btnFour;
    private  Button btnFive;
    private  Button btnSix;
    private  TextView boxColor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxColor = (TextView) findViewById(R.id.boxColor);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                boxColor.setBackgroundColor(0xFFEDE1DC);
                boxColor.setText("235-255-211");
                break;
            case R.id.btnTwo:
                boxColor.setBackgroundColor(0xFFECCBCA);
                boxColor.setText("233-203-202");
                break;
            case R.id.btnThree:
                boxColor.setBackgroundColor(0xFF75839C);
                boxColor.setText("171-131-156");
                break;
            case R.id.btnFour:
                boxColor.setBackgroundColor(0xFF99A9BF);
                boxColor.setText("153-169-191");
                break;
            case R.id.btnFive:
                boxColor.setBackgroundColor(0xFFC2CCD5);
                boxColor.setText("194-204-213");
                break;
            case R.id.btnSix:
                boxColor.setBackgroundColor(0xFFDDE2E5);
                boxColor.setText("221-226-229");
                break;

        }
    }
}
