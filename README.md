# Android_Timber (logs)  / widgets 
### This a project in android studio made in Java, the purpose is to use Timber to facilitate the use of the logs 
### The second part of the exercise will be to create an app that shows 4 images and then when clicking one of them It will show a second screen where it show the image in big and 2 buttons , one to go back , and the other one to cloese the app. 

Introduction

Logging is an essential aspect of Android development, providing valuable insights and debugging information during the development and maintenance of applications. However, managing logs effectively can be a challenging task. To streamline this process, Android_Timber leverages the Timber library to enhance and simplify logging in Android applications.

Features

Android_Timber offers the following features to facilitate logging:

1. Easy Integration
Android_Timber seamlessly integrates Timber into your Android Studio project. With just a few simple steps, you can start using Timber to manage your logs efficiently.

2. Simplified Logging Calls
Using Android_Timber, you can replace complex and verbose logging calls with concise and readable Timber methods. This allows you to focus more on the actual logging content and less on the boilerplate code.

3. Flexible Logging Levels
Android_Timber provides flexible logging levels, including debug, info, warning, error, and verbose. You can easily set the desired log level to filter the logging output according to your needs.

4. Customizable Log Format
Android_Timber allows you to customize the log format to match your preferences. You can define your own log message format, including timestamp, log level, tag, and the actual log content, making it easier to parse and analyze logs.

5. Tag Management
Android_Timber simplifies tag management by automatically generating tags based on the calling class, method, and line number. This eliminates the need for manual tag creation, reducing the chances of errors and inconsistencies in your logging.

First, I had to make the implementatio of Timber in the dependency which is located in Build.graddle(module:app)

![image](https://github.com/juliaigz/Android_Timber/assets/40221707/603fc75a-a09b-4f78-9d6f-25bdace01d0e)

Second lets create the class Timber

![image](https://github.com/juliaigz/Android_Timber/assets/40221707/7df5bde6-af00-42fa-a9da-9f8c46e52535)


You can Check the java code in the MainActivity using TImber:
```bash
public class MainActivity extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("Activity Iniciated");        
    }
    
    @Override
    protected void onResume(){
        super.onResume();
        Timber.d("Activity resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Timber.d("Activity paused");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Timber.d("Activity started");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Timber.d("Activity stopped");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Timber.d("Activity Destroyed");
    }
}
```


Finally to implement Timber is mandatory to modify the Manifes Folder, in the Application we have to put this code:
```bash
  android:name=".TimberClass1"
```
![image](https://github.com/juliaigz/Android_Timber/assets/40221707/fd890a46-b0db-46b7-bef8-5d9f881a74ea)

When we run the application we can check the logs in the Logcat;  You can check the logs in ths image: 

![image](https://github.com/juliaigz/Android_Timber/assets/40221707/16aff680-c0b5-48b6-882c-897c36586fbf)



# WIDGETS
# Second part of the exercise

This exercise is about to create an app that shows 4 images and then when clicking one of them It will show a second screen where it show the image in big and 2 buttons , one to go back , and the other one to cloese the app. 

![image](https://github.com/juliaigz/Android_Timber/assets/40221707/2da43266-9d22-41a0-bcf9-2179bc3fa80d)

![image](https://github.com/juliaigz/Android_Timber/assets/40221707/2a838920-4feb-4fd2-931a-24f54966f82d)

First Step 

Lets modify the MainActivity.class 

```bash
public class MainActivity extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);

        Timber.d("Activity Iniciated");
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               callActivity2(""+ R.drawable.baseline_brightness_4_24);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callActivity2(""+ R.drawable.baseline_coffee_24);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callActivity2(""+ R.drawable.baseline_airplanemode_active_24);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callActivity2(""+ R.drawable.baseline_brightness_7_24);
            }
        });
    }
    protected void callActivity2(String image){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("imageX",image);
        startActivity(intent);
    }
    @Override
    protected void onResume(){
        super.onResume();
        Timber.d("Activity resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Timber.d("Activity paused");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Timber.d("Activity started");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Timber.d("Activity stopped");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Timber.d("Activity Destroyed");
    }
}
```

Second Step 

Lets modify MainActivity2, and connect it to MainActivity 

```bash 
public class MainActivity2 extends AppCompatActivity {
    ImageView imageFinal;
    Button buttonBack;
    Button buttonClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        int idImage =Integer.parseInt(intent.getStringExtra("imageX"));
        imageFinal=(ImageView) findViewById(R.id.imageFinal);
        buttonBack=(Button) findViewById(R.id.buttonBack);
        buttonClose=(Button) findViewById(R.id.buttonClose);

        imageFinal.setImageResource(idImage);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(back);
            }
        });

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}
```






