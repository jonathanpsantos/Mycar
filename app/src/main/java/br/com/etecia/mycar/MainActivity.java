package br.com.etecia.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Apresentando o xml ao Java
    ListView idlistValores;


   // ImageView imgMgcar;
   // TextView idmTextModelocar, idmTextFabricacaocar, idmTextDescricaocar, idmValorcar, idmRatingvalor;

    String modeloCar []= {"Onix"};
    String fabricanteCar []= {"Chevrolet"};
    String descricaoCar[] = {"Onix preto "};
    String valorCar [] = {"R$ 99.990.00"};
    String ratingValor [] = {"5.0"};

    int imageCarro [] = {R.drawable.onix_car};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idlistValores = findViewById(R.id.idlistValores);

        MyAdapter adapter = new MyAdapter();
        idlistValores.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {


            return imageCarro.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imgMgcar;
            TextView idmTextModelocar, idmTextFabricacaocar, idmTextDescricaocar, idmValorcar, idmRatingvalor;

            // Adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_carro, null );

            // Apresentando as variaveis do jhava para o modelo xml

            imgMgcar = v.findViewById(R.id.imgMgcar);
            idmTextModelocar = v.findViewById(R.id.idmTextModelocar);
            idmTextFabricacaocar = v.findViewById(R.id.idmTextFabricacaocar);
            idmTextDescricaocar = v.findViewById(R.id.idmTextDescricaocar);
            idmValorcar = v.findViewById(R.id.idmValorcar);
            idmRatingvalor = v.findViewById(R.id.idmRatingvalor);

            //Inserindo os valores nas variaveis do java

            idmTextModelocar.setText(modeloCar[i]);
            idmTextFabricacaocar.setText(fabricanteCar[i]);
            idmTextDescricaocar.setText(descricaoCar[i]);
            idmValorcar.setText(valorCar[i]);
            idmRatingvalor.setText(ratingValor[i]);

            imgMgcar.setImageResource(imageCarro[i]);

            return v;
        }
    }

}