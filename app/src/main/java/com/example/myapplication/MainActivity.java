package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.ConcurrentRowProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG  = MainActivity.class.getName();
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            long start = System.currentTimeMillis();
            CsvParserSettings parserSettings = new CsvParserSettings();
            parserSettings.setLineSeparatorDetectionEnabled(true);
//            BeanListProcessor<WorldPOP> rowProcessor = new BeanListProcessor<WorldPOP>(WorldPOP.class);
            BeanListProcessor<RfidCsvObject> rowProcessor = new BeanListProcessor<RfidCsvObject>(RfidCsvObject.class);
            parserSettings.setProcessor(new ConcurrentRowProcessor(rowProcessor));
            parserSettings.setHeaderExtractionEnabled(true);
            /**
             * Replace the actual size of the datafile instead of "300000".
             */
            parserSettings.setNumberOfRecordsToRead(300000);
            CsvParser parser = new CsvParser(parserSettings);
            Log.d(TAG, "#############################################: File Parsing Started");
            /**
             * Place the datafile in device's memory.
             * Replace the name of file with desired file instead of "worldcitiespopwithids.csv".
             */
            parser.parse(new File(Environment.getExternalStorageDirectory(), "worldcitiespopwithids.csv"));
            Log.d(TAG, "#############################################: File Parsing Completed");
            List<RfidCsvObject> beans = rowProcessor.getBeans();
            Log.d(TAG, "#############################################: Total Items Parsed "+beans.size());
            Log.d(TAG, "#############################################: Item ID to Search [300000]");
            /**
             * Provide the Sample Serial to be searched. instead of "300000"
             */
            RfidCsvObject wp = beans.parallelStream().filter(e->e.getSerial().equals("300000")).findAny().get();
//            WorldPOP wp = beans.parallelStream().filter(e->e.getId().equals("300000")).findAny().get();
            Log.d(TAG, "#############################################: Item Found "+wp);
            Log.d(TAG, "#############################################: "+"Time taken [" + (System.currentTimeMillis() - start)/1000 + " second]");
        });
    }
}
