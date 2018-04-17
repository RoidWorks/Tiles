package pl.pisze_czytam.tiles;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pl.pisze_czytam.tiles.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        bind.tile1a.setOnClickListener(this);
        bind.tile1b.setOnClickListener(this);
        bind.tile1c.setOnClickListener(this);
        bind.tile1d.setOnClickListener(this);
        bind.tile2a.setOnClickListener(this);
        bind.tile2b.setOnClickListener(this);
        bind.tile2c.setOnClickListener(this);
        bind.tile2d.setOnClickListener(this);
        bind.tile3a.setOnClickListener(this);
        bind.tile3b.setOnClickListener(this);
        bind.tile3c.setOnClickListener(this);
        bind.tile3d.setOnClickListener(this);
        bind.tile4a.setOnClickListener(this);
        bind.tile4b.setOnClickListener(this);
        bind.tile4c.setOnClickListener(this);
        bind.tile4d.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        v.setBackgroundColor(getResources().getColor(R.color.clickedItem));
    }
}
