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
   // TextView idmTextModelocar, idmTextFabricacaocar, idmTextDescricaocar, idmValorcar, idmRatingvalor ,;

    String modeloCar []= {"Onix","Argo","Spin","Creta","Kwid"};
    String fabricanteCar []= {"Chevrolet","Fiat","Chevrolet","Hyunda","Renault"};
    String fabricacaoCar [] = {"2022/2023","2022/2023", "2022","2022","2022"};
    String descricaoCar[] = {"NOVO ONIX 1.0 LT TURBO (Conf. 5B48HP), pacote R6S ano/modelo 2022/2023  pintura na cor PRETO OURO NEGRO ","1.0 Firefly Drive Manual com 11.578 Km rodados ","1.8 Lt 8v Automático com 53.517 Km rodados","1.6 16v Action Automático com 22.438 Km rodados","1.0 12v Sce Zen Manual com 6.453 Km rodados "};
    String valorCar [] = {"R$ 99.900,00","R$ 72.870","R$ 75.870","R$ 100.470","R$ 56.970"};
    String ratingValor [] = {"4.5","4.0","4.2","4.8","4.6"};

    int imageCarro [] = {R.drawable.onix_car,R.drawable.fiatargo,R.drawable.spin,R.drawable.creta};


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
            TextView idmTextModelocar, idmTextFabricante, idmTextDescricaocar, idmValorcar, idmRatingvalor, idmTextFabricacaocar;

            // Adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_carro, null );

            // Apresentando as variaveis do jhava para o modelo xml

            imgMgcar = v.findViewById(R.id.imgMgcar);
            idmTextModelocar = v.findViewById(R.id.idmTextModelocar);
            idmTextFabricante = v.findViewById(R.id.idmTextFabricacaocar);
            idmTextDescricaocar = v.findViewById(R.id.idmTextDescricaocar);
            idmValorcar = v.findViewById(R.id.idmValorcar);
            idmRatingvalor = v.findViewById(R.id.idmRatingvalor);
            idmTextFabricacaocar = v.findViewById(R.id.idmTextFabricacaocar);
            //Inserindo os valores nas variaveis do java

            idmTextModelocar.setText(modeloCar[i]);
            idmTextFabricacaocar.setText(fabricacaoCar[i]);
            idmTextFabricante.setText(fabricanteCar[i]);
            idmTextDescricaocar.setText(descricaoCar[i]);
            idmValorcar.setText(valorCar[i]);
            idmRatingvalor.setText(ratingValor[i]);

            imgMgcar.setImageResource(imageCarro[i]);

            return v;
        }
    }

}