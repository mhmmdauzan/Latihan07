package id.ac.poliban.mi.auzan.latihan07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //membuat object inflater
        MenuInflater inflater = getMenuInflater();
        //menempelkan menu ke object inflater
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.miMelee){
            View view = this.getWindow().getDecorView();
            //terlihat file gambar cherry_barb sebagai
            //hasil import android drawable importer
            //dikenali dalam source code kita
            view.setBackgroundResource(R.drawable.melee);
        }
        if(item.getItemId()==R.id.miHandgun){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.pistol);
        }
        if(item.getItemId()==R.id.miAssaultRifle){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.assault_rifle);
        }
        if(item.getItemId()==R.id.miSemiMachineGun){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.semi_machine_gun);
        }
        if(item.getItemId()==R.id.miMachineGun){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.machine_gun);
        }
        if(item.getItemId()==R.id.miSniperRifle){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.sniper_rifle);
        }
        return true;
    }
}
