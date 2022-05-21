package trinhmanhdiv.LV_Advanced.listviewadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView             lv_main;
    ArrayList<Fruit>     arrList;
    ListViewFruitAdapter fruitAdapter;

    public void mapping(){
        lv_main = (ListView) findViewById(R.id.lv_main);
        arrList = new ArrayList<>();
        arrList.add(new Fruit("Dâu tây",
                "Quả này hơi chua cơ mà nó cũng ngon. Chấm điểm 7/10",
                R.drawable.img_stra ));
        arrList.add(new Fruit("Táo",
                "Quả này hơi ngọt, nhiều tinh bột, cắn một miếng là thành logo của apple"
                        + ". Chấm điểm 8/10",
                R.drawable.img_apple_cartoon ));
        arrList.add(new Fruit("Chuối",
                "Quả này ngọt lắm, ngonnnn. Chấm điểm 9/10",
                R.drawable.img_banana_cartoon ));
        arrList.add(new Fruit("cam",
                "Quả này hơi chua, mà nó cũng có lúc ngọt cơ mà nó cũng ngon. Chấm điểm 7/10",
                R.drawable.img_orange_cartoon ));
        arrList.add(new Fruit("Dưa hấu",
                "Quả này tuyệt vời. Chấm điểm 10/10",
                R.drawable.img_watermelon_cartoon ));
        arrList.add(new Fruit("Dâu tây",
                "Quả này hơi chua cơ mà nó cũng ngon. Chấm điểm 7/10",
                R.drawable.img_stra ));
        arrList.add(new Fruit("Táo",
                "Quả này hơi ngọt, nhiều tinh bột, cắn một miếng là thành logo của apple"
                        + ". Chấm điểm 8/10",
                R.drawable.img_apple_cartoon ));
        arrList.add(new Fruit("Chuối",
                "Quả này ngọt lắm, ngonnnn. Chấm điểm 9/10",
                R.drawable.img_banana_cartoon ));
        arrList.add(new Fruit("cam",
                "Quả này hơi chua, mà nó cũng có lúc ngọt cơ mà nó cũng ngon. Chấm điểm 7/10",
                R.drawable.img_orange_cartoon ));
        arrList.add(new Fruit("Dưa hấu",
                "Quả này tuyệt vời. Chấm điểm 10/10",
                R.drawable.img_watermelon_cartoon ));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();

        fruitAdapter = new ListViewFruitAdapter(this,
                R.layout.activity_line_fruit, arrList);
        lv_main.setAdapter(fruitAdapter);
    }
}