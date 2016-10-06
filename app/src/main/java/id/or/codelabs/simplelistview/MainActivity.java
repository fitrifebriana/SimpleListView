package id.or.codelabs.simplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] songs = new String[]{
        "A Sky Full of Stars - Coldplay",
        "A Thousand Years - Christina Perri",
        "Teman Hidup - Tulus",
        "Back at One - Brian McKnight",
        "Same Old Love - Selena Gomez",
        "Purple Lamborghini - Skrillex ft Rick Ross",
        "Photograph - Ed Sheeran"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem = (ListView)findViewById(R.id.lv_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, songs);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), songs[i] + " is Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
