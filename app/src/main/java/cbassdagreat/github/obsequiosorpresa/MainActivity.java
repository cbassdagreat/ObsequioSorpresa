package cbassdagreat.github.obsequiosorpresa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cbassdagreat.github.obsequiosorpresa.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        llenarObs();
        muestraObs(Collections.singletonList(list.get(0)));


        binding.ivRight.setOnClickListener(v->{

            //muestraObs();
            binding.ivObs.setVisibility(View.VISIBLE);

        });

        binding.ivCenter.setOnClickListener(v->{
            //muestraObs();
            binding.ivObs.setVisibility(View.VISIBLE);

        });

        binding.ivLeft.setOnClickListener(v->{
            //muestraObs();
            binding.ivObs.setVisibility(View.VISIBLE);


        });

    }

    private List<Obsequio> list;
    private void llenarObs(){

        list = new ArrayList<>();

        list.add(new Obsequio(R.drawable.ic_gift_beach));
        list.add(new Obsequio(R.drawable.ic_gift_music));
        list.add(new Obsequio(R.drawable.ic_gift_pizza));
        list.add(new Obsequio(R.drawable.ic_baseline_airplane_ticket_24));
        list.add(new Obsequio(R.drawable.ic_baseline_blender_24));
        list.add(new Obsequio(R.drawable.ic_baseline_moped_24));
    }

    public void muestraObs(List posicion){
        binding.ivObs.setImageResource(R.drawable.ic_baseline_blender_24);

    }

}