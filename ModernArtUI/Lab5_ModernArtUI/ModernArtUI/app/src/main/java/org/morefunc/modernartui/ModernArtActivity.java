package org.morefunc.modernartui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

public class ModernArtActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, DialogInterface.OnClickListener {

    private static int view1startColor = Color.argb(0xFF, 0xFF, 0xFF, 0x90);
    private static int view1endColor = Color.argb(0xFF, 0xFF, 0x0C, 0x90);
    private static int view2startColor = Color.argb(0xFF, 0xFF, 0xCC, 0x90);
    private static int view2endColor = Color.argb(0xFF, 0x00, 0xFF, 0x00);
    private static int view3startColor = Color.argb(0xFF, 0xFF, 0x90, 0x00);
    private static int view3endColor = Color.argb(0xFF, 0xFF, 0xFF, 0x90);
    private static int view4startColor = Color.argb(0xFF, 0xBB, 0xBB, 0x00);
    private static int view4endColor = Color.argb(0xFF, 0xFF, 0x00, 0x10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern_art);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_modern_art, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_moreinformation) {
            new AlertDialog.Builder(this)
                    .setMessage("Inspired by the work of artists such as Some Guy and Some A. Guy")
                    .setPositiveButton("Visit MOMA", this)
                    .setNegativeButton("Not now", this)
                    .create().show();
        }

        return super.onOptionsItemSelected(item);
    }

    private int colorShift(int c1, int c2, double shift) {
        int red1 = Color.red(c1);
        int green1 = Color.green(c1);
        int blue1 = Color.blue(c1);
        int red2 = Color.red(c2);
        int green2 = Color.green(c2);
        int blue2 = Color.blue(c2);

        int red = (int)(red1 + shift*(red2-red1));
        int green = (int)(green1 + shift*(green2-green1));
        int blue = (int)(blue1 + shift*(blue2-blue1));

        return Color.argb(0xFF, red, green, blue);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        System.out.println("progress: " + progress);
        View view1 = findViewById(R.id.view1);
        View view2 = findViewById(R.id.view2);
        View view3 = findViewById(R.id.view3);
        View view4 = findViewById(R.id.view4);
        view1.setBackgroundColor(colorShift(view1startColor, view1endColor, 0.01*progress));
        view2.setBackgroundColor(colorShift(view2startColor, view2endColor, 0.01*progress));
        view3.setBackgroundColor(colorShift(view3startColor, view3endColor, 0.01*progress));
        view4.setBackgroundColor(colorShift(view4startColor, view4endColor, 0.01*progress));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case Dialog.BUTTON_POSITIVE:
                Intent viewWebPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.moma.org"));
                startActivity(viewWebPageIntent);
                break;
            case Dialog.BUTTON_NEGATIVE:
                dialog.cancel();
        }
    }
}
