# Android_Timber (logs)
### This a project in android studio made in Java, the purpose is to use Timber to facilitate the use of the logs 

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

You can Check the java code here using TImber:

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

Additional to this, I had to make the implementatio of Timber in the dependency which is located in Build.graddle(module:app)
![image](https://github.com/juliaigz/Android_Timber/assets/40221707/603fc75a-a09b-4f78-9d6f-25bdace01d0e)

Finally to implement Timber is mandatory to modify the Manifes Folder, in the Application we have to put this code:
```bash
  android:name=".TimberClass1"
```
![image](https://github.com/juliaigz/Android_Timber/assets/40221707/fd890a46-b0db-46b7-bef8-5d9f881a74ea)

You can check the logs here: 

![image](https://github.com/juliaigz/Android_Timber/assets/40221707/16aff680-c0b5-48b6-882c-897c36586fbf)
