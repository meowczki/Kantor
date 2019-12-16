package ib.edu.kantor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
   // private BeerAdvisor beerAdvisor= new BeerAdvisor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void obliczOnClick(View view) {

        Spinner waluta = (Spinner) findViewById(R.id.waluta);
        int indexOfWaluta=waluta.getSelectedItemPosition();
            String walutaString=String.valueOf(waluta.getSelectedItem());
// TextView brands=(TextView)findViewById(R.id.brands);
 //List<String> brandList= beerAdvisor.getBrands(indexOfWaluta);
//
//        StringBuilder brandsFormatted= new StringBuilder(beerType + ":" + '\n');
//        for(String brand : brandList) brandsFormatted.append(brand).append('\n');
//        brands.setText(brandsFormatted);

    }
}
